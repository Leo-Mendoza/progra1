package practica0;

import java.util.Scanner;
public class Ej02 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Hola "+ nombre);
		
		scan.close();
	}	
}