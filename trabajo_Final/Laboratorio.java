package trabajo_Final;

import java.util.Arrays;

public class Laboratorio {
	private boolean internet;
	private Computadora computadora[];
	private int numLaboratorio;
	private int horario[];
	private boolean disponibilidad;
	
	public boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Laboratorio(int numLaboratorio) {
		this.numLaboratorio = numLaboratorio;
		internet = true;
		horario = new int[9];
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
	

	@Override
	public String toString() {
		return "Laboratorio " + numLaboratorio + ", Disponibilidad: " + disponibilidad + "\n[internet=" + internet + ", computadora=" + Arrays.toString(computadora)
				+ ", horario=" + Arrays.toString(horario) + "]\n";
	}
	}

