import java.util.Scanner;

public class Collatz{

	public static void main (String [] args){

		boolean centinela = true;
		Scanner tecladitto = new Scanner(System.in);

		System.out.println("Este programa calcula la sucesión de Collatz");
		System.out.println("Ingresa un número (n) con el cuál desees empezar: ");

		int num = tecladitto.nextInt();

		System.out.println();
		System.out.println(num);

		while(num != 1){

			while(num % 2 == 0 && num != 1){

				int div = num/2;
				num = div;
				System.out.println(num);

			}//Fin while par

			while(num % 2 != 0 && num != 1){

				int multi = 3*num+1;
				num = multi;
				System.out.println(num);

			}//Fin while impar

		}//Fin while resultado == 1

	}//Fin main

}//Fin class
