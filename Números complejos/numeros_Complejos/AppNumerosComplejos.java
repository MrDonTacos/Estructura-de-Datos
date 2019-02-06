package primerParcial;

public class appNumerosComplejos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumComplejo a,b,c;
		a = new NumComplejo(7,4);
		b = new NumComplejo(9,22);
		c = new NumComplejo();
		
		System.out.println("Tu suma es: " + c.suma(a, b));
		System.out.println("Tu resta es: " + c.resta(a, b));
		System.out.println("Tu multiplicación es: " + c.multiplicacion(a, b));
		System.out.println("Tu división es: " );
		c.division(a, b);
	}

}

