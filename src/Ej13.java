public class Ej13 {
	
	public static double factorial(int n) {
		
		int cont = 1;
		double resultado = 0;
		for (int i = 1; i <= n; i++) {
			
			resultado = resultado + (cont * i);
			cont = i;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		System.out.println((num));	
	}
}
