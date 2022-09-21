import java.util.Scanner;
import java.util.Random;

public class Canicas{

	public static void main(String[] args){

		Scanner lector;
		Random aleatorio;
		char pregunta;
		int jugador;
		int compu;
		int questComp;
		int apuestaJugador;
		int apuestaCompu;
		boolean par;
		boolean impar;
		boolean seRepite;
		boolean error;

		aleatorio = new Random();
		lector = new Scanner(System.in);

		System.out.println("Acabo de repartir 10 canicas para la computadora y 10 para Miguel");

		jugador = 10;
		compu = 10;
		seRepite = true;

		while(seRepite){

		/////////Nosotros adivinamos/////////
		System.out.println("\nMiguel, es tu turno de adivinar\n¿cuántas canicas quieres apostar?");
		System.out.println("Tienes " + jugador + " canicas");

		apuestaJugador = lector.nextInt();

		jugador -= apuestaJugador;

		System.out.println("\nLa computadora eligirá cuántas canicas apostará...");

		apuestaCompu = aleatorio.nextInt(compu)+1;
		compu -= apuestaCompu;

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
			
			System.out.println("Te quedarás con las canicas que apostó la computadora");

		} else {

			System.out.println("\nErraste");
			compu += apuestaCompu + apuestaJugador;

			System.out.println("Ahora la computadora tiene las canicas que apostaste");

		}//Fin cuantás TÚ apuestas

		/////////Computadora adivina/////////
		System.out.println("\nMiguel, es turno de la computadora a adivinar\n¿cuántas canicas quieres apostar?");
		System.out.println("\nLa computadora adivinará si la cantidad que tienes es par o impar");
		System.out.println("Tienes " + jugador + " canicas");

		apuestaJugador = lector.nextInt();
		jugador -= apuestaJugador;

		//System.out.println("\nLa computadora eligirá cuántas canicas apostará...");

		apuestaCompu = aleatorio.nextInt(compu)+1;
		compu -= apuestaCompu;

		if(apuestaJugador % 2 == 0){

			par = true;
			impar = false;

		} else {

			impar = true;
			par = false;

		}//Fin parImpar

		questComp = aleatorio.nextInt(2);

		if(par && questComp == 0 || impar && questComp == 1){

			System.out.println("Computadora dice que es par, ADIVINÓ");
			compu += apuestaCompu + apuestaJugador;
			
			System.out.println("Ahora tienes " + jugador + " canicas :(");

		} else {

			System.out.println("Computadora dice que es impar, FALLÓ");
			jugador += apuestaCompu + apuestaJugador;

			System.out.println("Ahora tienes " + jugador + " canicas :)");

		}//Fin adivina compu

		////////////NO TOQUES////////////
		if(jugador == 20){
				seRepite = false;

				System.out.println("Ganaste por llegar a la cantidad de " + jugador + " canicas! :p");

			}else if(compu == 20){
				seRepite = false;

				System.out.println("Computadora ganó por llegar a la cantidad de " + compu + " canicas! :(");	

			}//Fin termina juego

		}//Fin while juego

	}//Fin main

}//Fin class
