package trabajo_Final;
import java.util.Arrays;

public class Laboratorio {
	private boolean internet;
	private Computadora computadora[];
	private int numLaboratorio;
	private String horario[];
	private boolean disponibilidad;
	
        public Laboratorio(){
            this.disponibilidad = true;
            this.internet = true;
            this.horario = new String[9]; 
            this.horario[0]="9-10";
            this.horario[1]="10-11";
            this.horario[2]="11-12";
            this.horario[3]="12-13";
            this.horario[4]="13-14";
            this.horario[5]="14-15";
            this.horario[6]="15-16";
            this.horario[7]="16-17";
            this.horario[8]="17-18";
            
        }
        
         public Laboratorio(String[] horario){
            this.disponibilidad = true;
            this.internet = true;
            this.horario = new String[9]; 
            this.horario[0]="9-10";
            this.horario[1]="10-11";
            this.horario[2]="11-12";
            this.horario[3]="12-13";
            this.horario[4]="13-14";
            this.horario[5]="14-15";
            this.horario[6]="15-16";
            this.horario[7]="16-17";
            this.horario[8]="17-18";
        }
         
         public Laboratorio(int numLaboratorio) {
     		this.disponibilidad = true;
             this.internet = true;
             this.horario = new String[9]; 
             this.horario[0]="9-10";
             this.horario[1]="10-11";
             this.horario[2]="11-12";
             this.horario[3]="12-13";
             this.horario[4]="13-14";
             this.horario[5]="14-15";
             this.horario[6]="15-16";
             this.horario[7]="16-17";
             this.horario[8]="17-18";
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

	public String[] getHorario() {
		return horario;
	}

	public void setHorario(String[] horario) {
		         
for (int i = 0; i < horario.length; i++) {
		this.horario = horario;}
		
	}	
	
	@Override
	public String toString() {
		return "Laboratorio = " + numLaboratorio + ", Internet = "   + internet+ "\n" + Arrays.toString(computadora) + "\n" + ", horario = " + Arrays.toString(horario);
}

    }
