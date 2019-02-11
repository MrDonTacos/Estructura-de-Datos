package segunda_actividad;

import java.util.Arrays;

public class Computadora {
	
	private String numInventario;
	private String aplicaciones[];
	private boolean disponibilidad;
	private boolean internet;
	private String macAdrees;
	private String ipFija;
	private String perifericos;
	private String observaciones;
	
	public Computadora () {
		
	}


	public Computadora(String numInventario, String[] aplicaciones, boolean internet, String macAdrees, String ipFija,
			String perifericos, String observaciones) {
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
		this.numInventario = numInventario;
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

	public String getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(String perifericos) {
		this.perifericos = perifericos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public void disponible() {
		this.disponibilidad = true;
	}
	public void noDisponible() {
		this.disponibilidad = false;
	}
	
	public void conInternet() {
		this.internet = true;
	}
	
	public void sinInternet() {
		this.internet = false;
	}
	
	@Override
	public String toString() {
		return "Computadora [numInventario=" + numInventario + ", aplicaciones=" + Arrays.toString(aplicaciones)
				+ ", internet=" + internet + ", macAdrees=" + macAdrees + ", ipFija=" + ipFija + ", perifericos="
				+ perifericos + ", observaciones=" + observaciones + "]";
	}

}
