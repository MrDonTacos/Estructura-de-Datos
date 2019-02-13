package tercera_actividad;

public class NumFactorialR {

	private int nfr;
	private int acumulador;
	public NumFactorialR(int nfr) {
		this.nfr = nfr;
		acumulador = nfr;
	}

	public void calcularFactorial() {
		if (nfr >1) {
			acumulador *=nfr-1;
			nfr -= 1;
			calcularFactorial();
		}else {
		System.out.println(acumulador);
		}
	}
	
	
}
