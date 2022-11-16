import java.util.Random;

public class Menu{

	int menu;
	int precio;
	String platillo;
	String complemento;
	String bebida;
	boolean adicional;

	public Menu(){}//Fin constructor x omisión

	public Menu(int menu, int precio, String platillo, String complemento, String bebida, boolean adicional){

		this.menu = menu;
		this.precio = precio;
		this.platillo = platillo;
		this.complemento = complemento;
		this.bebida = bebida;
		this.adicional = adicional;

	}//Fin constructor parámetros

	public void queMenu(Persona persona){

		Random rd = new Random();

		menu = rd.nextInt(3)+1;

		int ifAdicional;
		int cremitaAdicional;
		boolean cremaAdicional; //Para menú 1 y 3
		String verdesRojos;
		//String 
		int rojosVerdes = rd.nextInt(2);
		int queBebida = rd.nextInt(2);

		if(rojosVerdes == 0){

			verdesRojos = "verdes";

		} else {

			verdesRojos = "rojos";

		}//Fin if rojos o verdes

		//////////Menú 1//////////
		if(menu == 1){

			this.precio = 60;

			this.platillo = "Chilaquiles " + verdesRojos;

			if(queBebida == 1){

				this.bebida = "Café";

			} else {

				this.bebida = "Jugo";

			}//Fin if bebida

			if(persona.getGenero().equals("Mujer")){

				ifAdicional = rd.nextInt(2); //Comida adicional
				cremitaAdicional = rd.nextInt(10)+1; //Crema para café

				if(ifAdicional == 0){

					this.adicional = true;

				} else {

					this.adicional = false;

				}//Fin if adicional

				if(cremitaAdicional <= 7){

					cremaAdicional = true;

				} else {

					cremaAdicional = false;

				}//Fin if crema café 70%
				

			} else {

				ifAdicional = rd.nextInt(2); //Comida adicional
				cremitaAdicional = rd.nextInt(2); //Crema para café

				if(ifAdicional == 0){

					this.adicional = true;

				} else {

					this.adicional = false;

			}//Fin if adicional

			if(cremitaAdicional == 0){

					cremaAdicional = true;

				} else {

					cremaAdicional = false;

				}//Fin if crema café

			}//Fin if género

			if(adicional){

				precio += 5;

			}//Fin if adicional (comida) == true

			if(cremaAdicional){

				precio += 3;

			}//Fin if adicional (comida) == true

		//////////Menú 2//////////
		} else if(menu == 2){

			this.precio = 45;

			this.platillo = "Molletes";

			if(queBebida == 1){

				this.bebida = "Té";

			} else {

				this.bebida = "Atole";

			}//Fin if bebida

		//////////Menú 3//////////
		} else {

			this.precio = 70;

			this.platillo = "Costilla de res";

			if(queBebida == 1){

				this.bebida = "Café";

			} else {

				this.bebida = "Jugo";

			}//Fin if bebida

		}//Fin qué hay en qué menú

	}//Fin método queComera 

	//Getters
	public int getMenu(){

		return menu;

	}//Fin getMenu

	public int getPrecio(){

	return precio;

	}//Fin getPrecio

	public String getPlatillo(){

		return platillo;

	}//Fin getPlatilo

	public String getComplemento(){

		return complemento;

	}//Fin getComplemento

	public String getBebida(){

		return bebida;

	}//Fin getBebida

	public boolean getAdicional(){

		return adicional;

	}//Fin getAdicional

}//Fin class
