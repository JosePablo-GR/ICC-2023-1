import java.util.Scanner;
import java.util.Random;

public class Robot{

  public static void main(String... args){

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();
  Operaciones miOp = new Operaciones();

  boolean encendido;

  System.out.println("Bienvenido al menú del robot interactivo");

  System.out.println("\n¿Deseas preder al robot? [S/N]");
  char prender = sc.nextLine().toUpperCase().charAt(0);

  if(prender == 'S'){

    encendido = true;

  } else {

  encendido = false;

  }//Fin prender

  while(encendido){

    System.out.println("\n¿Qué deseas hacer?");
    System.out.println("Tendrás que resolver 10 operaciones");

    System.out.println("\n1. Generar operaciones básicas");
    System.out.println("2. Generar operaciones intermedias");
    System.out.println("3. Generar operaciones avanzadas");
    System.out.println("4. Apagar el robot");

    int op = sc.nextInt();
    
    if(op == 1){

      System.out.println();
      miOp.basicas();

    } else if(op == 2){

      System.out.println();
      miOp.intermedias();

    } else if(op == 3){

      System.out.println();
      miOp.avanzadas();      

    } else if(op == 4) {

      encendido = false;
      System.out.println("\nBye bye");

    } else {

      System.out.println("Opción incorrecta");

    }//Fin if op

  }//Fin while

}//Fin main
  
}//Fin class Robot
