package listas_Enlazadas;
import java.util.Scanner;
public class Lista {
	Scanner sc = new Scanner(System.in);
	private Nodo primero;
	
	public Lista() {
		primero = null;
	}
	
	public Lista insertarCabeza() {
		Nodo cabeza = new Nodo(sc.nextInt());
		cabeza.enlace = primero;
		primero = cabeza;
		return this;
	}
	
	public Lista insertarDespuesNodo(int x) {
		Nodo nuevo = new Nodo(sc.nextInt());
		Nodo m = primero;
		while(x != m.getDato()) {
			m = m.enlace;
		}
		nuevo.enlace = m.enlace;
		m.enlace = nuevo;
		return this;
	}
	
	public Lista insertarCola() {
		Nodo n;
		n = primero;
		Nodo cola = new Nodo(sc.nextInt());
		while(n.enlace!=null) {
			n = n.enlace;
		} n.enlace = cola;
		cola.enlace = null;
			
		return this;
	}
	
	public Lista crearLista() {
		int x;
		primero = null;
		do {
			x = sc.nextInt();
			if(x!=-1)
				primero = new Nodo (x,primero);
		} while (x!=-1);
		return this;
	}
	
	public void imprimirLista() {
		
		Nodo n;
		
		n = primero;
		while (n!=null) {
			System.out.println(n.dato + " ");
			n = n.enlace;
		}
	}
}
