import java.util.Scanner;
import java.util.Random;

public class Canicas{

	public static void main(String[] args){

		Scanner lector;
		Random aleatorio;
		char pregunta;
		int jugador;
		int compu;
		int apuestaJugador;
		int apuestaCompu;
		boolean par;
		boolean impar;

		aleatorio = new Random();
		lector = new Scanner(System.in);

		//System.out.println("Escoge");

		System.out.println("Acabo de repartir 10 canicas para la computadora y 10 para Miguel");

		jugador = 10;
		compu = 10;

		System.out.println("Miguel, ¿cuántas canicas quieres apostar?");

		apuestaJugador = lector.nextInt();
		jugador -= apuestaJugador;

		System.out.println("\nJugador tiene " + jugador + " canicas");

		System.out.println("\nLa computadora eligirá cuántas canicas apostará: ");

		apuestaCompu = aleatorio.nextInt(10)+1;
		compu -= apuestaCompu;

		System.out.println("Computadora apostó " + apuestaCompu + " canicas");
		//System.out.println("Computadora tiene " + compu + " canicas");

		if(apuestaCompu % 2 == 0){

			par = true;
			impar = false;

		} else {

			impar = true;
			par = false;

		}//Fin parImpar

		System.out.println("\nMiguel, ¿crees que la cantidad que apostó la computadora es par o impar?");
		System.out.println("Escribe 'P' para par o 'I' para impar");

		pregunta = lector.next().toUpperCase().charAt(0);

		if(par && pregunta == 'P' || impar && pregunta == 'I'){

			System.out.println("\nAdivinaste!");
			jugador += apuestaCompu + apuestaJugador;
			
			System.out.println("Ahora tienes " + jugador + " canicas :)");
			System.out.println("Computadora tiene " + compu + " canicas");

		} else {

			System.out.println("\nErraste");
			compu += apuestaCompu + apuestaJugador;

			System.out.println("Ahora tienes " + jugador + " canicas :(");
			System.out.println("Computadora tiene " + compu + " canicas");

		}//Fin cuantás TÚ apuestas	

	}//Fin main

}//Fin class
