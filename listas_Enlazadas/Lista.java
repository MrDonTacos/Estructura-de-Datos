package listas_Enlazadas;
import java.util.Scanner;
public class Lista {
	Scanner sc = new Scanner(System.in);	//Usamos Scanner para que usuario pueda ingresar los datos que quiera en los nodos
	protected Nodo primero;				//Inicializamos un nodo en la lista, que va servir como el Auxiliar, en este caso lo llame priemro
	
	public Lista() {					//Constructor para crear una lista vacía
		primero = null;					//Inicializamos el primer nodo a null, esto quiere decir que se crea una lista vacía 
	}
	
	public Lista insertarCabeza() {				//Metodo con el cual vamos a insertar la cabeza del nodo
		Nodo cabeza = new Nodo(sc.nextInt());	//Creamos un nodo con el contructor que inicializa el dato, pero su enlace hace referencia a null, ya que en ese momento su enlace no apunta a ningún lado (Está afuera de la lista)
		cabeza.enlace = primero;				//Hacemos que el enlace de nuetro nodo (Que hasta ahora era null), apunte a primero (Que sería el primer nodo que estaba en la lista)
		primero = cabeza;						//Ya que sujetamos el nodo "primero" con el nodo "cabeza", ahora hacemos que nuetro "primero" (Que sería el primer nodo) se vuelva la cabeza
		return this;							//Nos va a regresar simplemente las instrucciones del método
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
	public Lista insertarAntesNodo(int x) {
		Nodo nuevo = new Nodo(sc.nextInt());
		Nodo m = primero;
		while(x < m.getDato()) {
			m = m.enlace;
		}
		nuevo.enlace=m.enlace;
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