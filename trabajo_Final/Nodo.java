package trabajo_Final;

	
public class Nodo {
							
	protected Maestro dato;	
	protected Exception excepcion;
	protected Alumno alumno;
	protected  Nodo enlace;			
	
	public Nodo(Maestro x) {	
		dato = x;			
		enlace = null;		
	}
	
	public Nodo(Maestro x, Nodo n) {	
		dato = x;					
		enlace = n;					
	}
	
	public Nodo(Alumno x) {	
		alumno = x;			
		enlace = null;		
	}
	
	public Nodo(Exception printStackTrace) {
		excepcion = printStackTrace;			
		enlace = null;
	}

	public Maestro getDato() {
		return dato;
	}

	public void setDato(Maestro dato) {
		this.dato = dato;
	}

	public Nodo getEnlace() {
		return enlace;
	}
	


	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}





}
