package trabajo_1;

public class NumFactorial {

	private int numFactorial;

	public NumFactorial(int numFactorial) {
		this.numFactorial = numFactorial;
	}

	
	public void calculoFactorial() {
		int acumulador = numFactorial;
		for (int i = numFactorial-1; i > 0; i--) {
			acumulador = acumulador * i; 
			
		}
		System.out.println(acumulador);
		
	}
	
}


