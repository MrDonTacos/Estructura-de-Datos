package segunda_actividad;
import java.util.Arrays;

public class Computadora {
	
	private String numInventario;
	private String aplicaciones[];
	private boolean disponibilidad;
	private boolean internet;
	private String macAdrees;
	private String ipFija;
	private boolean perifericos[];
	private String observaciones;
	
	public Computadora () {
		
	}


	public Computadora(String numInventario, String[] aplicaciones, boolean internet, String macAdrees, String ipFija,
			boolean perifericos[], String observaciones) {
		this.numInventario = numInventario;
		this.aplicaciones = aplicaciones;
		this.internet = internet;
		this.macAdrees = macAdrees;
		this.ipFija = ipFija;
		this.perifericos = perifericos;
		this.observaciones = observaciones;
	}

	public String getNumInventario() {
		return numInventario;
	}

	public void setNumInventario(String numInventario) {
		
		
		if (numInventario.matches(".*[A-Za-z].*") && numInventario.matches(".*[0-9].*") && numInventario.matches("[A-Za-z0-9]*") && numInventario.length() == 15) {
		    this.numInventario = numInventario;
		   
		} 
		else {
			System.out.println("Inserta un número valido.");
		}
		}
	

	public String[] getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(String[] aplicaciones) {
		this.aplicaciones = aplicaciones;
	}

	public boolean getInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public boolean getDisponibilidad() {
		return internet;
	}

	public void setDisponibilidad(boolean internet) {
		this.internet = internet;
	}

	
	public String getMacAdrees() {
		return macAdrees;
	}

	public void setMacAdrees(String macAdrees) {
		this.macAdrees = macAdrees;
	}

	public String getIpFija() {
		return ipFija;
	}

	public void setIpFija(String ipFija) {
		this.ipFija = ipFija;
	}

	public boolean [] getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(boolean [] perifericos) {
		this.perifericos = perifericos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

	
	@Override
	public String toString() {
		return "Computadora [numInventario=" + numInventario + ", aplicaciones=" + Arrays.toString(aplicaciones)
				+ ", internet=" + internet + ", macAdrees=" + macAdrees + ", ipFija=" + ipFija + ", perifericos="
				+ Arrays.toString(perifericos) + ", observaciones=" + observaciones + "]";
	}

}
