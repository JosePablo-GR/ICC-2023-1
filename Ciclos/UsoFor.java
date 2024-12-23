class usoFor {

	public static void main(String[] args) {
		
		// Ciclo for //

		String cadena = "Hola, me llamo José.";

		int contador = 0;

		for (int variable = 0; variable < cadena.length(); variable++) {

			// No contamos los espacios
			if (cadena.charAt(variable) != ' ') {

				contador++;

			}
			
		}

		System.out.println("La palabra tiene " + contador + " caracteres.");

		// Ciclo for-each //

		int[] numeros = {1,2,3,4,5,6,7,8,9};

		System.out.println("El arreglo tiene los siguientes números: ");

		for (int x : numeros) {

			System.out.print(x + " ");
			
		}

		System.out.println();

	}

}