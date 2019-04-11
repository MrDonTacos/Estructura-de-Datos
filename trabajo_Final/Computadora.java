package trabajo_Final;

import java.io.IOException;
import java.util.Arrays;

public class Computadora {
	
	private String numInventario;
	private String aplicaciones[];
	private boolean disponibilidad;
	private boolean internet;
	private String macAdrees;
	private String ipFija;
	private String perifericos[];
	private String observaciones;
	private boolean funcionalidad;
	private int numPC;
	
	

	public Computadora (int numPC) {
		disponibilidad = true;
		this.numPC = numPC;
		funcionalidad = true;
		this.aplicaciones = new String [3];
		this.numInventario = "000000000000000";
		this.aplicaciones[0] = "Eclipse";
		this.aplicaciones[1] = "MSOffice";
		this.aplicaciones[2] = "MathLab";
		this.perifericos = new String [2];
        this.perifericos[0] = "Bocinas";
        this.perifericos[1] = "Quemador de CD";
		this.numInventario = "000000000000000";
	}
	
	public Computadora(String appExclusiva, int numPC) {
		disponibilidad = true;
		this.numPC = numPC;
		funcionalidad = true;
		this.aplicaciones = new String [4];
		this.aplicaciones[3] = appExclusiva;
		this.aplicaciones[0] = "Eclipse";
		this.aplicaciones[1] = "MSOffice";
		this.aplicaciones[2] = "MathLab";
		this.numInventario = "000000000000000";
	}


	public String getNumInventario() {
		return numInventario;
	}

	public void setNumInventario(String numInventario) throws IOException{

		
		
		if (numInventario.matches(".*[A-Za-z].*") && numInventario.matches(".*[0-9].*") && numInventario.matches("[A-Za-z0-9]*") && numInventario.length() == 15 || numInventario.equals("000000000000000")) {
		    this.numInventario = numInventario;
		   
		} 
		else {
			//System.out.println("Inserta un n�mero valido.");
		}
		}
	


	public String[] getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(String[] aplicaciones) {

		for (int i = 0; i < aplicaciones.length; i++) {
		for (int j = i+1; j < aplicaciones.length; j++) {
			if(aplicaciones[i].equals(aplicaciones[j])) {
				//System.out.println("Tu aplicaci�n " + aplicaciones[i]+  " est� repetida con la aplicacion " + aplicaciones[j]);
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
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	
	public String getMacAdrees() {
		return macAdrees;
	}

	public void setMacAdrees(String macAdrees) throws IOException{

		this.macAdrees = macAdrees.toUpperCase();
		

                       

if(macAdrees.matches(".[A-F].") && macAdrees.matches(".[0-9].") && macAdrees.matches("[0-9a-fA-F]{2}:[0-9a-fA-F]{2}:[0-9a-fA-F]{2}:[0-9a-fA-F]{2}:[0-9a-fA-F]{2}:[0-9a-fA-F]{2}") && macAdrees.length() == 17) {
               this.macAdrees = macAdrees;

              }
            
		}


	public String getIpFija()  {
		return ipFija;
	}

	public void setIpFija (String ipFija) throws IOException{

		
	        if ( ipFija == null || ipFija.isEmpty() ) {
	        	ipFija=null;
	        	
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

	        this.ipFija = ipFija;
	}
		
		public String [] getPerifericos() {
			return perifericos;
		}

	
		public void setPerifericos(String[] perifericos) {

			for (int i = 0; i < perifericos.length; i++) {
				this.perifericos = perifericos;}
		}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	



	
	public boolean isFuncionalidad() {
		return funcionalidad;
	}

	public void setFuncionalidad(boolean funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	
	public int getNumPC() {
		return numPC;
	}

	public void setNumPC(int numPC) {
		this.numPC = numPC;
	}

	@Override
	public String toString() {
		return "\nNumero de computadora " + (numPC+1) + ": Computadora [numInventario=" + numInventario + ", aplicaciones=" + Arrays.toString(aplicaciones)
				+ ", internet=" + internet + ", macAdrees=" + macAdrees + ", ipFija=" + ipFija + ", perifericos="
				+ Arrays.toString(perifericos) + ", observaciones=" + observaciones + " Funcionalidad: " + funcionalidad + "]";

	}

}