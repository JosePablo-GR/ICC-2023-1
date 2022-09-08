import java.util.Scanner;

public class CuerposGeometricos{

	public static void main (String [] args){

		Scanner entrada = new Scanner(System.in);

		System.out.println("Este programa calcula el volumen de ciertas figuras");
		System.out.println("Digita el número de la opción que quieres calcular su volumen.");


		System.out.println("1. Cono");
		System.out.println("2. Esfera");
		System.out.println("3. Hemisfera");
		System.out.println("");

		int sel = entrada.nextInt();

		if (sel < 1 || sel > 3) {

			System.out.println("Selcción inválida");

		} else {

		if (sel == 1) {

			System.out.println("");
			System.out.println("Dame el radio: ");

			double r = entrada.nextDouble();

			if (r <= 0){

					System.out.println("Ingresa un valor válido");

			} else {

				System.out.println("");
			System.out.println("Dame la altura: ");

			double h = entrada.nextDouble();

			if (h <= 0){

					System.out.println("Ingresa un valor válido");
			} else {
			
			double areaCono = (Math.PI*(r*r)*h)/3;

			System.out.println("El volumen del cono con altura " + h + " y radio " + r + " es: " + areaCono);

			}

		}

			} // Fin sel 1

		if (sel == 2){

			System.out.println("");
			System.out.println("Dame el radio: ");

			double r = entrada.nextDouble();

			if (r <= 0){

					System.out.println("Ingresa un valor válido");

			} else {
			
			double areaEsfera = 4*(Math.PI*Math.pow(r,3))/3;

			System.out.println("El volumen de la esfera con radio de " + r + " es: " + areaEsfera);

		}

		} //if sel 2

		if (sel == 3){

			System.out.println("");
			System.out.println("Dame el radio: ");

			double r = entrada.nextDouble();

			if (r <= 0){

					System.out.println("Ingresa un valor válido");

			} else {
			
			double areaHE = 2*(Math.PI*Math.pow(r,3))/3;

			System.out.println("El área de la esfera con radio " + r + " es " + areaHE);

		}

		} // Fin sel 3

	}


	}// Fin de main


} // Fin de la clase