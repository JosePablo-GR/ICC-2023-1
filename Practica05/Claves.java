import java.util.Scanner;
import java.util.Random;

class Claves{

	public static void revuelve(String cadena){

		Random rd = new Random();

		int empieza = 0;

		char[] arreglito = new char [cadena.length()];

		for(int i = 0; i < arreglito.length; i++){

			char elemCadena = cadena.charAt(empieza);

			arreglito [i] = elemCadena;

			empieza++;

		}//Fin for rellena arreglo

		char[] arreglitoDesordenado = new char [cadena.length()];

		for(int j = 0; j < arreglito.length; j++){

			int positionArregloN = rd.nextInt(arreglito.length);

			if(arreglitoDesordenado [j] == null){

				arreglitoDesordenado [j] = arreglito [positionArregloN]; 

			}//Fin if el espacio está desocupado 

		}//Fin for desacomoda cadena

		System.out.println(arreglitoDesordenado);

	}//Fin método revuelve

	public static void main(String[] args){

		Random rd = new Random();

		String cadFinal = "";
		int longRestante;

		//////////Escoge carácter//////////
		String chars = "*#$&+?%";

		int characters = rd.nextInt(7);

		char charEscogido = chars.charAt(characters);

		cadFinal += charEscogido;

		//System.out.println(charEscogido);

		//////////Escoge números//////////
		int n;
		int unoDosNum = rd.nextInt(2);

		if(unoDosNum == 1){

			n = 1;

		} else {

			n = 2;

		}//Fin if uno o dos números

		for(int i = 1; i <= n; i++){

			int numeros = rd.nextInt(10);

			cadFinal += numeros;

		}//Fin for incluye uno o dos números

		//////////Escoge letras//////////
		String alf = "abcdefghijklmnopqrstuvwxyz";
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int m;
		int posicion;
		int unoDosMayus = rd.nextInt(2);

		if(unoDosMayus == 1){ //Habrá UNA mayúscula

			m = 1;

		} else {

			m = 2;

		}//Fin if una o dos mayúsculas

		for(int j = 1; j <= m; j++){

			posicion = rd.nextInt(26);

			char letraMayus = mayus.charAt(posicion);

			cadFinal += letraMayus;

		}//Fin for agarra una o dos mayúsculas

		longRestante = 8 - cadFinal.length();

		for(int k = 1; k <= longRestante; k++){

			posicion = rd.nextInt(26);

			char letra = alf.charAt(posicion);

			cadFinal += letra;

		}//Fin for agarra letras minúsculas

		System.out.println(cadFinal + ", tiene longuitud " + cadFinal.length());

		revuelve(cadFinal);

	}//Fin main

}//Fin class
