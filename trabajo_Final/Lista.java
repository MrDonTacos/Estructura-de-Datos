package trabajo_Final;
public class Lista {
										
	protected Nodo primero;				//Inicializamos un nodo en la lista, que va servir como el Auxiliar, en este caso lo llame priemro
	
	public Lista() {					//Constructor para crear una lista vacía
		primero = null;					//Inicializamos el primer nodo a null, esto quiere decir que se crea una lista vacía 
	}
	
	public Lista insertarCabeza(Nodo x) {				
		if(primero==null) {
		primero = x;
		x.enlace = null;}
		else{
	x.enlace = primero;
	primero = x;
	}
	return this;
	
}
	
	
	
	
	public void imprimirLista() {
		
		Nodo n;
		
		n = primero;
		while (n!=null) {
			System.out.println(n.informe + " ");
			n = n.enlace;
		}
	}
}
