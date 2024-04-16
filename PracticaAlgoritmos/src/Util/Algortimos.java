package Util;

public abstract class Algortimos {
	
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

}
