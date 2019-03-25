package trabajo_Final;

public class Cola extends Lista{	//PEPSI = Primeras Entradas Primeras SalIdas
	Nodo cola;
	
	public Cola() {		//Lista vacía
	cola = null;
}

	public Cola(Nodo x) {
		if(cola==null) {
			
			primero = x;
			x.enlace = null;
			cola = primero;
		}
	}
	
	public Cola insertarCola(Nodo x) {
		cola.enlace = x;
		cola = x;
		x.enlace = null;
		return this;
		}
	
	public Nodo quitar(){
		Nodo n;
		if(cola==null) {
			throw new NullPointerException("Error de bajo flujo");
		}
		n= primero;
		primero = primero.enlace;
		return n;
	}
	
	public boolean isEmpty() {
		
		return (cola==null)?true:false;
	}

	public boolean colaLlena() {
		return (cola!=null)?true:false;
	}

	public Nodo frente() {
		return primero;
	}
	
	public int tamañoCola() {
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