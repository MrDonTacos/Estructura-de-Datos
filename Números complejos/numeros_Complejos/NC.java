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
	public void Multiplicar(NC z, NC x, NC y) {
		z.setReal(x.getReal() * y.getReal() + ((x.getImagi() * y.getImagi()*-1)));
		z.setImagi(x.getImagi() * y.getReal() + y.getImagi() * x.getReal());
	}
	
	public void Dividir(NC z,NC w, NC x, NC y) {
		//Numerador
		z.setReal(x.getReal() * y.getReal() + (((x.getImagi() * (y.getImagi()*-1)*-1))));
		z.setImagi(x.getImagi() * y.getReal() + (y.getImagi()*-1) * x.getReal());
		//Divisor
		w.setReal((y.getReal() * y.getReal() + y.getImagi() * (y.getImagi()*-1)*-1));
		w.setImagi(y.getReal() * (y.getImagi()*-1) + y.getImagi() * y.getReal());
		
		
	}
	

	
}
