package trabajo_Final;

import java.util.Arrays;

public class Laboratorio {
	private boolean internet;
	private Computadora computadora[];
	private int numlaboratorio;
	private int horario[];
	
	public Laboratorio(int numLaboratorio) {
		this.numlaboratorio = numLaboratorio;
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
		return numlaboratorio;
	}

	public void setNumlaboratorio(int numlaboratorio) {
		this.numlaboratorio = numlaboratorio;
	}

	public int[] getHorario() {
		return horario;
	}

	public void setHorario(int[] horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Laboratorio [internet=" + internet + ", computadora=" + Arrays.toString(computadora)
				+ ", numlaboratorio=" + numlaboratorio + ", horario=" + Arrays.toString(horario) + "]\n";
	}
	}

