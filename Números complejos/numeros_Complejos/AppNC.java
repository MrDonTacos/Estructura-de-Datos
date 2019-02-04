package numeros_Complejos;

public class AppNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NC a,b,c,d;
		a = new NC(5,1);
		b = new NC(2,7);
		c = new NC();
		d = new NC();
		c.Sumar(c,a,b);
		System.out.println("Suma: "+ c.getReal() + "," + c.getImagi() + "i\n");
		c.Restar(c, a, b);
		System.out.println("Resta: " +c.getReal() + "," + c.getImagi() + "i\n");
		c.Multiplicar(c, b, a);
		System.out.println("Multiplicacion: " +c.getReal() + "," + c.getImagi() + "i\n");
		c.Dividir(c, d, a, b);
		System.out.println("Division: " +c.getReal() + "," + c.getImagi() + "i/" + d.getReal() + "," + d.getImagi() + "i");
	}
	
}
