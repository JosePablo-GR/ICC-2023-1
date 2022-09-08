import java.util.Random;

public class Calificaciones {

	public static void main (String [] SpiderMan){

	Random aleatorios = new Random();

	int contCero = 0;
	int contUno = 0;
	int contDos = 0;
	int contTres = 0;
	int contCua = 0;
	int contCin = 0;
	int contSix = 0;
	int contSept = 0;
	int contUit = 0;
	int contNeuf = 0;
	int contDix = 0;


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
			contCua++;
		} else if (califEntera == 5){ //Fin if 5
			contCin++;
		} else if (califEntera == 6){ //Fin if 6
			contSix++;
		} else if (califEntera == 7){ //Fin if 7
			contSept++;
		} else if (califEntera == 8){ //Fin if 8
			contUit++;
		} else if (califEntera == 9){ //Fin if 9
			contNeuf++;
		} else if (califEntera == 10){ //Fin if 10
			contDix++;
		} 

		}//Fin for

	/*
	System.out.println("Hay " + contCero + " ceros");
	System.out.println("Hay " + contUno + " unos");
	System.out.println("Hay " + contDos + " dos");
	System.out.println("Hay " + contTres + " tres");
	System.out.println("Hay " + contCua + " cuatros");
	System.out.println("Hay " + contCin + " cincos");
	System.out.println("Hay " + contSix + " seises");
	System.out.println("Hay " + contSept + " sietes");
	System.out.println("Hay " + contUit + " ochos");
	System.out.println("Hay " + contNeuf + " nueves");
	System.out.println("Hay " + contDix + " dieces\n");
	System.out.println();
	*/

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

for(int i = 0; i < contCua; i++){
System.out.print("*");
} //Fin for 4
System.out.println();


System.out.print("5: ");

for(int i = 0; i < contCin; i++){
System.out.print("*");
} //Fin for 5
System.out.println();


System.out.print("6: ");

for(int i = 0; i < contSix; i++){
System.out.print("*");
} //Fin for 6
System.out.println();


System.out.print("7: ");

for(int i = 0; i < contSept; i++){
System.out.print("*");
} //Fin for 7
System.out.println();


System.out.print("8: ");

for(int i = 0; i < contUit; i++){
System.out.print("*");
} //Fin for 8
System.out.println();


System.out.print("9: ");

for(int i = 0; i < contNeuf; i++){
System.out.print("*");
} //Fin for 9
System.out.println();


System.out.print("10: ");

for(int i = 0; i < contDix; i++){
System.out.print("*");
} //Fin for 10

System.out.println();

}//Fin main

}//Fin class