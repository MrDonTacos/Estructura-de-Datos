package trabajo_Final;

import java.io.IOException;

public class Maestro {
	
	private String numEmpleado;
	private Laboratorio laboratorio;

	public Maestro(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) throws IOException{
		if(laboratorio.getDisponibilidad()==true) {
			laboratorio.setDisponibilidad(false);
			this.laboratorio = laboratorio;
			}else {
				throw new NullPointerException();
			}
	}
	@Override
	public String toString() {
		return "Maestro [numEmpleado=" + numEmpleado + ", laboratorio=" + laboratorio + "]";
	}
	
}
