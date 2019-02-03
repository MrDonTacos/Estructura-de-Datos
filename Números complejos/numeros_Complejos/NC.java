package numeros_Complejos;

public class NC {

	private float real;
	private float imagi;
	
	public NC () {
		
	}
	
	public NC(float real, float imagi) {
		this.real = real;
		this.imagi = imagi;
	}

	public float getReal() {
		return real;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public float getImagi() {
		return imagi;
	}

	public void setImagi(float imagi) {
		this.imagi = imagi;
	}
	
	public void Sumar(NC z, NC x, NC y) {
		z.setReal(x.getReal()+y.getReal());
		z.setImagi(x.getImagi()+y.getImagi());
	}
	
	public void Restar(NC z, NC x, NC y) {
		z.setReal(x.getReal()-y.getReal());
		z.setImagi(x.getImagi()-y.getImagi());
	}
	
	
	
}
