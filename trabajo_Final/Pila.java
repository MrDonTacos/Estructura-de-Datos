package trabajo_Final;

public class Pila extends Lista{
	
	public Pila() {
		primero = null;
	}

	public Pila insertarElemento(Nodo x) {
		if(primero==null) {
			primero = x;
			x.enlace = null;
		}
		else {
		x.enlace = primero;
		primero = x;
		}
		return this;
	}
	
	public Nodo Sacar() {
		if(pilaVacia()) {
			throw new NullPointerException("Pila vacía, no se puede extraer");
		}
		Nodo n = primero;
		primero = n.enlace;
		return n;
	}
	
	public boolean pilaVacia() {
		return (primero==null)?true:false;
	}
	
	public boolean pilaLlena() {
		return (primero!=null)?true:false;
	}
	
	public Pila limpiarPila() {
		primero = null;
		return this;
	}
	
	public Nodo cimaPila() {
		return primero;
	}
	
	public int tamañoPila() {
		Nodo n = primero;
		int contador = 0;
		if(pilaVacia()) {
		return 0;	
		}
		else {
			while(n.enlace!=null) {
				contador++;
				n = n.enlace;
			}
			contador++;
			return contador;
		}
	}
}