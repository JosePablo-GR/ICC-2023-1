class UsoSwitch {

	public static void main(String[] args) {

		// Modificar dia
		int dia = 1;
		
		switch (dia) {

		case 1:
		
			// Puede tener varias líneas
			System.out.println("lunes");
			break;
			
		case 2:
		
			System.out.println("martes");
			break;
			
		case 3:
		
			System.out.println("miércoles");
			break;
			
		case 4:
		
			System.out.println("jueves");
			break;
			
		case 5:
		
			System.out.println("viernes");
			break;
			
		case 6:
		
			System.out.println("sábado");
			break;
			
		case 7:
		
			System.out.println("domingo");
			break;

		default:

			System.out.println("Día erroneo");
			break; // Podemos o no omitirlo ya que es la última instrucción

		}

	}

}