class Basico {

	public static void main(String[] args) {
		
		// Areglo de cadenas //
		String[] palabras = {"Linux","Hola", "Adiós", "día", "desayuno", "LaTex"};

		// Arreglo de números //
		int numbers[];
		numbers = new int [10];

		// Arreglo de caracteres //
		int tam = 5;
		char[] caracteres = new char[tam];


		//// Asignación de valores ////

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = 200;
			
		}

		caracteres[0] = 'J';
		caracteres[1] = 'a';
		caracteres[2] = 'v';
		caracteres[3] = 'a';
		caracteres[4] = 'c';
		// Notamos que el máximo índice es el tamaño del arreglo - 1

		System.out.println("El arreglo 1 tiene como elementos: ");

		for (int i = 0; i < palabras.length; i++) {

			System.out.print(palabras[i] + ", ");

		}

		System.out.println();

		System.out.println("El arreglo 2 tiene como elementos:");

		for (int val : numbers) {

			System.out.println(val);
			
		}

		System.out.println("El arreglo 3 tiene como elementos: ");

		for (char carac : caracteres) {

			System.out.print(carac);
			
		}

	}

}