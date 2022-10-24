import java.util.Scanner;
import java.util.Random;

public class Automovil{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();
		DeNuevo carroCero = new DeNuevo();

		int opcion;
		char opcion2;
		double opcion3;
		String opcion4;
		boolean tanqueLleno;

		System.out.println("Bienvenido a tu carro nuevo");
		System.out.println("Para prenderlo presiona 0");

		opcion = entrada.nextInt();

		if(opcion == 0){

			carroCero.setEncendido(true);
			System.out.println("Genial! Como tu auto es nuevo tienes el tanque lleno (50 litros)");
			carroCero.setGasolinaActual(50.00); //Gasolina en litros
			tanqueLleno = true;

		} else {

			System.out.println("Ok, se mantedrá apagado");
			carroCero.setEncendido(false);
			tanqueLleno = false;
		}//Fin if else encendido inicial

		while(carroCero.getEncendido()){

			System.out.println("\nAhora, ¿qué deseas hacer?");
			System.out.println("1. Avanzar");
			System.out.println("2. Cargar gasolina");
			System.out.println("3. Cargar todo el tanque");
			System.out.println("4. Carreritas");

			opcion = entrada.nextInt();

			if(opcion < 1 || opcion > 4){

				carroCero.setEncendido(false);
				System.out.println("Opción inválida");

			} else {

				switch(opcion){

				case 1:

					System.out.println("\nDime cuántos kilometros quieres avanzar: ");
					int km = entrada.nextInt();

						if(km <= 0){

						System.out.println("\nNo puedes avanzar " + km + " kilometros");
						carroCero.setEncendido(false);

						} else {

							carroCero.avanzar(km);
							tanqueLleno = false;

						}//Fin if else avanzar

						break;

				case 2:
				
					System.out.println("\n¿Cuánto de gasolina quieres? (considera que el litro cuesta $19.8)");
					System.out.println("a. En pesos");
					System.out.println("b. En litros");
					opcion2 = entrada.next().charAt(0);

					if(opcion2 == 'a' || opcion2 == 'A'){

						System.out.println("\nDe acuerdo, ingresa la cantidad de dinero que aumentarás: ");
						opcion3 = entrada.nextDouble();

						if(opcion3 <= 0.00){

							System.out.println("\nNo se puede recargar esa cantidad");

						} else {

							carroCero.cargarGasolinaDinero(opcion3);

							if(carroCero.getGasolinaActual() >= 50.00){

								tanqueLleno = true;

							} else {

								tanqueLleno = false;

							}//Fin if tanque lleno después de llenarlo x dinero

						}//Fin quieren recargar 0

					} else if(opcion2 == 'b' || opcion2 == 'B'){

						System.out.println("\nOkay, ingresa la cantidad de litros *enteros* que quieras: ");
						opcion = entrada.nextInt();

						if(opcion == 0){

							System.out.println("\nEntonces para q vienes? ._.");

						} else if (opcion < 0){

							System.out.println("\nNo se puede eso");

						} else {

							carroCero.cargarGasolinaLitros(opcion);

							if(carroCero.getGasolinaActual() >= 50.00){

								tanqueLleno = true;

							} else {

								tanqueLleno = false;

							}//Fin if tanque lleno después de llenarlo x litros

						}//Fin if else cargar de a litro


					} else {

						System.out.println("Opción incorrecta");
						carroCero.setEncendido(false);

					}//Fin qué opción de gas litros o pesos

					break;

				case 3:

					//System.out.println(carroCero.getGasolinaActual());

					if(tanqueLleno){

						System.out.println("\nEl tanque ya está a la máxima capacidad");

					} else {

						carroCero.cargarTodoElTanque();
						System.out.println("Listo, ya tienes los 50 l");
					}

					if(carroCero.getGasolinaActual() >= 50.00){

								tanqueLleno = true;

							} else {

								tanqueLleno = false;

							}//Fin if tanque lleno después de llenar el tanque completo

					break;

				}//Fin switch

			}//Fin if opción incorrecta

		}//Fin while encendido

	}//Fin main

}//Fin class
