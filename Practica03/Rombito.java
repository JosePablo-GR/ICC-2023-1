import java.util.Scanner;

public class Rombito{

	public static void main (String [] args){

		Scanner lector = new Scanner(System.in);

		int i = 0;

		System.out.println("Este programa imprime un rombo con 'diametro menor' igual a un número ingresado del teclado");
		System.out.println("Por favor ingresa el número: ");

		int n = lector.nextInt();

		System.out.println("\nRombo: \n");

		while(i <= n){

		for(int j = n-i; j > 0; j--){

			System.out.print(" ");

			}

		for(int k = 0; k < i; k++){

			System.out.print(" *");

		}

		System.out.println("");

		i++;

		}//Fin while ida

		i = 0;

		while(i <= n){

		for(int j = 0; j <= i; j++){

			System.out.print(" ");
		}

		for(int k = n-i-1; k > 0; k--){

			System.out.print(" *");

		}

		System.out.println("");

		i++;

		}//Fin while espejo

	}//Fin main

}//Fin class
