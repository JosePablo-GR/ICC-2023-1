import java.util.Scanner;
import java.util.Random;

public class Canicas{

	public static void main(String[] args){

		Scanner lector;
		Random aleatorio;
		char pregunta;
		int jugador;
		int compu;
		int cuantas;

		aleatorio = new Random();
		lector = new Scanner(System.in);

		System.out.println("Acabo de repartir 10 canicas para la computadora y para Miguel");

		jugador = 10;
		compu = 10;

		System.out.println("Miguel, ¿cuántas canicas quieres apostar?");

		cuantas = lector.nextInt();
		jugador -= cuantas;

		System.out.println("\nJugador tiene " + jugador + " canicas");

		System.out.println("\nLa computadora eligirá cuántas canicas apostará: ");

		cuantas = aleatorio.nextInt(10)+1;
		compu -= cuantas;

		System.out.println("Computadora apostó " + cuantas);
		System.out.println("\nComputadora tiene " + compu + " canicas");

		System.out.println("Miguel, ¿crees que la cantidad que apostó la computadora es par o impar?");
		System.out.println("Escribe 'P' para par o 'I' para impar");

	}//Fin main

}//Fin class
