import java.util.Scanner;

class CicloPrueba{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa las vueltas");
		int vueltas = sc.nextInt();

		double mitadCamino = (int) vueltas/2;

		while(vueltas >= 1){

			vueltas--;

			if(vueltas != mitadCamino){

				System.out.println("\nCaminando...");

			} else {

				System.out.println("\nMitad del camino, llevamos " + vueltas + " vueltas");

			}//Fin if

		}//Fin for

	}//Fin main

}//Fin class