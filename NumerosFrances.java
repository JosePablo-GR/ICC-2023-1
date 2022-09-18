import java.util.Scanner;

public class NumerosFrances{
	
	public static void main (String [] args){

		Scanner lector = new Scanner(System.in);

		System.out.println("Programa traduce los primeros diez números al frances");

		System.out.println("Por favor ingresa alguno de estos números: ");

		int num = lector.nextInt();

		if (num < 0 || num > 10){

			System.out.println("");
			System.out.println("Solo los primeros diez números");

		}

		switch (num){

		case 0:
			System.out.println("");
			System.out.println(num + " en francés es 'zéro'");
			break;

		case 1:
			System.out.println("");
			System.out.println(num + " en francés es 'un'");
			break;

		case 2:
			System.out.println("");
			System.out.println(num + " en francés es 'deux'");
			break;

		case 3:
			System.out.println("");
			System.out.println(num + " en francés es 'trois'");
			break;

		case 4:
			System.out.println("");
			System.out.println(num + " en francés es 'quatre'");
			break;

		case 5:
			System.out.println("");
			System.out.println(num + " en francés es 'cinq'");
			break;

		case 6:
			System.out.println("");
			System.out.println(num + " en francés es 'six'");
			break;

		case 7:
			System.out.println("");
			System.out.println(num + " en francés es 'sept'");
			break;

		case 8:
			System.out.println("");
			System.out.println(num + " en francés es 'huit'");
			break;

		case 9:
			System.out.println("");
			System.out.println(num + " en francés es 'neuf'");
			break;

		case 10:
			System.out.println("");
			System.out.println(num + " en francés es 'dix'");
			break;

		}//Fin del switch

	}//Fin main

} //Fin class
