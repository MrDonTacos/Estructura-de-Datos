package trabajo_Final;


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
		c [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		a [j].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		try{a [j].setIpFija(strAleatorio.numIp(10));} catch (Exception IOException) {
			System.out.println("null");
		}
	}
	for (int i = 0; i < b.length; i++) {
		b [i]= new Computadora();
		d[i] = new Computadora();
		e[i] = new Computadora();
		d[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		e[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
		b[i].setNumInventario(strAleatorio.numInventarioAleatoria(15));
	}
	lab01.setComputadora(a);
	lab02.setComputadora(b);
	lab03.setComputadora(c);
	lab04.setComputadora(d);
	lab05.setComputadora(e);
	
	System.out.println(lab01.toString() + "\n" + lab02.toString() + "\n" + lab03.toString() + "\n" + lab04.toString() + "\n" + lab05.toString());
}

}

