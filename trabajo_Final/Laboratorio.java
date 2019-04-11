package trabajo_Final;
import java.io.IOException;
import java.util.Arrays;

public class Laboratorio {
	private boolean internet;
	private Computadora computadora[];
	private int numLaboratorio;
	private boolean horario[];

		public Laboratorio(Computadora[] computadora, int numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
		this.computadora = computadora;
          this.internet = true;
          this.horario = new boolean[9]; 
          this.horario[0]=false;
          this.horario[1]=true;
          this.horario[2]=true;
          this.horario[3]=true;
          this.horario[4]=true;
          this.horario[5]=true;
          this.horario[6]=true;
          this.horario[7]=true;
          this.horario[8]=false;
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


	public void llenadoComputadora(int numeroComputadora) {
		STRA strAleatorio = new STRA();
		
		for (int j = 0; j <= numeroComputadora; j++) {
			if(numLaboratorio == 0) {
				computadora[j] = new Computadora("AutoCad", j);}
			else if(numLaboratorio ==1) {
				computadora[j] = new Computadora("LabView", j);}
			else {
				computadora[j] = new Computadora(" ",j);}
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

   		public boolean[] getHorario() {
   			return horario;
   		}


   		public void setHorario(boolean[] horario) {
   			this.horario = horario;
   		}
   		
   		public void cambiarHorario(int hora) {
   			horario[hora] = false;
   		}


	@Override
	public String toString() {
		return "Laboratorio [internet=" + internet + ", computadora=" + Arrays.toString(computadora)
				+ ", numLaboratorio=" + numLaboratorio + ", horario=" + Arrays.toString(horario) + "]";
	}
}
	