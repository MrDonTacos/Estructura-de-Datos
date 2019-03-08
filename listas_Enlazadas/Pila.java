package listas_Enlazadas;

public class Pila extends Lista{
	
	public Pila() {
		primero = null;
	}

	public Pila insertarCabeza(Nodo x) {
		if(primero==null) {
			primero = x;
		}
		else {
		x.enlace = primero;
		primero = x;
		}
		return this;
	}
	
	public Nodo Sacar() {
		Nodo n = primero;
		primero = n.enlace;
		return n;
	}
	
	public boolean vacia() {
		return (primero==null)?true:false;
	}
	
	public boolean llena() {
		return (primero!=null)?true:false;
	}
	
	public Pila limpiarPila() {
		primero = null;
		return this;
	}
}
