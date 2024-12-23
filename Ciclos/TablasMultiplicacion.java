class TablasMultiplicacion {

	public static void main(String[] args) {

		// Ciclo do-while //

		int n = 100;

		do {

			System.out.println("Me repito al menos una vez.");

		}  while (n == 0); // Notamos que la condición es falsa

		// Ciclo while //
		
		int i = 1; // Variable que aumentará uno a uno
		final int tablaDel = 7; // Constante la que se multiplicará

		while (i < 11) {

			int resultado = i * tablaDel;

			System.out.println(tablaDel + "x" + i + " = " + resultado);

			i++; // IMPORTANTE: aumento de la variable

		}

	}

}