import java.util.Random;

public class Calificaciones {

	public static void main (String [] SpiderMan){

	Random aleatorios = new Random();

	int contCero = 0;
	int contUno = 0;
	int contDos = 0;
	int contTres = 0;
	int contCuatro = 0;
	int contCinco = 0;
	int contSeis = 0;
	int contSiete = 0;
	int contOcho = 0;
	int contNueve = 0;
	int contDiez = 0;


		for (int veces = 1; veces <= 20; veces++){

		int califEntera = aleatorios.nextInt(11);

		if(califEntera==10) {
			System.out.println("A");
		} else if(califEntera==9) {
			System.out.println("B");
		} else if(califEntera==8) {
			System.out.println("C");
		} else if(califEntera==7) {
			System.out.println("D");
		} else if(califEntera==6) {
			System.out.println("E");
		} else if(califEntera>=0 && califEntera<=5) {
			System.out.println("F");
		}


		if (califEntera == 0){ //Fin if 0
			contCero++;
		} else if (califEntera == 1){ //Fin if 1
			contUno++;
		} else if (califEntera == 2){ //Fin if 2
			contDos++;
		} else if (califEntera == 3){ //Fin if 3
			contTres++;
		} else if (califEntera == 4){ //Fin if 4
			contCuatro++;
		} else if (califEntera == 5){ //Fin if 5
			contCinco++;
		} else if (califEntera == 6){ //Fin if 6
			contSies++;
		} else if (califEntera == 7){ //Fin if 7
			contSiete++;
		} else if (califEntera == 8){ //Fin if 8
			contOcho++;
		} else if (califEntera == 9){ //Fin if 9
			contNueve++;
		} else if (califEntera == 10){ //Fin if 10
			contDiez++;
		} 

		}//Fin for

		System.out.println();
		
		System.out.print("0: ");
		for(int i = 0; i < contCero; i++){
		System.out.print("*");
		} //Fin for 0
		System.out.println();


		System.out.print("1: ");
		for(int i = 0; i < contUno; i++){
		System.out.print("*");
		} //Fin for 1
		System.out.println();


		System.out.print("2: ");
		for(int i = 0; i < contDos; i++){
		System.out.print("*");
		} //Fin for 2
		System.out.println();


		System.out.print("3: ");
		for(int i = 0; i < contTres; i++){
		System.out.print("*");
		} //Fin for 3
		System.out.println();


		System.out.print("4: ");
		for(int i = 0; i < contCuatro; i++){
		System.out.print("*");
		} //Fin for 4
		System.out.println();
		

		System.out.print("5: ");
		for(int i = 0; i < contCinco; i++){
		System.out.print("*");
		} //Fin for 5
		System.out.println();


		System.out.print("6: ");
		for(int i = 0; i < contSeis; i++){
		System.out.print("*");
		} //Fin for 6
		System.out.println();


		System.out.print("7: ");
		for(int i = 0; i < contSiete; i++){
		System.out.print("*");
		} //Fin for 7
		System.out.println();


		System.out.print("8: ");
		for(int i = 0; i < contOcho; i++){
		System.out.print("*");
		} //Fin for 8
		System.out.println();


		System.out.print("9: ");
		for(int i = 0; i < contNueve; i++){
		System.out.print("*");
		} //Fin for 9
		System.out.println();


		System.out.print("10: ");
		for(int i = 0; i < contDiez; i++){
		System.out.print("*");
		} //Fin for 10
		System.out.println();

	}//Fin main

}//Fin class
