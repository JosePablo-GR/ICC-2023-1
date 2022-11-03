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

	public static void pokemonEncontrado(){

		Random aleatorios = new Random();

		String tipoPokemonComparar;
		String whichPokeIsIt = "";
		int tipoPoke = aleatorios.nextInt(10)+1;
		int whichPoke = aleatorios.nextInt(5)+1;

		switch(tipoPoke){

			case 1:

			tipoPokemonComparar = "Acero";

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

			tipoPokemonComparar = "Dragón";

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

			tipoPokemonComparar = "Eléctrico";

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

			tipoPokemonComparar = "Fantasma";

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

			tipoPokemonComparar = "Lucha";

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

			tipoPokemonComparar = "Normal";

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

			tipoPokemonComparar = "Psíquico";

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

			tipoPokemonComparar = "Roca";

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

			tipoPokemonComparar = "Tierra";

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

			tipoPokemonComparar = "Volador";

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

		System.out.println("Vaya, es " + whichPokeIsIt);

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

	}//Fin getBolsitaFullH

	public void comerOran(){

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

	public void fuljil(){

		setHP(100);

		if(this.hp >= 70){

			System.out.println("Convenía mejor la Oran, pero bueno");

		} else {

			System.out.println("Ya estamos, listos para para seguir:)");

		}//Fin if no puedes +30

	}//Fin método fuljil

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

			System.out.println(pokemon + " se envenenó");
			this.hp -= 15;
			aux2 = 0;

		} else if (malito == 3 || malito == 4 || malito == 5){

			System.out.println(pokemon + " se quemó");
			aux2 = 0;
			this.hp -= 20;

		} else if (malito == 6){

			System.out.println(pokemon + " se congeló");
			aux2 = 0;
			this.hp -= 10;

		} else {

			System.out.println("A " + pokemon + " no le pasó nada");
			aux2 = 0;

		}//Fin if qué le pasó al pobre pokemón

		if(aux == true && aux2 == 5){

			System.out.println(pokemon + " se congeló");
			this.hp -= 10;

		} else if(aux == false && aux2 == 5){

			System.out.println("A " + pokemon + " no le pasó nada");

		}//Fin if

	}//Fin método probabilidadEnfermarse

	public void comparaPokemones(String pokemonComparacion){

		System.out.println("\n¡Mira! Nos hemos encontrado a otro pokemón");
		System.out.println("Preguntémosle su nombre...");

		if(!(whichPokeIsIt.equals(pokemonComparacion))){

			pokemonEncontrado();

		}//Fin if somos el mismo

		if(tipoPokemonComparar.equals(this.tipo)){}//Fin if comparar bn

	}//Fin método comparaPokemones

	public void caerse(String pokemon){

		Random aleatorios = new Random();

		int cuantoDolio = aleatorios.nextInt(11)+10;

		System.out.println("\n¡Auch! Hemos caído en un hoyo");

		this.hp -= cuantoDolio;

	}//Fin método caerse

	public String toString(){

		return "Nombre: " + nombre + "\nTipo: " + tipo;
	}//Fin toString

}//Fin class
