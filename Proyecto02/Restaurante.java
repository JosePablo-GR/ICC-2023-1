public class Restaurante{

	public static void main(String[] args){

		Persona personita = new Persona();
		Ticket ticketito = new Ticket();
		Menu menucito = new Menu();

		//Persona.generaPersona();

		/*
		for(int a = 1; a <= 15; a++){

			personita.generaPersona();

			System.out.println("\n************* Ticket " + a + " *************");
			ticketito.imprimeComprobante(personita);

		}//Fin for 15 veces
		*/

		personita.generaPersona();

		System.out.println("\n************* Ticket n *************");
		ticketito.imprimeComprobante(personita);

	}//Fin main

}//Fin class
