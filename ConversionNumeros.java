import java.util.Scanner;

public class ConversionNumeros {
	
	public static void main(String [] args) {

		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int deDiez = 0;
		boolean exito = true;

		System.out.println("Este programa convierte de octal a decimal");
		System.out.println("Ingresa un valor en base octal: ");
		String ochal = entrada.nextLine();

		int num = ochal.length()-1;

		System.out.println();

		while(i < ochal.length()){

			char carac = ochal.charAt(i);

			if(carac == '9' || carac == '8') {
				exito = false;
			}

			int entero = Integer.parseInt(String.valueOf(carac));
			deDiez += entero*Math.pow(8, num);

			//Para exponente
			num--;

			//Contador
			i++;
		}

		if(exito) {
			System.out.println("En base decimal " + ochal + " es "+ deDiez);
		} else {
			System.out.println("Ese número no está en base ocho jarocho :p"); //Error
	}
		
	}//Fin main
}//Fin class
