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

	}//Fin constructor

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

	public String pokemonEncontrado(){

		Random aleatorios = new Random();

		//String tipoPokemonComparar;
		String whichPokeIsIt = "";
		int tipoPoke = aleatorios.nextInt(10)+1;
		int whichPoke = aleatorios.nextInt(5)+1;

		switch(tipoPoke){

			case 1:

				tipo = "Acero";

			if(whichPoke == 1){

				whichPokeIsIt = "aaron";

			} else if (whichPoke == 2){

				whichPokeIsIt = "jirachi";

			}else if (whichPoke == 3){

				whichPokeIsIt = "cufant";

			}else if (whichPoke == 4){

				whichPokeIsIt = "meltan";

			}else if (whichPoke == 5){

				whichPokeIsIt = "klink";

			}//Fin if whichPoke

			break;

		case 2: 

			tipo = "Dragón";

			if(whichPoke == 1){

				whichPokeIsIt = "dragonite";

			} else if (whichPoke == 2){

				whichPokeIsIt = "latios";

			}else if (whichPoke == 3){

				whichPokeIsIt = "axew";

			}else if (whichPoke == 4){

				whichPokeIsIt = "dreepy";

			}else if (whichPoke == 5){

				whichPokeIsIt = "goomy";

			}//Fin if whichPoke

			break;

		case 3:

			tipo = "Eléctrico";

			if(whichPoke == 1){

				whichPokeIsIt = "pikachu";

			} else if (whichPoke == 2){

				whichPokeIsIt = "raichu";

			}else if (whichPoke == 3){

				whichPokeIsIt = "voltorb";

			}else if (whichPoke == 4){

				whichPokeIsIt = "emolga";

			}else if (whichPoke == 5){

				whichPokeIsIt = "rotom";

			}//Fin if whichPoke

			break;

		case 4:

			tipo = "Fantasma";

			if(whichPoke == 1){

				whichPokeIsIt = "gastly";

			} else if (whichPoke == 2){

				whichPokeIsIt = "drifloon";

			}else if (whichPoke == 3){

				whichPokeIsIt = "yamask";

			}else if (whichPoke == 4){

				whichPokeIsIt = "chandelure";

			}else if (whichPoke == 5){

				whichPokeIsIt = "sandygast";

			}//Fin if whichPoke

			break;

		case 5:

			tipo = "Lucha";

			if(whichPoke == 1){

				whichPokeIsIt = "machamp";

			} else if (whichPoke == 2){

				whichPokeIsIt = "pancham";

			}else if (whichPoke == 3){

				whichPokeIsIt = "mankey";

			}else if (whichPoke == 4){

				whichPokeIsIt = "clobbopus";

			}else if (whichPoke == 5){

				whichPokeIsIt = "falinks";

			}//Fin if whichPoke

			break;

		case 6:

			tipo = "Normal";

			if(whichPoke == 1){

				whichPokeIsIt = "pidgey";

			} else if (whichPoke == 2){

				whichPokeIsIt = "jigglypuff";

			}else if (whichPoke == 3){

				whichPokeIsIt = "ditto";

			}else if (whichPoke == 4){

				whichPokeIsIt = "girafarig";

			}else if (whichPoke == 5){

				whichPokeIsIt = "kecleon";

			}//Fin if whichPoke

			break;

		case 7:

			tipo = "Psíquico";

			if(whichPoke == 1){

				whichPokeIsIt = "mew";

			} else if (whichPoke == 2){

				whichPokeIsIt = "wobbuffet";

			}else if (whichPoke == 3){

				whichPokeIsIt = "uxie";

			}else if (whichPoke == 4){

				whichPokeIsIt = "abra";

			}else if (whichPoke == 5){

				whichPokeIsIt = "solosis";

			}//Fin if whichPoke

			break;

		case 8: 

			tipo = "Roca";

			if(whichPoke == 1){

				whichPokeIsIt = "golem";

			} else if (whichPoke == 2){

				whichPokeIsIt = "onix";

			}else if (whichPoke == 3){

				whichPokeIsIt = "pupitar";

			}else if (whichPoke == 4){

				whichPokeIsIt = "lunatone";

			}else if (whichPoke == 5){

				whichPokeIsIt = "lileep";

			}//Fin if whichPoke

			break;

		case 9:

			tipo = "Tierra";

			if(whichPoke == 1){

				whichPokeIsIt = "diglett";

			} else if (whichPoke == 2){

				whichPokeIsIt = "cubone";

			}else if (whichPoke == 3){

				whichPokeIsIt = "trapinch";

			}else if (whichPoke == 4){

				whichPokeIsIt = "mudbray";

			}else if (whichPoke == 5){

				whichPokeIsIt = "gliscor";

			}//Fin if whichPoke

			break;

		case 10:

			tipo = "Volador";

			if(whichPoke == 1){

				whichPokeIsIt = "tornadus";

			} else if (whichPoke == 2){

				whichPokeIsIt = "tornadus";

			}else if (whichPoke == 3){

				whichPokeIsIt = "noibat";

			}else if (whichPoke == 4){

				whichPokeIsIt = "cramorant";

			} else {

				whichPokeIsIt = "rookidee";

			}//Fin if whichPoke

			break;

		}//Fin switch qué tipo de pokemón

		return whichPokeIsIt;
		//System.out.println("Vaya, es " + whichPokeIsIt);

	}//Fin método pokemonEncontrado

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

	public void checaHP(int hp){

		if(this.hp <= 50){

			System.out.println("¡Chispas! " + nombre + " se ve que necesita un poco de regeneración");

		} else if(this.hp <= 30){

			System.out.println("Es fuertemente recomendable regenerar al pokemón");

		} else if(this.hp > 5 && this.hp < 10){

			System.out.println("Abre tu bolsita!! :(");

		} else if (this.hp == 0 || this.hp < 0){

			System.out.println("RIP " + nombre);
			System.out.println("(x_x)");
			System.exit(0);

		}//Fin if hp < 50

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

	public void comparaPokemones(String tipoOtroPoke) {

		System.out.println("\n¡Mira! Nos hemos encontrado a otro pokemón");
		System.out.println("Preguntémosle su nombre...");

		//System.out.println("Vaya, es " + pokemonEncontrado() + "!");

		String foundPoke = pokemonEncontrado();

		if(this.getTipo().equals(tipoOtroPoke)) {

			System.out.println("Son del mismo tipo :)");

		}else if(this.getTipo().equals("Acero")){

			if(this.tipo.equals("Hielo") || this.tipo.equals("Roca")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Tierra") || this.tipo.equals("Lucha")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Dragón")){

			if(this.tipo.equals("Hielo")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte, pareces lagartija.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Eléctrico")){

			if(this.tipo.equals("Volador")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Tierra")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Fantasma")){

			if(this.tipo.equals("Psíquico")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else {

				System.out.println("Mucho gusto en conocerte.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Lucha")){

			if(this.tipo.equals("Hielo") || this.tipo.equals("Normal") || this.tipo.equals("Roca") || this.tipo.equals("Acero")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Volador") || this.tipo.equals("Psíquico")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte. ¿Usas máscara de luchador?");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Normal")){

			if(this.tipo.equals("Lucha")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Mucho gusto en conocerte.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Psíquico")){

			if(this.tipo.equals("Lucha")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Fantasma")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte. ¿Estudiaste Psicología?");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Roca")){

			if(this.tipo.equals("Hielo") || this.tipo.equals("Volador")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Tierra") || this.tipo.equals("Lucha") || this.tipo.equals("Acero")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte. Tas pesado");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Tierra")){

			if(this.tipo.equals("Eléctrico") || this.tipo.equals("Roca") || this.tipo.equals("Acero")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Hielo")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte.");

			}//Fin if quién gana

		}else if(this.getTipo().equals("Volador")){

			if(this.tipo.equals("Lucha")){

				System.out.println(tipoOtroPoke + " es vulnerable ante " + foundPoke);

			} else if(this.tipo.equals("Hielo") || this.tipo.equals("Eléctrico") || this.tipo.equals("Roca")){

				System.out.println(foundPoke + " es vulnerable ante " + tipoOtroPoke);

			} else {

				System.out.println("Gusto en conocerte. A ver, vuela");

			}//Fin if quién gana	

		}//Fin if comparar bn

	}//Fin método comparaPokemones

	public void caerse(String pokemon){

		Random aleatorios = new Random();

		int cuantoDolio = aleatorios.nextInt(11)+10;
		this.hp -= cuantoDolio;

		System.out.println("\n¡Auch! Hemos caído en un hoyo. Tu HP es de " + getHP());

	}//Fin método caerse

	public String toString(){

		return "Nombre: " + nombre + "\nTipo: " + tipo;

	}//Fin toString

}//Fin class
