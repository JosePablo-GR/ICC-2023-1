import java.util.Scanner;
import java.util.Random;

public class MetodosAuto{

	boolean encendido;
	String compania;
	String marca;
	String color;
	double gasolinaActual;

	final double capacidadTotal = 50.00; //Litros
	final double gastoGas = 0.3; //Se restará
	final double aCuantoLaGas = 9.18; //$$

	public MetodosAuto(){}//Fin constructor por omisión

	public MetodosAuto(boolean encendido, String compania, String marca, String color, double gasolinaActual){

		this.encendido = encendido;
		this.compania = compania;
		this.marca = marca;
		this.color = color;
		this.gasolinaActual = gasolinaActual;
		
	}//Fin constructor

	public void setEncendido(boolean encendido){

		this.encendido = encendido;

	}//Fin setEncendido

	public boolean getEncendido(){

		return encendido;

	}//Fin getEncendido

	public void setCompania(String compania){

		this.compania = compania;

	}//Fin setCompania

	public String getCompania(){

		return compania;

	}//Fin getCompania

	public void setMarca(String marca){

		this.marca = marca;

	}//Fin setMarca

	public String getMarca(){

		return marca;

	}//Fin getMarca

	public void setGasolinaActual(double gasolinaActual){

		this.gasolinaActual = gasolinaActual;

	}//Fin setGasolinaActual

	public double getGasolinaActual(){

		return gasolinaActual;

	}//Fin getGasolinaActual


	public void avanzar(int kilometros){

		for(int i = 0; i <= kilometros; i++){

			System.out.println("\nKilometro " + i);
			System.out.println("Gasolina del auto: " + this.gasolinaActual);
			this.gasolinaActual -= gastoGas;
			//this.gasolinaActual--;

			if(this.gasolinaActual <= 0){

				int j = i;
				i = kilometros;

				System.out.println("\nNos quedamos en el kilometro " + j);
				System.out.println("No logramos completar el viaje");
				System.out.println("El auto se apagará...\n");
				setEncendido(false);

			}//Fin if nos quedamos sin gasolina

		}//Fin for auto avanza

	}//Fin método avanzar

	public void cargarGasolinaDinero(double dinero){

		Random aleatorios = new Random();
		int multiplo = 1;
		int teSaldraEn = 0;

		for(int cont = 1; cont <= 10; cont++){

			if(this.gasolinaActual % 9.18 == 0){

				System.out.println(multiplo + " es multiplo de 9.18");

			} else {

				System.out.println(multiplo + " no es múltiplo de 9.18");

			}

		int n = aleatorios.nextInt(5)+1;
		System.out.println();

		for(int x = 1; x <= n; x++){

			System.out.println("Cargando gasolina...");

		}//Fin whie imprime mensaje xD

		}//Fin for recargas gasolina

		System.out.println("Por favor serán $" + teSaldraEn);

	}//Fin método cargarGasolinaDinero

	public void cargarGasolinaLitros(int litros){

		litros = (int) litros;

		double cuantoSera = litros*aCuantoLaGas; //En $$

		for(int i = 0; i <= litros; i++){

			this.gasolinaActual++;

		}//Fin for cargando gasolina

		System.out.println("De tus " + litros + " van a ser $" + cuantoSera);

	}//Fin método cargarGasolinaLitros

	public void cargarTodoElTanque(){

		int resta = 0;

		if(this.gasolinaActual < 1){

			System.out.println("Te faltaban unas gotas para llenar el tanque");
			System.out.println("Ntp, nosotros lo invitamos");

		} else {

			for(int i = 0; i <= capacidadTotal; i++){

				


			}//Fin for rellena gasolina

			setGasolinaActual(50.00);

		}//Fin if cuánto de gasolina faltaba

	}//Fin método cargarTodoElTanque

	public void carreritas(String a1, String a2){

		Random aleatorios = new Random();

		int vueltasC1 = 0; //Contador Carro 1
		int vueltasC2 = 0; //Contador Carro 2

		System.out.println();
		System.out.println();
		System.out.println("                                   Inicia la carrera!!!");

		for(int vueltas = 1; vueltas <= 10; vueltas++){

			int confusion = aleatorios.nextInt(4)+1;
			boolean cc1 = false; //Confusión Carro 1
			boolean cc2 = false; //Confusión Carro 2

		if(confusion == 1){

			cc1 = true;

		} else if(confusion == 4){

			cc2 = true;

		}//Fin a ver si hay confusión

		if(cc1){

			System.out.println(a1 + " se detiene porque el conductor ha entrado en confusión");

			if(vueltasC1 > 0){

				vueltasC1--;

			}//Fin if  aver si no es 0

			vueltasC2++;
			System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

		}//Fin if Carro 1 tiene confusión

		if(cc2){

			System.out.println(a2 + " se detiene porque el conductor ha entrado en confusión");

			if(vueltasC2 > 0){

				vueltasC2--;

			}//Fin if  aver si no es 0

			vueltasC1++;
			System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");

		}//Fin if Carro 2 tiene confusión

		 if(cc1 == false && cc2 == false){

			vueltasC1++;
			vueltasC2++;
			System.out.println(a1 + " ha completado " + vueltasC1 + " vueltas");
			System.out.println(a2 + " ha completado " + vueltasC2 + " vueltas");

		}//Fin if imprime si se confunsión o sigue

		System.out.println("*****************************************************************************");

		}//while for vueltas

	}//Fin método carreritas

	public String toString(){

		return "Marca: " +  marca + "\nCompañía: " + compania + "\nColor: " + color;
	}//Fin toString

}//Fin class
