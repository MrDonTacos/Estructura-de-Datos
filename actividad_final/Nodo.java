package actividad_final;

	//Se podr�a decir que este es el TDA del nodo
public class Nodo {
							//El nodo consta de dos partes:
	Computadora dato;				//Un dato, que puede ser de cualquier tipo, por ejemplo aqui podr�a ir el dato Computadora del tda
	Nodo enlace;			//Y un enlace, que es la parte que va a hacer uni�n con otros nodos
	
	public Nodo(Computadora x) {	//Este contructor inicializa el dato int del Nodo, 
		dato = x;			//El dato recibe el parametro de x para inicializarlo
		enlace = null;		//Y el enlace hace referencia a null, es decir creamos un nodo que apunta al vac�o
	}
	
	public Nodo(Computadora x, Nodo n) {	//Colocamos en los parametro el dato y un Nodo
		dato = x;					//Inicializamos el dato, al igual que en el primer constructor
		enlace = n;					//Pero en este tambi�n inicializamos el enlace, de tal forma que enlaza el nodo creado con otro nodo
	}

	
	//M�todos generales para recibir los datos de las variables y para settearlos
	public Computadora getDato() {
		return dato;
	}

	public void setDato(Computadora dato) {
		this.dato = dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}





}
