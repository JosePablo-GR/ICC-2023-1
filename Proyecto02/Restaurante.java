public class Restaurante{

	public static void main(String[] args){

		Persona personita = new Persona();
		Ticket ticketito = new Ticket();
		Menu menucito = new Menu();

		//Persona.generaPersona();

		for(int a = 1; a <= 15; a++){

			personita.generaPersona();

			System.out.println("************* Ticket " + a + " *************");
			ticketito.imprimeComprobante(personita);

		}//Fin for 15 veces

	}//Fin main

}//Fin class