package trabajo_Final;

public class Cola extends Lista{	//PEPSI = Primeras Entradas Primeras SalIdas
	Nodo cola;
	
	public Cola() {		//Lista vacía
	primero = cola = null;
}

	/*public Cola(Nodo x) {
		if(cola==null) {
			
			primero = x;
			x.enlace = null;
			cola = primero;
		}
	}*/
	
	public void insertarCola(Nodo x) {
		if(isEmpty()) {
			primero = x;
		}
		else {
			cola.enlace = x;
		}
		cola = x;
	}
	
	public Nodo quitar()throws Exception{
		Nodo n = new Nodo ();
		if(!isEmpty()) {
			n.setDato(primero.getDato());
			primero = primero.enlace;
		}else {
		throw new Exception("Eliminar de una cola vacía");
		}
		return n;
	}
	
	public boolean isEmpty() {
		return (primero==null)?true:false;
	}

	public boolean colaLlena() {
		return (cola!=null)?true:false;
	}

	public Nodo frente() {
		return primero;
	}
	
	public int tamanoCola() {
		Nodo aux = primero;
		int contador = 0;
		while(aux.enlace!=null) {
			contador++;
			aux = aux.enlace;
		}
		contador++;
		return contador;
	}

}