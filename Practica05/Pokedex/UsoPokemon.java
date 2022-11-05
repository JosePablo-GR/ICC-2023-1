import java.util.Scanner;
import java.util.Random;

class UsoPokemon{

	public static void contexto(){

		System.out.println("El Bosque Lumirinto es un bosque oscuro cuya");
		System.out.println("vegetación es lo suficientemente densa como para evitar que la luz");
		System.out.println("del exterior no llegue al suelo, por lo que la única fuente de");
		System.out.println("iluminación son algunos de los varios tipos de setas luminiscentes.");
		System.out.println("\nPodemos encontrar hoyos profundos creados por los chefs locales donde");
		System.out.println("calientan tamales y preparan más platillos. También encontramos variedad de arbustos");
		System.out.println("de los cuales alguno nos puede envenenar, unos con un toque gélido e incluso");
		System.out.println("hay otros que nos pueden quemar.\n");

	}//Fin contexto

	public static void quienPoke(String pokemonComparacion){

		Pokemon pokemoncito = new Pokemon();

		if(pokemoncito.pokemonEncontrado().equals(pokemonComparacion)){

			System.out.println("Vaya, somos... nosotros!! :o");
			System.out.println("Claro.. Somos tan populares que hicieron un clon nuestro");

		} else {

			System.out.println("Vaya, es " + pokemoncito.pokemonEncontrado() + "!");

		}//Fin if somos el mismo

	}//Fin método quienPoke

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		char siOno;
		boolean yaElegiste = false;

		System.out.println("Bienvenido a Build-A-Poke");
		System.out.println("Selecciona algún tipo para ver los pokemones de ese tipo, luego escogerás");

		while(!yaElegiste){

		System.out.println("1. Acero");
		System.out.println("2. Dragón");
		System.out.println("3. Eléctrico");
		System.out.println("4. Fantasma");
		System.out.println("5. Lucha");
		System.out.println("6. Normal");
		System.out.println("7. Psíquico");
		System.out.println("8. Roca");
		System.out.println("9. Tierra");
		System.out.println("10. Volador");
		System.out.println("11. Agua");
		System.out.println("12. Hielo");
		System.out.println("13. Planta");
		System.out.println("14. Bicho");
		System.out.println("15. Fuego");
		System.out.println("16. Hada");
		System.out.println("17. Veneno");
		System.out.println("18. Siniestro");

		int queTipo = entrada.nextInt();

		switch(queTipo){

		case 1:

			System.out.println("Aaron, Jirachi, Cufant, Meltan, Klink");

			break;

		case 2: 

			System.out.println("Dragonite, Latios, Axew, Dreepy, Goomy");

			break;

		case 3:

			System.out.println("Pikachu, Raichu, Voltorb, Emolga, Rotom");

			break;

		case 4:

			System.out.println("Gastly, Drifloon, Yamask, Chandelure, Sandygast");

			break;

		case 5:

			System.out.println("Machamp, Pancham, Mankey, Clobbopus, Falinks");

			break;

		case 6:

			System.out.println("Pidgey, Jigglypuff, Ditto, Girafarig, Kecleon");

			break;

		case 7:

			System.out.println("Mew, Wobbuffet, Uxie, Abra, Solosis");

			break;

		case 8: 

			System.out.println("Golem, Onix, Pupitar, Lunatone, Lileep");

			break;

		case 9:

			System.out.println("Diglett, Cubone, Trapinch, Mudbray, Gliscor");

			break;

		case 10:

			System.out.println("Tornadus, Noibat, Cramorant, Rookidee");

			break;

		case 11: 

			System.out.println("Squirtle, Psyduck, Poliwrath, Seel, Magikarp");

			break;

		case 12:

			System.out.println("Snom, Cetitan, Glalie, Jynx, Bergmite");

			break;

		case 13:

			System.out.println("Bellsprout, Oddish, Gloom, Cherrim, Rillaboom");

			break;

		case 14:

			System.out.println("Paras, Caterpie, Venemoth, Shelmet, Dotteler");
			break;

		case 15:

			System.out.println("Charmander, Vulpix, Torchic, Numel, Tepig");
			break;

		case 16:

			System.out.println("Fodough, Clefairy, Togepi, Floette, Spritzee");
			break;

		case 17:

			System.out.println("Ekans, Arbok, Zubat, Grimer, Gulpin");
			break;

		case 18:

			System.out.println("Murkrow, Absol, Vullaby, Deino, Inkay");
			break;

		default:

			System.out.println("Esa opción no coincide");
			//yaElegiste = true;

			break;

		}//Fin switch

		System.out.println("¿Ya sabes cuál elegir? [S/N]");

			siOno = entrada.next().toUpperCase().charAt(0);
			System.out.println();

			if(siOno == 'S'){

				yaElegiste = true;

			}//Fin if while

		}//Fin while ya elegiste

		System.out.println("Muy bien, escribe el nombre de tu pokemon: ");

		String quePoke = entrada.next().toLowerCase();

		String tipo = "";
		boolean loHizoBn;

		if(quePoke.equals("aaron") || quePoke.equals("jirachi") ||
		quePoke.equals("cufant") || quePoke.equals("meltan") ||
		quePoke.equals("klink")){

			tipo = "Acero";
			loHizoBn = true;

		} else if(quePoke.equals("dragonite") || quePoke.equals("latios") ||
		quePoke.equals("axew") || quePoke.equals("dreepy") ||
		quePoke.equals("goomy")){

			tipo = "Dragón";
			loHizoBn = true;

		} else if(quePoke.equals("pikachu") || quePoke.equals("raichu") ||
		quePoke.equals("voltorb") || quePoke.equals("emolga") ||
		quePoke.equals("rotom")){

			tipo = "Eléctrico";
			loHizoBn = true;

		}else if(quePoke.equals("gastly") || quePoke.equals("drifloon") ||
		quePoke.equals("yamask") || quePoke.equals("chandelure") ||
		quePoke.equals("sandygast")){

			tipo = "Fantasma";
			loHizoBn = true;

		}else if(quePoke.equals("machamp") || quePoke.equals("pancham") ||
		quePoke.equals("mankey") || quePoke.equals("clobbopus") ||
		quePoke.equals("falinks")){

			tipo = "Lucha";
			loHizoBn = true;

		}else if(quePoke.equals("pidgey") || quePoke.equals("jigglypuff") ||
		quePoke.equals("ditto") || quePoke.equals("girafarig") ||
		quePoke.equals("kecleon")){

			tipo = "Normal";
			loHizoBn = true;

		}else if(quePoke.equals("mew") || quePoke.equals("wobbuffet") ||
		quePoke.equals("uxie") || quePoke.equals("abra") ||
		quePoke.equals("solosis")){

			tipo = "Psíquico";
			loHizoBn = true;

		}else if(quePoke.equals("golem") || quePoke.equals("onix") ||
		quePoke.equals("pupitar") || quePoke.equals("lunatone") ||
		quePoke.equals("lileep")){

			tipo = "Roca";
			loHizoBn = true;

		}else if(quePoke.equals("diglett") || quePoke.equals("cubone") ||
		quePoke.equals("trapinch") || quePoke.equals("mudbray") ||
		quePoke.equals("gliscor")){

			tipo = "Tierra";
			loHizoBn = true;

		}else if(quePoke.equals("tornadus") || quePoke.equals("noibat") ||
		quePoke.equals("cramorant") || quePoke.equals("rookidee")){

			tipo = "Volador";
			loHizoBn = true;

		}else if(quePoke.equals("squirtle") || quePoke.equals("psyduck") ||
		quePoke.equals("poliwrath") || quePoke.equals("seel") || quePoke.equals("magikarp")){

			tipo = "Agua";
			loHizoBn = true;

		}else if(quePoke.equals("snom") || quePoke.equals("cetitan") ||
		quePoke.equals("glalie") || quePoke.equals("jynx") || quePoke.equals("bergmite")){

			tipo = "Hielo";
			loHizoBn = true;

		}else if(quePoke.equals("bellsprout") || quePoke.equals("oddish") ||
		quePoke.equals("gloom") || quePoke.equals("cherrim") || quePoke.equals("rillaboom")){

			tipo = "Planta";
			loHizoBn = true;

		}else if(quePoke.equals("paras") || quePoke.equals("caterpie") ||
		quePoke.equals("venomoth") || quePoke.equals("shelmet") || quePoke.equals("dottler")){

			tipo = "Bicho";
			loHizoBn = true;

		}else if(quePoke.equals("charmander") || quePoke.equals("vulpix") ||
		quePoke.equals("torchic") || quePoke.equals("numel") || quePoke.equals("tepig")){

			tipo = "Fuego";
			loHizoBn = true;

		}else if(quePoke.equals("fodough") || quePoke.equals("clefairy") ||
		quePoke.equals("togepi") || quePoke.equals("floette") || quePoke.equals("spritzee")){

			tipo = "Hada";
			loHizoBn = true;

		}else if(quePoke.equals("ekans") || quePoke.equals("arbok") ||
		quePoke.equals("zubat") || quePoke.equals("grimer") || quePoke.equals("gulpin")){

			tipo = "Veneno";
			loHizoBn = true;

		}else if(quePoke.equals("murkrow") || quePoke.equals("absol") ||
		quePoke.equals("vullaby") || quePoke.equals("deino") || quePoke.equals("inkay")){

			tipo = "Siniestro";
			loHizoBn = true;

		} else {

			System.out.println();
			System.out.println(quePoke + " no coincide con ninguna opción");
			loHizoBn = false;

		}//Fin if qué pokemón

		int opcion;

		if(loHizoBn){

		System.out.println();
		Pokemon pokemoncito = new Pokemon(quePoke, tipo);
		pokemoncito.setHP(100);
		int getAchePe = pokemoncito.getHP();

		System.out.println(pokemoncito);
		System.out.println("\nRecuerda que cada pokemón viene con una bolsita que contiene: ");
		System.out.println("1 oranberry (+30 hp) y 1 Full Heal (máxima salud)");

		pokemoncito.setBolsitaOran(true);
		pokemoncito.setBolsitaFullH(true);

		int tantasVueltas = aleatorios.nextInt(10)+1;

		System.out.println("\nMuy bien, ahora lo que haremos es dar un paseo por el Bosque Lumirinto");
		System.out.println("¿Quieres información sobre este? 1 = sí / 2 = omitir");
		opcion = entrada.nextInt();

		if(opcion == 1){

			contexto();

		} else if(opcion != 2){

			System.out.print("Supondré que quieres omitir");
			System.out.println();

		}//Fin if contexto

		System.out.println("¿Cuántas vueltas quieres dar? Para un pokemón así recomiendan " + tantasVueltas + " o más ¯|_(ツ)_|¯");
		int vueltas = entrada.nextInt();

		double medioCamino = (int) vueltas/2; 

		if(vueltas < tantasVueltas){

			System.out.println("\nSon " + tantasVueltas + " o más ._.");

		} else {

			System.out.println("\nOkay, tengamos cuidado porque existen varios peligros dentro del bosque...");

		}//Fin if vueltas

		int casualidades;

		while(vueltas >= 1){

			vueltas--;

			pokemoncito.checaHP(pokemoncito.getHP());
			//pokemoncito.checaHP(pokemoncito.getHP());
			casualidades = aleatorios.nextInt(6)+1;

			if(casualidades == 2){

				pokemoncito.probabilidadEnfermarse(quePoke);

			} else if(casualidades == 4){

				pokemoncito.caerse(quePoke);

			} else if(casualidades == 6){

				pokemoncito.comparaPokemones(tipo);
				quienPoke(quePoke);

			} else {

				System.out.println("\nCaminando...  Tu HP es de " + pokemoncito.getHP());

			}//Fin if qué problemas

			if(vueltas == medioCamino){

				System.out.println("\nMitad del camino, nos faltan " + vueltas + " vueltas");
				System.out.println("¿Cómo ves, quieres usar algo de tu bolsita? [S/N]");
				siOno = entrada.next().toUpperCase().charAt(0);

					if(siOno == 'S'){

						System.out.println("1.Oranberry\n2.Full Heal");
						opcion = entrada.nextInt();

						if(opcion == 1){

							pokemoncito.comerOran(pokemoncito.getHP());
							pokemoncito.setBolsitaOran(false);

						} else if(opcion == 2) {

							pokemoncito.fuljil();
							System.out.println("Ya estamos, listos para para seguir:)");
							pokemoncito.setBolsitaFullH(false);

						}//Fin if qué usará

					}//Fin if bolsita

				}//Fin if else mitadCamino

			}//Fin while caminando

			System.out.println("\nTus vueltas han acabado :v");

		}//Fin if loHizoBn

	}//Fin main

}//Fin class
