import java.util.Scanner;
import java.util.Random;

public class Proyecto01{

	public static void main(String[] args){

		String usuario;
		String contraseña;
		int contador = 3;
		int aux = 7;
		boolean auxiliar = true;
		boolean auuu = true;
		String contMiguel = "yomero";
		String contProfe = "profesor";
		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();
		Calculadora calcu = new Calculadora();
		Canicas caniquitas = new Canicas();

		System.out.println("Por favor ingresa tu usuario y contraseña");
		System.out.println("Usuario: ");

		usuario = entrada.next();

		System.out.println("Contraseña: ");

		contraseña = entrada.next();

		if(((usuario.equals("Miguel") && (!(contraseña.equals(contMiguel)))))
		 || ((usuario.equals("icc") && (!(contraseña.equals(contProfe)))))){

			boolean otra = true;

			while(otra){

				System.out.println("\nContraseña incorrecta, intenta de nuevo.");
				System.out.println("Te quedan " + contador + " intentos");
				contraseña = entrada.next();

				contador--;

				if(contador == 0 && aux != 7){

					otra = false;
					System.out.println("\nYa valiste, bloqueaste tu cuenta");
					System.out.println("Intenta en 15 minutos(imaginarios)");

				} else if((usuario.equals("Miguel")) && (contraseña.equals(contMiguel))){

					aux = 2;
					otra = false;
					//System.out.println("\nBienvenido a tus datos MIGUEL while");
			System.out.println("\ni. Jugar a las canicas");
			System.out.println("ii. Calculadora");

			auxiliar = false;
			String noLee = entrada.nextLine();
			String op = entrada.nextLine().toLowerCase();
			//int nuevo = Integer.parseInt(String.valueOf(op));

			if(op.equals("1")){

				op = "i";

			} else if(op.equals("2")){

				op = "ii";

			}

			switch(op){

			case "i":

				System.out.println();
				caniquitas.juego();

				break;

			case "ii":

				auuu = false;
				System.out.println();
				calcu.menu();

				break;

			default:

				System.out.println("\nOpción incorrecta");

				break;

			}//Fin switch

				} else if((usuario.equals("icc")) && (contraseña.equals(contProfe))){

					aux = 1;
					otra = false;
					System.out.println();
					calcu.menu();
					
				}//Fin sale ciclo

			}//Fin while otra

		} else if((usuario.equals("Miguel")) && (contraseña.equals(contMiguel))){

			auxiliar = false;
			System.out.println("\ni. Jugar a las canicas");
			System.out.println("ii. Calculadora");

			String noLee = entrada.nextLine();
			String op = entrada.nextLine().toLowerCase();
			//int nuevo = Integer.parseInt(String.valueOf(op));

			if(op.equals("1")){

				op = "i";

			} else if(op.equals("2")){

				op = "ii";

			}

			switch(op){

			case "i":

				System.out.println();
				caniquitas.juego();

				break;

			case "ii":

				System.out.println();
				calcu.menu();

				break;

			default:

				System.out.println("\nOpción incorrecta");

				break;

			}//Fin switch

		} else if((usuario.equals("icc")) && (contraseña.equals(contProfe))){

			System.out.println();
			calcu.menu();

		}//Fin repetir




		if(auxiliar){

			if(usuario.equals("Miguel") && (contraseña.equals(contMiguel))){

			//System.out.println("Hola Miguel!");
			System.out.println("\ni. Jugar a las canicas");
			System.out.println("ii. Calculadora");

			String noLee = entrada.nextLine();
			String op = entrada.nextLine().toLowerCase();
			//int nuevo = Integer.parseInt(String.valueOf(op));

			if(op.equals("1")){

				op = "i";

			} else if(op.equals("2")){

				op = "ii";

			}

			switch(op){

			case "i":

				System.out.println();
				caniquitas.juego();

				break;

			case "ii":

				System.out.println();
				calcu.menu();

				break;

			default:

				System.out.println("\nOpción incorrecta");

				break;

			}//Fin switch

		} else if(usuario.equals("icc") && contraseña.equals(contProfe)){

			//System.out.println("Hola profesor :)");
			System.out.println();
			calcu.menu();

		} else {

			System.out.println("\nNo estás registrado, sorry");

		}//Fin else if contraseñas

		}//Fin auxiliar

	}//Fin main

}//Fin class
