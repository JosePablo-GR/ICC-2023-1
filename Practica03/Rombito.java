import java.util.Scanner;

public class Rombito{

	public static void main (String [] args){

	Scanner lector = new Scanner(System.in);

	System.out.println("Este programa imprime un rombo con 'diametro menor' igual a un número ingresado del teclado");
	System.out.println("Por favor igresa el número: ");

		int n = lector.nextInt();
		
		System.out.println("\nRombo: \n");

		for(int i = 0; i <= n; i++){

			for(int j = n-i; j > 0; j--){

				System.out.print(" ");

			}

			for(int k = 0; k < i; k++){

				System.out.print(" *");

			}

			System.out.println("");

		}//Fin for ida

		for(int i = 0; i <= n; i++){

			for(int j = 0; j <= i; j++){

				System.out.print(" ");
			}

			for(int k = n-i-1; k > 0; k--){

				System.out.print(" *");

			}

			System.out.println("");

		}//Fin for espejo

		

	}//Fin main

}//Fin class
