import java.util.Scanner;

public class Usuario{

	public static void main(String[] args){

	String usuario;
	boolean sePudo = true;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Hola! Para ingresar a tus datos escribe tu usuario");

	System.out.println("Usuario: ");
	usuario = entrada.next();


		if(!(usuario.equals("JosePablo"))){

			while (sePudo){

			System.out.println("\nUsuario inválido, intente de nuevo: ");

			usuario = entrada.next();


			if(usuario.equals("JosePablo")){

				sePudo = false;
				System.out.println("\nBienvenido a tus datos, " + usuario);

				}//Fin ya no estás en while

			}//Fin while

		}//Fin otra vez

	}//Fin main

}//Fin class
