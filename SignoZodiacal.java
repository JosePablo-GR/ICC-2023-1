import java.util.Scanner;

public class SignoZodiacal{

	public static void main (String [] args){

		Scanner lector = new Scanner(System.in);

		int mes = 0;
		int dia;

		System.out.println("");
		System.out.println("Este programa te indica tu signo zodical, símbolo y elemento");
		System.out.println("Ingresa tu mes de nacimiento en número: ");

		mes = lector.nextInt();
		
			if (mes < 1 || mes > 12){

			System.out.println("");
 			System.out.println("Ese mes no existe");

		} 

		switch (mes) {

		case 1: //Enero

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Enero no tiene " + dia + " días");
				//System.out.println("");

			} else {

				if (dia <= 20) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Capricornio");
					System.out.println("Tu símbolo es: La Cabra de Mar");
					System.out.println("Tu elemento es: Tierra");


				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Acuario");
					System.out.println("Tu símbolo es: El Lanzador");
					System.out.println("Tu elemento es: Aire");
				}

			}
					break;

		case 2: //Febrero

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 28){

				System.out.println("");
				System.out.println("Febrero no tiene " + dia + " días");
				
			} else {

				if (dia <= 19) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Acuario");
					System.out.println("Tu símbolo es: El Lanzador");
					System.out.println("Tu elemento es: Aire");


				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Piscis");
					System.out.println("Tu símbolo es: El Pez");
					System.out.println("Tu elemento es: Agua");
				}

			}

			break;

		case 3: //Marzo

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Marzo no tiene " + dia + " días");
				
			} else {

				if (dia <= 20) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Piscis");
					System.out.println("Tu símbolo es: El Pez");
					System.out.println("Tu elemento es: Agua");


				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Aries");
					System.out.println("Tu símbolo es: El Carnero");
					System.out.println("Tu elemento es: Fuego");
				}

			}

			break;

		case 4: //Abril

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 30){

				System.out.println("");
				System.out.println("Abril no tiene " + dia + " días");
				
			} else {

				if (dia <= 20) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Aries");
					System.out.println("Tu símbolo es: El Carnero");
					System.out.println("Tu elemento es: Fuego");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Tauro");
					System.out.println("Tu símbolo es: El Toro");
					System.out.println("Tu elemento es: Tierra");
				}

			}

			break;

		case 5: //Mayo

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Mayo no tiene " + dia + " días");
				
			} else {

				if (dia <= 21) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Tauro");
					System.out.println("Tu símbolo es: El Toro");
					System.out.println("Tu elemento es: Tierra");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Geminis");
					System.out.println("Tu símbolo es: Los Gemelos");
					System.out.println("Tu elemento es: Aire");
				}

			}

			break;

		case 6: //Junio

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 30){

				System.out.println("");
				System.out.println("Junio no tiene " + dia + " días");
				
			} else {

				if (dia <= 23) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Geminis");
					System.out.println("Tu símbolo es: Los Gemelos");
					System.out.println("Tu elemento es: Aire");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Cancer");
					System.out.println("Tu símbolo es: El Cangrejo");
					System.out.println("Tu elemento es: Agua");
				}

			}

			break;

		case 7: //Julio

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Julio no tiene " + dia + " días");
				
			} else {

				if (dia <= 23) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Cancer");
					System.out.println("Tu símbolo es: EL Cangrejo");
					System.out.println("Tu elemento es: Agua");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Leo");
					System.out.println("Tu símbolo es: El león");
					System.out.println("Tu elemento es: Fuego");
				}

			}

			break;


		case 8: //Agosto

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Agosto no tiene " + dia + " días");
				
			} else {

				if (dia <= 22) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Leo");
					System.out.println("Tu símbolo es: El león");
					System.out.println("Tu elemento es: Fuego");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Virgo");
					System.out.println("Tu símbolo es: El virgen");
					System.out.println("Tu elemento es: Tierra");
				}

			}

			break;

		case 9: //Septiembre

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 30){

				System.out.println("");
				System.out.println("Septiembre no tiene " + dia + " días");
				
			} else {

				if (dia <= 22) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Virgo");
					System.out.println("Tu símbolo es: El virgen");
					System.out.println("Tu elemento es: Tierra");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Libra");
					System.out.println("Tu símbolo es: La pesa");
					System.out.println("Tu elemento es: Aire");
				}

			}

			break;


		case 10: //Octubre

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Octubre no tiene " + dia + " días");
				
			} else {

				if (dia <= 23) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Libra");
					System.out.println("Tu símbolo es: La pesa");
					System.out.println("Tu elemento es: Aire");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Scorpio");
					System.out.println("Tu símbolo es: El Escorpión");
					System.out.println("Tu elemento es: Agua");
				}

			}

			break;

		case 11: //Noviembre

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 30){

				System.out.println("");
				System.out.println("Noviembre no tiene " + dia + " días");
				
			} else {

				if (dia <= 22) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Scorpio");
					System.out.println("Tu símbolo es: El Escorpión");
					System.out.println("Tu elemento es: Agua");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Sagitario");
					System.out.println("Tu símbolo es: El Centauro");
					System.out.println("Tu elemento es: Fuego");
				}

			}

			break;

		case 12: //Diciembre

			System.out.println("");
			System.out.println("Ingresa tu día de nacimiento");

			dia = lector.nextInt();

			if (dia < 1 || dia > 31){

				System.out.println("");
				System.out.println("Diciembre no tiene " + dia + " días");
				
			} else {

				if (dia <= 21) {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Sagitario");
					System.out.println("Tu símbolo es: El Centauro");
					System.out.println("Tu elemento es: Fuego");

				} else {

					System.out.println("");
					System.out.println("Tu signo del zodiaco es: Capricornio");
					System.out.println("Tu símbolo es: La Cabra de Mar");
					System.out.println("Tu elemento es: Tierra");
				}

			}

			break;


		}//Fin switch

	} // Fin main

} // Fin class
