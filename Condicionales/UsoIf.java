class UsoIf {

	public static void main(String[] args) {

		int edad = 20;
		
		// instrucción if simple
		if (edad >= 18) {

			System.out.println("Eres mayor de edad");

		}

		// instrucción if-else
		if (edad >= 18) {

			System.out.println("Eres mayor de edad");

		} else {

			System.out.println("Aún no eres mayor de edad.");

		}

		// instrucción else if
		if (edad >= 0 && edad < 18) {

			System.out.println("Estás en la ninez / adolesencia");

		} else if (edad >= 50) {

			System.out.println("Estás en la adultez");

		} else if (edad > 50) {

			System.out.println("Estás en la vejez");

		} else {

			System.out.println("Edad errada.");

		}

	}

}