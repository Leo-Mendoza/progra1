public class Ej13 {
	
	public static double factorial(int n) {
		
		double resultado = 1;
		for (int i = 1; i <= n; i++) {
			
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		System.out.println(factorial(num));	
	}
}
