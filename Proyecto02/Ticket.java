public class Ticket{

	Menu menucito = new Menu();

	public void imprimeComprobante(Persona persona){

		String extra = "";

		System.out.println("\t   Cliente atendido:");
		System.out.println("\n	    " + persona.getGenero() + ", " + persona.getEdad() + ", " + persona.getTalla());
		System.out.println("-----------------------------------");
		menucito.queMenu(persona);
		System.out.println("\t       Menú " + menucito.getMenu());
		System.out.println("\n          " + menucito.getPlatillo());

		if(menucito.getAdicional() == true){

			if(menucito.getMenu() == 1){

			extra = "con miel y granola adicional";

			} else if(menucito.getMenu() == 2){

			extra = "con fruta adicional";

			} else if(menucito.getMenu() == 3){

			extra = "con orden de cebollitas y nopales adicional";

		}

		}//Fin if adicionales en menús 

		if(menucito.getMenu() == 1){

			System.out.println("\n\t  Fruta (papaya y sandía) " + extra);

		} else if(menucito.getMenu() == 2){

			System.out.println("\n\t  Plato de avena " + extra);

		} else if(menucito.getMenu() == 3){

			System.out.println("\n\t  Papas horneadas " + extra);

		}//Fin if complemento

		//System.out.println("\n	  Adicional");
		System.out.println("\n          " + menucito.getBebida());
		System.out.println("\n\t  Importe: $" + menucito.getPrecio());
		System.out.println("-----------------------------------");
		System.out.println("\t     Adicionales:");

			/*

			if(menucito.getAdicional() == true){

				if(menucito.getMenu() == 1){

					System.out.println("con miel y granola adicional");

				} else if(menucito.getMenu() == 2){

					System.out.println("con fruta adicional");

				} else if(menucito.getMenu() == 3){

					System.out.println("con orden de cebollitas y nopales adicional");

				}//Fin if adicionales en menús 

			} else {

				System.out.println("\n\t     Ninguno");				

			}//Fin adicionales == true / false

			*/

		//System.out.println();
		//System.out.println("\nMenús vendidos: ");
		//System.out.println("Menú 1: " + + " personas");
		//System.out.println("Menú 2: " + + " personas");

	}//Fin método imprime comprobante

}//Fin class
