package primerParcial;

public class NumComplejo {

	private double real;
	private double imagi;
	
	public NumComplejo() {
		real = 0.0;
		imagi = 0.0;
	}
	
	public NumComplejo(double real, double imagi) {
		this.real = real;
		this.imagi = imagi;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImagi() {
		return imagi;
	}

	public void setImagi(double imagi) {
		this.imagi = imagi;
	}


	@Override
	public String toString() {
		
		return real  + " " + imagi + "i";
	}

	public static NumComplejo suma(NumComplejo x, NumComplejo y) {
		double z = x.getReal() + y.getReal();
		double w = x.getImagi() + y.getImagi();
		return new NumComplejo (z,w);
	}
	
	public static NumComplejo resta (NumComplejo x, NumComplejo y) {
		double z = x.getReal() - y.getReal();
		double w = x.getImagi() - y.getImagi();
		return new NumComplejo (z,w);
	}
	
	public static NumComplejo multiplicacion (NumComplejo x, NumComplejo y) {
		
		double z = x.getReal() * y.getReal() + (x.getImagi() * (y.getImagi()*-1));
		double w = x.getImagi() * y.getReal() + y.getImagi() * x.getReal();
		return new NumComplejo (z,w);
	}
	
	public static void division (NumComplejo x, NumComplejo y) {
		System.out.println("Tu división es: " + numerador(x, y) + "/" + denominador(x, y));
	}
	
	
	public static NumComplejo numerador(NumComplejo x, NumComplejo y) {
		double z = x.getReal() * y.getReal() + (((x.getImagi() * (y.getImagi()*-1)*-1)));
		double w = x.getImagi() * y.getReal() + (y.getImagi()*-1) * x.getReal();
		return new NumComplejo(z,w);
	}
	
	public static NumComplejo denominador(NumComplejo x, NumComplejo y) {
		double z = y.getReal() * y.getReal() + y.getImagi() * (y.getImagi()*-1)*-1;
		double w = y.getReal() * (y.getImagi()*-1) + y.getImagi() * y.getReal();
		return new NumComplejo(z,w);
	}
	
	
	
	}
