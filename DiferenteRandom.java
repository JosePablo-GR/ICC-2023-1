import java.util.Random;

public class DiferenteRandom{

public static void main(String[] args){

	Random rd = new Random();

	int[] edad = new int[95];

	int j = 5;

	for(int i = 0; i < edad.length; i++){

		edad[i] = j;

		j++;

		//System.out.println(edad[i]);

	}//Fin for rellena

	int queEdad = rd.nextInt(edad.length);

	System.out.println(edad[queEdad]);

	}//Fin main

}//Fin class
