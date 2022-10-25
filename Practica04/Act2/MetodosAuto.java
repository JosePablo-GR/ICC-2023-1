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
				System.out.println("El auto se apagará...");
				setEncendido(false);

			}//Fin if nos quedamos sin gasolina

		}//Fin for auto avanza

	}//Fin método avanzar

	public void cargarGasolinaDinero(double dinero){

		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		int n = aleatorios.nextInt(5)+1;
		System.out.println();

		for(int x = 1; x <= n; x++){

			System.out.println("Cargando gasolina...");
		}

		while(dinero > 0.00){

			this.gasolinaActual++;

			if(){}

		}//Fin while recargas gasolina

	}//Fin método cargarGasolinaDinero

	public String toString(){

		return "Marca: " +  marca + "\nCompañía: " + compania + "\nColor: " + color;
	}//Fin toString

}//Fin class
