import java.util.Scanner;

public class Collatz{

	public static void main (String [] args){

		int resultado = 0;
		int numAux = 0;
		boolean centinela = true;
		boolean unBuleano = true;
		Scanner tecladitto = new Scanner(System.in);

		System.out.println("Este programa calcula la sucesión de Collatz");
		System.out.println("Ingresa un número (n) con el cuál desees empezar: ");

		int num = tecladitto.nextInt();

		System.out.println();
		System.out.println(num);

		numAux += num;

			while(centinela){

			int div = numAux/2;

			System.out.println(div);

			numAux = div;			

			if(numAux % 2 != 0){

			centinela = false;
			}//Fin rompe centinela

		}//Fin while centinela

		centinela = true;

		while(centinela){

			int multi = 3*numAux+1;

			System.out.println(multi);

			numAux = multi;			

			if(numAux % 2 != 0){

			centinela = false;
			}//Fin rompe centinela

		}//Fin while centinela

	}//Fin main

}//Fin class
