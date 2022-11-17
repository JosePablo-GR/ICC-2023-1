public class Ticket{

	Menu menucito = new Menu();

	public static int adicionales(String nombreVar, boolean adicional){

		int num = 100;

		if(adicional == true){

			switch(nombreVar){

				case "cremaAdicional": //Crema para café

					num = 1;

					break;

				case "otroCafe":

					num = 2;

					break;

				case "otroTe":

					num = 3;

					break;

				case "otroAtole":

					num = 4;

					break;

				case "sandwich": //Sandwich sencillo

					num = 5;

					break;

				case "qks": //Par de quesadillas

					num = 6;

					break;

				case "panDulce": //Pieza de pan dulce

					num = 7;

					break;

			}//Fin switch

		}//Fin if

		return num;

	}//Fin método adicionales

	public void imprimeComprobante(Persona persona){

		String extra = "";

		System.out.println("\t   Cliente atendido:");
		System.out.println("\n	    " + persona.getGenero() + ", " + persona.getEdad() + ", " + persona.getTalla());
		System.out.println("-----------------------------------");
		menucito.queMenu(persona);
		System.out.println("\t       Menú " + menucito.getMenu() + ":");
		System.out.println("\n          " + menucito.getPlatillo());

		switch(menucito.getMenu()){

			case 1:

				if(menucito.getAdicional()){

					extra = "con miel y granola adicional";

				}//Fin if adicional true

				System.out.println("\n\t  Fruta (papaya y sandía) " + extra);

				break;

			case 2:

				if(menucito.getAdicional()){

					extra = "con fruta adicional";

				}//fin if adicional true

				System.out.println("\n\t  Plato de avena " + extra);

				break;

			case 3: 

				if(menucito.getAdicional()){

					extra = "con orden de cebollitas y nopales adicional";

				}//fin if adicional true

				System.out.println("\n\t  Papas horneadas " + extra);


				break;

		}//Fin switch

		System.out.println("\n          " + menucito.getBebida());
		System.out.println("\n\t  Importe: $" + menucito.getPrecio());
		System.out.println("-----------------------------------");
		System.out.println("\t    Adicionales:");

		switch(menucito.getAux()){

			case 1:

				System.out.println("\t    Crema para café");

				break;

			case 5:

				System.out.println("\t    Sandwich sencillo");

				break;

			case 6:

				System.out.println("\t    Par de quesadillas");

				break;

			case 7:

				System.out.println("\t    Pieza de pan dulce");

				break;

		}//Fin switch

		//System.out.println();

		//System.out.println();
		//System.out.println("\nMenús vendidos: ");
		//System.out.println("Menú 1: " + + " personas");
		//System.out.println("Menú 2: " + + " personas");

	}//Fin método imprime comprobante

}//Fin class
