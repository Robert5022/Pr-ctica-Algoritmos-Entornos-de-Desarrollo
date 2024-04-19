package Tests;

import Util.Algoritmos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class test {

	    @Test
	    void testFibonacci(){
	        double numEsperado = 1;
	        double numObtenido= Algoritmos.fibonacci(2);
	        assertEquals(numEsperado, numObtenido);

	    }

	    @Test
	    void testFactorial(){
	        double numEsperado = 24;
	        double numObtenido= Algoritmos.factorial(4);
	        assertEquals(numEsperado, numObtenido);

	    }

	    @Test
	    void testEsPrimo(){
	    	boolean valorEsperado = false;
	        boolean valorObtenido= Algoritmos.primo(4);
	        assertEquals(valorEsperado, valorObtenido);

	    }

}
