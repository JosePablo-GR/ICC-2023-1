import java.util.Scanner;
import java.util.Random;

public class Proyecto01{

	public static void main(String[] args){

		String usuario;
		String contraseña;
		Scanner entrada = new Scanner(System.in);
		Random aleatorios = new Random();

		System.out.println("Por favor ingresa tu usuario y contraseña");
		System.out.println("Usuario: ");

		usuario = entrada.nextLine();

		System.out.println("Contraseña: ");

		contraseña = entrada.nextLine();

		if(usuario.equals("Miguel") && contraseña.equals("yomero")){

			System.out.println("Hola Miguel!");

		} else if(usuario.equals("icc") && contraseña.equals("profesor")){

			System.out.println("Hola profesor :)");

		} else {

			System.out.println("\nNo estás registrado, sorry");

		}//Fin else if contraseñas

	}//Fin main

}//Fin class
