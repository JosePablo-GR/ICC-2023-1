import java.util.Scanner;
import java.util.Random;

public class Pokemon{

	//Atributos 
	String nombre;
	String tipo;
	String estadoDeSalud;
	int hp;
	boolean bolsitaOran;
	boolean bolsitaFullH;
	//String[] bolsita = new String [2];

	public Pokemon(){}//Fin constructor solito

	public Pokemon(String nombre, String tipo){

		this.nombre = nombre;
		this.tipo = tipo;

	}//Fin constructor nombre y tipo

	public Pokemon(String tipo){

		this.tipo = tipo;

	}//Fin constructor tipo

	public Pokemon(String nombre, String tipo, String estadoDeSalud, int hp, boolean bolsitaOran, boolean bolsitaFullH){

		this.nombre = nombre;
		this.tipo = tipo;
		this.estadoDeSalud = estadoDeSalud;
		this.hp = hp;
		this.bolsitaOran = bolsitaOran;
		this.bolsitaFullH = bolsitaFullH;
		//bolsita [0] = "oranberry";
		//bolsita [1] = "Full Heal";

	}//Fin constructor con parámetros

	//Setters
	public void setNombre(String nombre){

		this.nombre = nombre;

	}//Fin setNombre

	public void setTipo(String tipo){

		this.tipo = tipo;

	}//Fin setTipo

	public void setEstadoDeSalud(String estadoDeSalud){

		this.estadoDeSalud = estadoDeSalud;

	}//Fin setEstadoDeSalud

	public void setHP(int hp){

		this.hp = hp;

	}//Fin setHP

	public void setBolsitaOran(boolean bolsitaOran){

		this.bolsitaOran = bolsitaOran;

	}//Fin setBolsitaOran

	public void setBolsitaFullH(boolean bolsitaFullH){

		this.bolsitaFullH = bolsitaFullH;

	}//Fin setBolsitaFullH

	//Getters
	public String getNombre(){

		return nombre;

	}//Fin getNombre

	public String getTipo(){

		return tipo;

	}//Fin getTipo

	public String getEstadoDeSalud(){

		return estadoDeSalud;

	}//Fin getEstadoDeSalud

	public int getHP(){

		return hp;

	}//Fin getHP

	public boolean getBolsitaOran(){

		return bolsitaOran;

	}//Fin getBolsitaOran

	public boolean getBolsitaFullH(){

		return bolsitaFullH;

	}//Fin getBolsitaFullH+

	public void fuljil(){

		setHP(100);

	}//Fin método

	public void comerOran(int hp){

		if(this.hp == 70){

			System.out.println("Tenías 70% de HP, por lo que ya estás al 100%");
			setHP(100);

		} else if(this.hp > 70){

			System.out.println("Tienes más del 70%, por lo que al comerla se te ha regenerado lo más que se pudo");
			setHP(100);

		} else {

			this.hp += 30;
			System.out.println("Yummy, se te regeneró un 30% de tu HP");

		}//Fin if no puedes +30

	}//Fin método comer oran

	public void usoBolsita(){

		Scanner entrada = new Scanner(System.in);

		int opcion;

			char siOno = entrada.next().toUpperCase().charAt(0);

			if(siOno == 'S'){

			if(this.bolsitaOran == true && this.bolsitaFullH == true){

				System.out.println("1.Oranberry\n2.Full Heal");
				opcion = entrada.nextInt();

					if(opcion == 1){

						comerOran(getHP());
						setBolsitaOran(false);

					} else if(opcion == 2) {

						fuljil();
						System.out.println("Ya estamos, listos para para seguir:)");
						setBolsitaFullH(false);

					}//Fin if qué usará

			} else if(this.bolsitaOran == false && this.bolsitaFullH == true){

				System.out.println("2.Full Heal");
				opcion = entrada.nextInt();

					if(opcion == 2){

						fuljil();
						System.out.println("Ya estamos, listos para para seguir:)");
						setBolsitaFullH(false);						

					}//Fin if qué usará

			} else if(this.bolsitaOran == true && this.bolsitaFullH == false){

				System.out.println("1.Oranberry");
				opcion = entrada.nextInt();

					if(opcion == 1){

						comerOran(getHP());
						setBolsitaOran(false);

					}//Fin if qué usará

			} else {

				System.out.println("Ya no tienes items :(");

			}//Fin if bolsitas

			} else {

				//double sumita = 0.1;
				this.hp += 0.1;

			}//Fin if dice que Sí

	}//Fin método usoBolsita

	public void checaHP(){

		if(this.hp == 100){

			//System.out.println("HP al 100 :)");

		} else if(this.hp < 100 && this.hp >= 61) {

			System.out.println("Pokemón con daño pero no grave");

		} else if(this.hp <= 60 && this.hp >= 40){

			System.out.println("¡Chispas! " + nombre + " se ve que necesita un poco de regeneración");

		} else if(this.hp < 40 && this.hp >= 10){

			System.out.println("Es fuertemente recomendable regenerar al pokemón");

		} else if(this.hp >= 5 && this.hp < 10){

			System.out.println("Abre tu bolsita!! :(");

		} else {

			//setHP(0);
			System.out.println("\nRIP " + nombre);
			System.out.println("(x_x)");
			System.exit(1);

		}//Fin if

		if(this.hp == 50 || this.hp == 55 || this.hp == 30 || this.hp == 35 || this.hp == 10 || this.hp == 5){

			System.out.println("\n¿Quieres usar algo de tu bolsita? [S/N]");
			System.out.println("Recuerda que solo puedes usar tus cosas una vez");

			usoBolsita();

		}//Fin if hps bajos

	}//Fin método checaHP

	public void probabilidadEnfermarse(String pokemon){

		boolean aux;
		int aux2;
		Random aleatorios = new Random();

		int random = aleatorios.nextInt(3);

		if(random == 0){

			aux = false;
			aux2 = 5;

		} else if(random == 1){

			aux = true;
			aux2 = 5;

		} else {

			aux = true;
			aux2 = 1;

		}//Fin if probabilidad 

		int malito = aleatorios.nextInt(10)+1;

		System.out.println("\n¡Oh no! Nos hemos topado con un arbusto");

		if(malito == 1 || malito == 2){ // 20% probabilidad envenedado

			this.hp -= 15;
			System.out.println(pokemon + " se envenenó. Tu HP es de " + getHP());
			aux2 = 0;

		} else if (malito == 3 || malito == 4 || malito == 5){

			this.hp -= 20;
			System.out.println(pokemon + " se quemó. Tu HP es de " + getHP());
			aux2 = 0;
			

		} else if (malito == 6){

			this.hp -= 10;
			System.out.println(pokemon + " se congeló. Tu HP es de " + getHP());
			aux2 = 0;

		} else {

			System.out.println("A " + pokemon + " no le pasó nada");
			aux2 = 0;

		}//Fin if qué le pasó al pobre pokemón

		if(aux == true && aux2 == 5){

			this.hp -= 10;
			System.out.println(pokemon + " se congeló. Tu HP es de " + getHP());

		} else if(aux == false && aux2 == 5){

			System.out.println("A " + pokemon + " no le pasó nada");

		}//Fin if

	}//Fin método probabilidadEnfermarse

	public void comparaPokemones(Pokemon tipoPoke1, Pokemon tipoPoke2) {

		if(tipoPoke1.getTipo().equals(tipoPoke2.getTipo())) {

			System.out.println("Son del mismo tipo :)");

		}else if(tipoPoke1.getTipo().equals("Acero")){ //Nosotros somos tipo1

			if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Tierra") || tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Fuego")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Dragón")){

			if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Eléctrico")){

			if(tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Agua")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Tierra")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Fantasma")){

			if(tipoPoke2.getTipo().equals("Psíquico")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Siniestro")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Lucha")){

			if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Normal") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Acero") || tipoPoke2.getTipo().equals("Siniestro")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Psíquico") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Normal")){

			if(tipoPoke2.getTipo().equals("Lucha")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Mucho Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Psíquico")){

			if(tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Veneno")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Fantasma") || tipoPoke2.getTipo().equals("Bicho") || tipoPoke2.getTipo().equals("Siniestro")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Roca")){

			if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Bicho") || tipoPoke2.getTipo().equals("Fuego")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Agua") || tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Tierra") || tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Acero")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Tierra")){

			if(tipoPoke2.getTipo().equals("Eléctrico") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Acero") || tipoPoke2.getTipo().equals("Fuego") || tipoPoke2.getTipo().equals("Veneno")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Agua") || tipoPoke2.getTipo().equals("Planat")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Volador")){

			if(tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Bicho") || tipoPoke2.getTipo().equals("Planta")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Eléctrico") || tipoPoke2.getTipo().equals("Roca")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana	

		}else if(tipoPoke1.getTipo().equals("Agua")){

			if(tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Tierra") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Eléctrico") || tipoPoke2.getTipo().equals("Roca")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana	

		}else if(tipoPoke1.getTipo().equals("Hielo")){

			if(tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Tierra") || tipoPoke2.getTipo().equals("Dragón")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Fuego") || tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Acero")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Planta")){

			if(tipoPoke2.getTipo().equals("Agua") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Tierra")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Bicho") || tipoPoke2.getTipo().equals("Veneno")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Bicho")){

			if(tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Psíquico") || tipoPoke2.getTipo().equals("Siniestro")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Volador") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Fuego")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Fuego")){

			if(tipoPoke2.getTipo().equals("Hielo") || tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Bicho") || tipoPoke2.getTipo().equals("Acero")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Agua") || tipoPoke2.getTipo().equals("Roca") || tipoPoke2.getTipo().equals("Tierra")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Hada")){

			if(tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Dragón") || tipoPoke2.getTipo().equals("Siniestro")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Veneno") || tipoPoke2.getTipo().equals("Acero")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}else if(tipoPoke1.getTipo().equals("Veneno")){

			if(tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Tierra") || tipoPoke2.getTipo().equals("Psíquico")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		} else if(tipoPoke1.getTipo().equals("Siniestro")){

			if(tipoPoke2.getTipo().equals("Psíquico") || tipoPoke2.getTipo().equals("Fantasma")){

				System.out.println(tipoPoke2.getNombre() + " es vulnerable ante " + tipoPoke1.getNombre());

			} else if(tipoPoke2.getTipo().equals("Planta") || tipoPoke2.getTipo().equals("Lucha") || tipoPoke2.getTipo().equals("Hada")){

				System.out.println(tipoPoke1.getNombre() + " es vulnerable ante " + tipoPoke2.getNombre());

			} else {

				System.out.println("Gusto en conocerte. Nunca había conocido a un Pokemón tipo " + tipoPoke2.getTipo());

			}//Fin if quién gana

		}//Fin if comparar bn

	}//Fin método comparaPokemones

	public void caerse(String pokemon){

		Random aleatorios = new Random();

		int nums = aleatorios.nextInt(2)+1;
		int cuantoDolio = nums*5;
		this.hp -= cuantoDolio;

		System.out.println("\n¡Auch! Hemos caído en un hoyo. Tu HP es de " + getHP());

	}//Fin método caerse

	public String toString(){

		return "Nombre: " + nombre + "\nTipo: " + tipo;

	}//Fin toString

}//Fin class
