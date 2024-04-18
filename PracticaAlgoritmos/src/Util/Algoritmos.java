package Util;

public abstract class Algoritmos {
	
	/**
	 * 
	 * Metodo para calcular el num fibonacci
	 * @param num El numero
	 * @return
	 */
	
	public static int fibonacci (int num) {
		int num1= 0;
		int num2= 1;
		int auxiliar;
		 for(int i= 0; i<num; i++ ) {
		auxiliar = num2 + num1;
		num1 = num2;
		num2 = auxiliar;
			 
		 }
		return num1;	
	}
	
	public static int factorial(int num) {
		int numf = 1;
		for(int i = num; i > 0; i--) {
			
			numf*=i;
			
			
			
		}
		return numf;
	}

	
	public static boolean primo(int num) {
		
	 if (num <= 1) {
         return false;
     }
     for (int i = 2; i <= num / 2; i++) {
         if (num % i == 0) {
             return false;
         }
     }
     return true;
	}
}
