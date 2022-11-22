import java.util.Random;

public class Menu{

	int menu;
	int precio;
	String platillo;
	String complemento;
	String bebida;
	boolean adicional;

	boolean auxCremaCafe;
	boolean auxPancito;
	boolean auxSandwich;
	boolean auxQuesadillas;
	String bebidaExtra;

	public Menu(){}//Fin constructor x omisión

	public Menu(int menu, int precio, String platillo, String complemento, String bebida, boolean adicional){

		this.menu = menu;
		this.precio = precio;
		this.platillo = platillo;
		this.complemento = complemento;
		this.bebida = bebida;
		this.adicional = adicional;

	}//Fin constructor parámetros

	/*
	public void probabilidades(Persona persona){

		Random rd = new Random();

		int porcentajes = rd.nextInt(10)+1;
		int desempate = rd.nextInt(2);

		if(persona.getEdad() >= 5 || persona.getEdad() <= 17){

			if(porcentajes >= 1  || porcentajes <= 4){

				setMenu(1);

			} else if(porcentajes >= 5 || porcentajes <= 9){

				setMenu(2);

			} else {

				if(desempate == 0){

					setMenu(2);

				} else {

					setMenu(3);

				}//Fin ese 5%

			}//Fin 40% de probabilidad

		}//Fin if diferentes menús

	}//Fin método probabilidades
	*/

	public String bebidaAdicional(String bebida, String tamaño){

		if(bebida.equalsIgnoreCase("café")){

			precio += 15;

			if(tamaño.equalsIgnoreCase("ch")){

				precio = precio;

			} else if(tamaño.equalsIgnoreCase("m")){

				precio += 7;

			} else if(tamaño.equalsIgnoreCase("g")){

				precio += 12;

			}

		} else if(bebida.equalsIgnoreCase("té")){

			precio += 10;

			if(tamaño.equalsIgnoreCase("ch")){

				precio = precio;	

			} else if(tamaño.equalsIgnoreCase("m")){

				precio += 1;

			} else if(tamaño.equalsIgnoreCase("g")){

				precio += 2;

			}

		} else if(bebida.equalsIgnoreCase("atole")){

			precio += 20;

			if(tamaño.equalsIgnoreCase("ch")){

				precio = precio;

			} else if(tamaño.equalsIgnoreCase("m")){

				precio += 5;

			} else if(tamaño.equalsIgnoreCase("g")){

				precio += 10;

			}

		}//Fin if café, té o atole

		return bebida + "" + tamaño;

	}//Fin método bebidaAdicional

	public void queMenu(Persona persona){

		Random rd = new Random();

		if(persona.getEdad() >= 5 || persona.getEdad() <= 17){

			int porcentajes = rd.nextInt(10)+1;

			if(porcentajes >= 1  || porcentajes <= 4){

				setMenu(1);

			} else if(porcentajes >= 5 || porcentajes <= 9){

				setMenu(2);

			} else {

				int desempate = rd.nextInt(2);

				if(desempate == 0){

					setMenu(2);

				} else {

					setMenu(3);

				}//Fin ese 5%

			}//Fin if probabilidad (empieza en 40%)

			int auxBebida = rd.nextInt(10)+1;
			int queOtraBebida = rd.nextInt(3)+1;

			if(auxBebida >= 1 || auxBebida <= 8){

				String bebidaBebible;

				if(queOtraBebida == 1){

					bebidaBebible = "Café";

				} else if(queOtraBebida == 2){

					bebidaBebible = "Té";

				} else {

					bebidaBebible = "Atole";

				}

				setBebidaExtra(bebidaAdicional(bebidaBebible, "G"));

			}//Fin if 80% auxBebida

		} else {

			menu = rd.nextInt(3)+1;

			setMenu(menu);

		}//Fin if 5 a 17

		int cremitaAdicional;
		boolean cremaAdicional = false; //Para menú 1 y 3
		int ifAdicional = rd.nextInt(2); //Comida adicional;
		int queBebida = rd.nextInt(2);

		if(ifAdicional == 0){

			setAdicional(true);

		} else {

			setAdicional(false);

		}//Fin if adicional

		//////////Menú 1//////////
		if(menu == 1){

			this.precio = 60;

			String verdesRojos;
			int rojosVerdes = rd.nextInt(2);

			if(rojosVerdes == 0){

				verdesRojos = "verdes";

			} else {

				verdesRojos = "rojos";

			}//Fin if rojos o verdes

			this.platillo = "Chilaquiles " + verdesRojos;

			if(queBebida == 1){

				this.bebida = "Café";

			} else {

				this.bebida = "Jugo";

			}//Fin if bebida

			if(persona.getGenero().equals("Mujer")){

				if(this.bebida.equals("Café")){

				cremitaAdicional = rd.nextInt(10)+1; //Crema para café
				setPanecito(true);

					if(cremitaAdicional <= 7){

						setCremaCafe(true);

					} else {

						setCremaCafe(false);

					}//Fin if crema café 70%

				}//Fin if mujer pide café
				
			} else { //Hombre

				if(this.bebida.equals("Café")){

				cremitaAdicional = rd.nextInt(2); //Crema para café
				setPanecito(true);

					if(cremitaAdicional == 0){

						setCremaCafe(true);

					} else {

						setCremaCafe(false);

					}//Fin if crema café

				}//Fin if hombre pide café

			}//Fin if género

			if(getAdicional()){

				precio += 5;

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

			if(getAdicional()){

				precio += 10;

			}//Fin if adicional (comida) == true

		//////////Menú 3//////////
		} else {

			this.precio = 70;

			this.platillo = "Costilla de res";

			if(queBebida == 1){

				this.bebida = "Café";

			} else {

				this.bebida = "Jugo";

			}//Fin if bebida

			if(this.bebida.equals("Café")){

				setPanecito(true);
				cremitaAdicional = rd.nextInt(2); //Crema para café

					if(cremitaAdicional == 0){

						setCremaCafe(true);

					} else {

						setCremaCafe(false);

					}//Fin if crema café

				}//Fin if hombre pide café

			if(getAdicional()){

				precio += 15;

			}//Fin if adicional (comida) == true

		}//Fin qué menús

			int masAdicional = rd.nextInt(7)+1;

			if(masAdicional == 1){

				//Nada

			} else if(masAdicional == 2){

				setSandwich(true);
				precio += 33;

			}else if(masAdicional == 3){

				setQuesadillas(true);
				precio += 20;

			} else if(masAdicional == 4){

				//Nada

			}//Fin ifs más comida

			if(getCremaCafe()){

				precio += 3;
				setCremaCafe(true);

			}//Fin if adicional (café) == true

			if(getPanecito()){

				precio += 17;
				setPanecito(true);

			}//Fin if adicional (café) == true

			int algoMas = rd.nextInt(3)+1;
			int tamañito = rd.nextInt(3)+1;

			String algoDeTomar = "";

			if(algoMas == 1){

				algoDeTomar = "Café";

			} else if(algoMas == 2){

				algoDeTomar = "Té";

			} else if(algoMas == 3){

				algoDeTomar = "Atole";

			}

			String tamañoAdicional = "";

			if(tamañito == 1){

				tamañoAdicional = "Ch";

			} else if(tamañito == 2){

				tamañoAdicional = "M";

			} else if(tamañito == 3){

				tamañoAdicional = "g";

			}

			setBebidaExtra(bebidaAdicional(algoDeTomar, tamañoAdicional));

	}//Fin método queComera

	//Setters
	public void setMenu(int menu){

		this.menu = menu;

	}//Fin setMenu

	public void setAdicional(boolean adicional){

		this.adicional = adicional;

	}//Fin setAdicional

	public void setPrecio(int precio){

		this.precio = precio;

	}//Fin setPrecio

	public void setCremaCafe(boolean auxCremaCafe){

		this.auxCremaCafe = auxCremaCafe;

	}//Fin setCremaCafe

	public void setPanecito(boolean auxPancito){

		this.auxPancito = auxPancito;

	}//Fin setPanecito

	public void setSandwich(boolean auxSandwich){

		this.auxSandwich = auxSandwich;

	}//Fin setSandwich

	public void setQuesadillas(boolean auxQuesadillas){

		this.auxQuesadillas = auxQuesadillas;

	}//Fin setQuesadillas

	public void setBebidaExtra(String bebidaExtra){

		this.bebidaExtra = bebidaExtra;

	}//Fin setBebidaExtra

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

	public boolean getCremaCafe(){

		return auxCremaCafe;

	}//Fin getCremaCafe

	public boolean getPanecito(){

		return auxPancito;

	}//Fin getPanecito

	public boolean getSandwich(){

		return auxSandwich;

	}//Fin get getSandwich

	public boolean getQuesadillas(){

		return auxQuesadillas;

	}//Fin getQuesadillas

	public String getBebidaExtra(){

		return bebidaExtra;

	}//Fin getBebidaExtra

}//Fin class
