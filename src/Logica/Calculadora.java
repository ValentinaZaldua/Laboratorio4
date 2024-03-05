package Logica;

public class Calculadora {
	
	public static long Division (double dividendo, double divisor) throws Exception {
		if (divisor==0) {
			throw new Exception ("No se puede dividir por cero");
		}
		
		return (long) (dividendo / divisor);
	}
	
	public static long Factorial (long n) throws Exception{
		if (n==1 || n==0) {
			return 1;
		}else if(n<0) {
			throw new Exception ("No se puede calcular el factorial de u numero negativo");
		}
		else if(n>21) {
			throw new Exception("Excede long");
		}
	
		return n * Factorial(n-1);
		
		
        }
       
	
	 public static long Permutacion(int n) throws Exception {
	        if (n < 0 ) {
	            throw new Exception("No se permiten valores negativos en la permutación.");
	        }
	        
	        return Factorial(n);
	    }

		public static long calcularVariacion(int n, int r) throws Exception {
	        if (n < 0 || r < 0) {
	            throw new Exception("No se permiten valores negativos en la variación.");
	        }
	        if (n < r) {
	            throw new Exception("n debe ser mayor o igual que r en la variación.");
	        }
	        return Factorial(n) / Factorial(n - r);
	    }

	    public static long calcularCombinacion(int n, int r) throws Exception {
	        if (n < 0 || r < 0) {
	            throw new IllegalArgumentException("No se permiten valores negativos en la combinatoria.");
	        }
	        if (n < r) {
	            throw new IllegalArgumentException("n debe ser mayor o igual que r en la combinatoria.");
	        }
	        return Factorial(n) / (Factorial(r) * Factorial(n - r));
	    }

		

}
