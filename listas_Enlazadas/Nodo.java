package listas_Enlazadas;

public class Nodo {

	int dato;
	Nodo enlace;
	
	public Nodo(int x) {	//Este contructor inicializa el dato int del Nodo, 
		dato = x;			
		enlace = null;		//Y el enlace hace referencia a null, es decir que el siguiente nodo no existe
	}
	
	public Nodo(int x, Nodo n) {	//Colocamos en los parametro el dato y un Nodo
		dato = x;					
		enlace = n;					//Inicializamos el enlace de tal forma que referencia a un nodo, enlaza el nodo creado con otro nodo
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}





}
