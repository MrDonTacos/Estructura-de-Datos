package trabajo_Final;

import java.io.IOException;
import java.util.Random;

public class Quiensabequeseaestamadre {
	
	
	public static void main(String []args) {
		Random rd = new Random(System.currentTimeMillis());
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
	Laboratorio todosLaboratorios[] = {lab01, lab02, lab03, lab04, lab05};
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
	Computadora todasComputadoras[][] = {a,b,c,d,e};
	lab01.setComputadora(a);
	lab02.setComputadora(b);
	lab03.setComputadora(c);
	lab04.setComputadora(d);
	lab05.setComputadora(e);
	
	

	
	//System.out.println(lab01.toString() + "\n" + lab02.toString() + "\n" + lab03.toString() + "\n" + lab04.toString() + "\n" + lab05.toString());
	for(int i = 0; i<9; i++) {
		int x =0;
	while(x ==0) {
	switch (rd.nextInt(100)+1) { //Lo que está dentro del switch, te va a arrojar un número del 1-100, y lo vamos a trabajar como un número de porcentaje 100%
	case 1:	case 2:	case 3:	case 4:	case 5:	case 6:	
	case 7:	case 8:	case 9:	case 10: case 11: case 12:
		//Aquí va el código para la llegada de los alumnos 			12% [1-12]
		break;
	case 13: case 14: case 15: case 16: case 17: case 18:	
	case 19: case 20: case 21: case 22:	case 23: case 24:	
		//Aquí va el código de prestamo de maquina
		
		break;	
	
	case 25: case 26 : case 27 : case 28 : case 29 : case 30 : 
	case 31 : case 32: case 33 : case 34 : case 35 : case 36 : 
		//Aquí va el código del prestamo de Laboratorio;
		cola.quitar().getDato().apartarLaboratorio(todosLaboratorios[rd.nextInt(5)], rd.nextInt(9)+1);
		break;
	case 37 : case 38 : case 39 : case 40 : case 41  :case 42 : 
	case 43 : case 44  :
			//Aquí va el código de llegada del profe 				8% [25-44]
			cola.insertarCola(new Nodo(new Maestro(strAleatorio.numInventarioAleatoria(10))));
			cola.imprimirLista();
			System.out.println("\n");
		break;
		
		
		
	 case 45: case 46 : case 47 : case 48 : case 49: case 50 : case 51 : 
	 case 52 : case 53 : case 54 : case 55 : case 56 : case 57  :case 58 : 
	 case 59 : case 60 : case 61 : case 62 : case 63 : case 64 :
			//Aquí va el código de la salida del alumno 			24% [45-64]
		 break;
		 
		 
		 
	case 65: case 66: case 67: case 68: case 69: case 70: case 71: 
	case 72: case 73: case 74 : 
			todasComputadoras[rd.nextInt(5)][rd.nextInt(35)].setFuncionalidad(false);//¿Qué computadora se descompuso?
			for (int j = 0; j < 5; j++) {
				for (int j2 = 0; j2 < 35; j2++) {
					if(todasComputadoras[j][j2].isFuncionalidad() != true) {
						//System.out.println("Tu computadora con núm de inventario: " + j +" "+ j2 +"  " + todasComputadoras[j][j2].getNumInventario() + " se descompuso");
					}
				}
			}//Aquí va el código de descomponerse una computadora 	13% [65-78]
		break;
		
	case 75: case 76: case 77: case 78:
	case 79: case 80: case 81: case 82: case 84: case 85: 
	case 86: case 87: case 88: case 89: case 90: case 91:
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 35; j2++) {
				if(todasComputadoras[j][j2].isFuncionalidad() != true) {
					todasComputadoras[j][j2].setFuncionalidad(true);
					//System.out.println("Tu computadora con núm de inventario: " + j + " " + j2 + "  "+ todasComputadoras[j][j2].getNumInventario() + " fue reparada");
				}
			}
		}
		//Aquí va el código para Reparar una computadora 		12% [79-91]
		break;
		
	case 92 : case 93 : case 94 : case 95 :
	case 96: case 97 : case 98 : case 99 : case 100 :	
			x +=1;//Aquí va el código del cambio de hora			8%	[92-100]
		break;
	}
	
	
	
	}
	}
	}
	}

	
