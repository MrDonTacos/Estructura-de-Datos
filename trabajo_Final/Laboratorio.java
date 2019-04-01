package trabajo_Final;
import java.io.IOException;
import java.util.Arrays;

public class Laboratorio {
	private boolean internet;
	private Computadora computadora[];
	private int numLaboratorio;
	private int horario[];
	private boolean disponibilidad;
	
		
	
        public Laboratorio(Computadora[] computadora) {
		this.computadora = computadora;
	}

		public Laboratorio(){
            this.disponibilidad = true;
            this.internet = true;
            this.horario = new int[9]; 
            this.horario[0]=1;
            this.horario[1]=2;
            this.horario[2]=3;
            this.horario[3]=4;
            this.horario[4]=5;
            this.horario[5]=6;
            this.horario[6]=7;
            this.horario[7]=8;
            this.horario[8]=9;
            
        }
        
         public Laboratorio(String[] horario){
        	 this.disponibilidad = true;
             this.internet = true;
             this.horario = new int[9]; 
             this.horario[0]=1;
             this.horario[1]=2;
             this.horario[2]=3;
             this.horario[3]=4;
             this.horario[4]=5;
             this.horario[5]=6;
             this.horario[6]=7;
             this.horario[7]=8;
             this.horario[8]=9;
        }
         
         public Laboratorio(int numLaboratorio) {
        	 this.numLaboratorio = numLaboratorio;
        	 this.disponibilidad = true;
             this.internet = true;
             this.horario = new int[9]; 
             this.horario[0]=1;
             this.horario[1]=2;
             this.horario[2]=3;
             this.horario[3]=4;
             this.horario[4]=5;
             this.horario[5]=6;
             this.horario[6]=7;
             this.horario[7]=8;
             this.horario[8]=9;
     		}
        
	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public Computadora [] getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora[] a) {
		this.computadora = a;
	}

	public int getNumlaboratorio() {
		return numLaboratorio;
	}

	public void setNumlaboratorio(int numlaboratorio) {
		this.numLaboratorio = numlaboratorio;
	}

	public int[] getHorario() {
		return horario;
	}
	
	public void setHorario(int[] horario) {
		this.horario = horario;
	}
	
	public void llenadoComputadora(int numeroComputadora, int numLaboratorio) {
		STRA strAleatorio = new STRA();
		this.numLaboratorio = numLaboratorio;
		for (int j = 0; j <= numeroComputadora; j++) {
			if(numLaboratorio == 0) {
				computadora[j] = new Computadora("AutoCad", j);}
			else if(numLaboratorio ==1) {
				computadora[j] = new Computadora("LabView", j);}
			else {
				computadora[j] = new Computadora(j);}
		try{
			computadora [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		}catch (Exception IOException) {}
		
		try{
			computadora [j].setIpFija(strAleatorio.numIp());
			} catch (Exception IOException) {
		}
		
		try {
			computadora [j].setMacAdrees(strAleatorio.numMacAdress());
			
		} 
		
		catch (Exception IOExecption) {
			// TODO: handle exception
		}
		
		
	}
		
	}

	
	@Override
	public String toString() {
		return "Laboratorio = " + numLaboratorio + ", Internet = "   + internet+ "\n" + Arrays.toString(computadora) + "\n" + ", horario = " + Arrays.toString(horario) + ", Disponibilidad " + disponibilidad;
}

    }
