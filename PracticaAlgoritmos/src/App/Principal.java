package App;
import java.util.Random;
import Util.Algoritmos;
public class Principal {

	public static void main(String[] args) {
		
		  int[] numeros = new int[5];
	        Random rand = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rand.nextInt(10) + 1; 
	        }
	        
	        
	        int[] resultadoFibonacci = new int[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
	        }

	      
	        int[] resultadoFactorial = new int[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
	        }

	    
	        boolean[] resultadoPrimos = new boolean[5];
	        for (int i = 0; i < numeros.length; i++) {
	            resultadoPrimos[i] = Algoritmos.primo(numeros[i]);
	        }

	        
	        
	}

}
