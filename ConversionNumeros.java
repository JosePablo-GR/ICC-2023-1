import java.util.Scanner;

public class ConversionNumeros {
	
	public static void main(String [] args) {

		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int baseDiez = 0;
		boolean sePudo = true;

		System.out.println("Este programa convierte números en base octal a decimal");
		System.out.println("Ingresa un valor en base octal: ");
		String octal = entrada.nextLine();

		int num = octal.length()-1;

		System.out.println();

		while(i < octal.length()){

			char carac = octal.charAt(i);

			if(carac == '9' || carac == '8') {
				sePudo = false;
			}

			int entero = Integer.parseInt(String.valueOf(carac));
			baseDiez += entero*Math.pow(8, num);

			//Para exponente
			num--;

			//Contador
			i++;
		}

		if(sePudo) {
			System.out.println("En base decimal " + octal + " es "+ baseDiez);
		} else {
			System.out.println("Ese número no está en base ocho");
	}
		
	}//Fin main
	
}//Fin class
