package actividad_final;
import java.util.Scanner;
public class AppComputadora {

	public static void main(String[]args) {
		Pila p = new Pila();
		Computadora primera = new Computadora();
		Computadora segunda = new Computadora();
		Computadora tercera = new Computadora();
		Nodo uno = new Nodo(primera);
		Nodo dos = new Nodo(segunda);
		Nodo tres = new Nodo(tercera);
		
		p.insertarElemento(uno);
		p.insertarElemento(dos);
		p.insertarElemento(tres);
		System.out.println(p.tamañoPila());
	}
}