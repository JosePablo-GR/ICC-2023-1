import java.util.Scanner;
import java.util.Random;

public class Automovil{

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public static int avanzar(int kilometros){

		if(kilometros < 0){

			System.out.println("Cantidad inválida");

		} else {

			

		}//Fin else if

		return kilometros;

	}//Fin avanzar

	public static double cargarGasolina(double dinero){



		return dinero;

	}//Fin cargarGasolina

	public static void main(String[] args){

	//Atributos

	boolean encendido;
	String compania;
	String marca;
	double gasTotal;
	double gasActual = 0;

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	TallerAuto carrito1 = new TallerAuto();

	System.out.println("Hola, estás en un auto muy bonito");
	System.out.println("¿Deseas prenderlo? Escribe 'o' para sí");

	String op = sc.next();

	if(op.equals("o")){

		carrito1.setEncendido(true);
		//encendido = true;

	} else {

		carrito1.setEncendido(false);
		//encendido = false;

	}

	gasTotal = 50.00;

	while(carrito1.getEncendido()){

		System.out.println("\n¿Qué quieres hacer?");
		System.out.println("a) Avanzar");
		System.out.println("b) Cargar gasolina");
		System.out.println("c) Cargar todo el tanque");
		System.out.println("d) Carreritas");
		System.out.println("e. Apagar el coche");

		op = sc.next().toLowerCase();

		switch(op){

		case "a":

			System.out.println("Dime cuantos kilómetros quieres recorrer: ");
			int km = sc.nextInt();

			avanzar(km);

			break;

		case "b":

			System.out.println("¿Cuánto quieres recargar de gasolina? (Considera que el litro cuesta $19.8)");
			double dinero = sc.nextDouble();

			double gasTeAlcanza = dinero/19.8; //Litros de gas

			while(dinero != 0){

				gasActual += gasTeAlcanza;

				System.out.println(gasActual);

				dinero--;

			}//Fin while rellenar

			break;

		}//Fin switch


		System.out.println("¿Quieres apagar el coche? [S/N]");
		char opc = sc.next().charAt(0);

		if(opc == 's' || opc == 'S'){

			carrito1.setEncendido(false);
			//encendido = false;

		} else {

			carrito1.setEncendido(true);
			//encendido = true;

		}//Fin encendido o no


	}

	//System.out.println(encendido);

	}//Fin main

}//Fin class
