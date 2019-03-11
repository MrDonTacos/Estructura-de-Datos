package trabajo_Final;

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
		this.aplicaciones = new String [5];
		this.numInventario = "000000000000000";
		this.aplicaciones[0] = "Eclipse";
		this.aplicaciones[1] = "MSOffice";
		this.aplicaciones[2] = "MathLab";
		this.numInventario = "000000000000000";
	}
	
	public Computadora(String appExclusiva) {
		this.aplicaciones = new String [5];
		this.aplicaciones[3] = appExclusiva;
		this.aplicaciones[0] = "Eclipse";
		this.aplicaciones[1] = "MSOffice";
		this.aplicaciones[2] = "MathLab";
		this.numInventario = "000000000000000";
	}


	public String getNumInventario() {
		return numInventario;
	}

	public void setNumInventario(String numInventario) {

		
		
		if (numInventario.matches(".*[A-Za-z].*") && numInventario.matches(".*[0-9].*") && numInventario.matches("[A-Za-z0-9]*") && numInventario.length() == 15 || numInventario.equals("000000000000000")) {
		    this.numInventario = numInventario;
		   
		} 
		else {
			System.out.println("Inserta un n�mero valido.");
		}
		}
	


	public String[] getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(String[] aplicaciones) {

		for (int i = 0; i < aplicaciones.length; i++) {
		for (int j = i+1; j < aplicaciones.length; j++) {
			if(aplicaciones[i].equals(aplicaciones[j])) {
				System.out.println("Tu aplicaci�n " + aplicaciones[i]+  " est� repetida con la aplicacion " + aplicaciones[j]);
				aplicaciones[i] = null;
			}else {this.aplicaciones = aplicaciones;}
		}
		}

	}

	public boolean getInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {

		if (this.ipFija != null && this.macAdrees != null) {
			this.internet = true;	
		}else {this.internet = false;}

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

		macAdrees.toUpperCase();
		for(int j = 0;j<=17;j+=3) {
		for(char i=65; i<=70; i++) {
			for(char k=48;k<=57;k++) {
		if((macAdrees.charAt(j) == i || macAdrees.charAt(j) == k) && (macAdrees.charAt(j+1) == i || macAdrees.charAt(j+1) == k) && macAdrees.charAt(j+2) ==58 && macAdrees.length() == 18) {
		this.macAdrees = macAdrees;
		}
		}
		}
	}
		}


	public String getIpFija() {
		return ipFija;
	}

	public void setIpFija(String ipFija) {

		try {
	        if ( ipFija == null || ipFija.isEmpty() ) {
	        	System.out.println("Inserte una Ip Fija valida");
	        }

	        String[] parts = ipFija.split( "\\." );
	        if ( parts.length != 4 ) {
	        	ipFija=null;
	        }

	        for ( String s : parts ) {
	            int i = Integer.parseInt( s );
	            if ( (i < 0) || (i > 255) ) {
	            	ipFija=null;
	            }
	        }
	        if ( ipFija.endsWith(".") ) {
	        	ipFija=null;
	        }

	    } catch (NumberFormatException nfe) {
	    	System.out.println("Ingrese una Ip valida");
	    }this.ipFija = ipFija;
	}
		
	

	public boolean [] getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(boolean [] perifericos) {

		this.ipFija = ipFija;
	}


	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	



	
	@Override
	public String toString() {
		return "\nComputadora [numInventario=" + numInventario + ", aplicaciones=" + Arrays.toString(aplicaciones)
				+ ", internet=" + internet + ", macAdrees=" + macAdrees + ", ipFija=" + ipFija + ", perifericos="
				+ Arrays.toString(perifericos) + ", observaciones=" + observaciones + "]";

	}

}