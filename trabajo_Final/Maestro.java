package trabajo_Final;

import java.io.IOException;

public class Maestro {
	

	private Laboratorio laboratorio;

	public Maestro() {
		
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
	
	public Laboratorio apartarLaboratorio(Laboratorio numLaboratorio, int hora) {
		return numLaboratorio;
	}
	
	

	@Override
	public String toString() {
		return "Maestro   " + "laboratorio=" + laboratorio + "]";
	}
	
}
