package numeros_Complejos;

public class AppNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NC a,b,c;
		a = new NC(5,1);
		b = new NC(2,7);
		c = new NC();
		c.Sumar(c,a,b);
		System.out.println(c.getReal() + "," + c.getImagi() + "i");
		c.Multiplicar(c, b, a);
		System.out.println(c.getReal() + "," + c.getImagi() + "i");
		c.Dividir(c, a, b);
		System.out.println(c.getReal() + "," + c.getImagi() + "/");
	}
	
}
