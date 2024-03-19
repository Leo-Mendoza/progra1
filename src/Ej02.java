import java.util.Scanner;
public class Ej2 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Hola "+ nombre);
		
		scan.close();
	}	
}