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
	Maestro uno = new Maestro(Integer.toString(rd.nextInt()));
	Maestro dos = new Maestro(Integer.toString(rd.nextInt()));
	Maestro tres = new Maestro(Integer.toString(rd.nextInt()));
	Maestro cuatro = new Maestro(Integer.toString(rd.nextInt()));
	Maestro cinco = new Maestro(Integer.toString(rd.nextInt()));
	Maestro[]arregloMaestros = {uno,dos,tres,cuatro,cinco};
	Nodo[] nodos = new Nodo[5];
	for (int i = 0; i < arregloMaestros.length; i++) {
		nodos[i] = new Nodo(arregloMaestros[i]);
		cola.insertarCola(nodos[i]);
	}
	System.out.println(cola.tamañoCola());
	
	
	
	
	
	
	
	
	
	
	
	
	for (int i = 0; i < 5; i++) {
	System.out.println("Ingresar: Maestro = 0, Alumno = 1");
	int x = rd.nextInt(1);
	System.out.println(x);
	if (x == 0) {
		System.out.println("Escoga laboratorio 1, 2, 3, 4 o 5");
		int hora = i;
		int laboratorio = rd.nextInt(5)+1;
		System.out.println(laboratorio);
		switch (laboratorio) {
		case 1:
			if(lab01.getHorario()[i] != hora ) {
				if (lab01.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab01);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("Siguiente laboratorio: 2");
				}
			}else {
				System.out.println( "Siguiente laboratorio: 2");
			}
			
		case 2:
			if (lab02.getHorario()[i] != hora) {
				if (lab02.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab02);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println( "Siguiente laboratorio: 3");
				}
			}else {
				System.out.println("Siguiente laboratorio: 3");
			}
			
			
		case 3:
			if (lab03.getHorario()[i] != hora) {
				if (lab03.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab03);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println( "Siguiente laboratorio: 4");
				}
			}else {
				System.out.println("Siguiente laboratorio: 4");
			}
			
			
		case 4:
			if (lab04.getHorario()[i] != hora) {
				if (lab04.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab04);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("Siguiente laboratorio: 5");
				}
			}else {
				System.out.println( "Siguiente laboratorio: 5");
			}
			
			
		case 5:
			if (lab05.getHorario()[i] != hora) {
				if (lab05.getDisponibilidad() == true) {
					try {
						cola.quitar().getDato().setLaboratorio(lab05);
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
			break;
		default:
			break;
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
	
