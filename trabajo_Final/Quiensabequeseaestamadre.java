package trabajo_Final;

import java.io.IOException;
import java.util.Random;

public class Quiensabequeseaestamadre {
	
	
	public static void main(String []args) {
		Random rd = new Random();
		Cola cola = new Cola();
		Pila p = new Pila();
		STRA strAleatorio = new STRA();
		Computadora a[] = new Computadora[50];
		Computadora b[] = new Computadora[35];
		Computadora c[] = new Computadora[50];
		Computadora d[] = new Computadora[35];
		Computadora e[] = new Computadora[35];
	Laboratorio lab01 = new Laboratorio(1);
	Laboratorio lab02 = new Laboratorio(2);
	Laboratorio lab03 = new Laboratorio(3);
	Laboratorio lab04 = new Laboratorio(4);
	Laboratorio lab05 = new Laboratorio(5);
	
	for (int j = 0; j < a.length; j++) {
			a [j] = new Computadora("AutoCad");
			c [j] = new Computadora();
		
		try{
			c [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));
			a [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));}catch (Exception IOException) {}
		
		try{
			a [j].setIpFija(strAleatorio.numIp());
			c [j].setIpFija(strAleatorio.numIp());} catch (Exception IOException) {
		}
		
		try {
			a [j].setMacAdrees(strAleatorio.numMacAdress());
			c [j].setMacAdrees(strAleatorio.numMacAdress());
		} 
		
		catch (Exception IOExecption) {
			// TODO: handle exception
		}
		
		
	}
	for (int i = 0; i < b.length; i++) {
		b [i]= new Computadora("Labview");
		d[i] = new Computadora();
		e[i] = new Computadora();
		try{	d[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				e[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				b[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				}catch (Exception IOException) {
					System.out.println(IOException);
				}
	try {	d[i].setIpFija(strAleatorio.numIp());
			e[i].setIpFija(strAleatorio.numIp());
			b[i].setIpFija(strAleatorio.numIp());
			}catch (Exception IOException){
			}
	try {b [i].setMacAdrees(strAleatorio.numMacAdress());
	d [i].setMacAdrees(strAleatorio.numMacAdress());
	e [i].setMacAdrees(strAleatorio.numMacAdress());
	} catch (Exception IOException) {
		// TODO: handle exception
	}}
	lab01.setComputadora(a);
	lab02.setComputadora(b);
	lab03.setComputadora(c);
	lab04.setComputadora(d);
	lab05.setComputadora(e);
	
	

	
	//System.out.println(lab01.toString() + "\n" + lab02.toString() + "\n" + lab03.toString() + "\n" + lab04.toString() + "\n" + lab05.toString());
	Maestro uno = new Maestro("1");
	Maestro dos = new Maestro("2");
	Maestro tres = new Maestro("3");
	Maestro cuatro = new Maestro("4");
	Maestro cinco = new Maestro("5");
	Maestro[]arregloMaestros = {uno,dos,tres,cuatro,cinco};
	Nodo[] nodos = new Nodo[5];
	for (int i = 0; i < arregloMaestros.length; i++) {
		nodos[i] = new Nodo(arregloMaestros[i]);
		cola.insertarCola(nodos[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	for (int j = 0; j<2; j++) {
	for (int i = 0; i < 5; i++) {
		System.out.println("\nNúmero de empleado: "+ arregloMaestros[i].getNumEmpleado());
	System.out.println("\nIngresar: Maestro = 0, Alumno = 1");
	int x = rd.nextInt(1);
	System.out.println(x);
	if (x == 0) {
		System.out.println("Escoga laboratorio 1, 2, 3, 4 o 5");
		
		int laboratorio = rd.nextInt(6);
		System.out.println("Laboratorio escogido: " + laboratorio);
		
		System.out.println("\nEscoga horario de apartado: 1ro ,2do, 3ro, 4to, 5to, 6to, 7mo, 8vo, 9no");
		int horario = rd.nextInt(9)+1;
		System.out.println("El horario escogido fue: " + horario);
		switch (laboratorio) {
		case 0: System.out.println("El maestro no escogió laboratorio"); break;
		case 1:
			if(i != horario ) {
				if (lab01.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab01);
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("Siguiente laboratorio: 2");
				}
			}else {
				System.out.println( "Hora incompatible");
			}
			
		case 2:
			if (lab02.getHorario()[i] != horario) {
				if (lab02.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab02);
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println( "Siguiente laboratorio: 3");
				}
			}else {
				System.out.println("Hora Incompatible");
			}
			
			
		case 3:
			if (lab03.getHorario()[i] != horario) {
				if (lab03.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab03);
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println( "Siguiente laboratorio: 4");
				}
			}else {
				System.out.println("Hora incompatible");
			}
			
			
		case 4:
			if (lab04.getHorario()[i] != horario) {
				if (lab04.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab04);
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("Siguiente laboratorio: 5");
				}
			}else {
				System.out.println( "Hora incompatible");
			}
			
			
		case 5:
			if (lab05.getHorario()[i] != horario) {
				if (lab05.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab05);
						break;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println();
				}
			}else {
				System.out.println();
			}
			default: break;
		
		}
		
		}else {
		
	}
	
	}
	//System.out.println(dos);
		for (int i = 0; i < nodos.length; i++) {
			
		
	System.out.println(arregloMaestros[i].toString());
	
	
		}
	}
	}
}
	
