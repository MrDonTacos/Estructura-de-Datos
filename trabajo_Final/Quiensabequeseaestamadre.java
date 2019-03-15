package trabajo_Final;

import java.io.IOException;

public class Quiensabequeseaestamadre {
	
	
	public static void main(String []args) {
		STRA strAleatorio = new STRA();
		Computadora a[] = new Computadora[50];
		Computadora b[] = new Computadora[35];
		Computadora c[] = new Computadora[50];
		Computadora d[] = new Computadora[35];
		Computadora e[] = new Computadora[35];
	Laboratorio lab01 = new Laboratorio(01);
	Laboratorio lab02 = new Laboratorio(02);
	Laboratorio lab03 = new Laboratorio(03);
	Laboratorio lab04 = new Laboratorio(04);
	Laboratorio lab05 = new Laboratorio(05);
	
	for (int j = 0; j < a.length; j++) {
		a [j] = new Computadora();
		c [j] = new Computadora();
		try{c [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		a [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));}catch (Exception IOException) {}
		try{a [j].setIpFija(strAleatorio.numIp());
		c [j].setIpFija(strAleatorio.numIp());} catch (Exception IOException) {
		}
		try {a [j].setMacAdrees(strAleatorio.numMacAdress());
		c [j].setMacAdrees(strAleatorio.numMacAdress());
		} catch (Exception IOExecption) {
			// TODO: handle exception
		}
		
	}
	for (int i = 0; i < b.length; i++) {
		b [i]= new Computadora();
		d[i] = new Computadora();
		e[i] = new Computadora();
		try{	d[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				e[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				b[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
				}catch (Exception IOException) {
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
	
	System.out.println(lab01.toString() + "\n" + lab02.toString() + "\n" + lab03.toString() + "\n" + lab04.toString() + "\n" + lab05.toString());
}

}
