package trabajo_Final;


public class Quiensabequeseaestamadre {
	
	
	public static void main(String []args) {
	Computadora a[] = new Computadora[50];
	Laboratorio lab01 = new Laboratorio(50,  01);
	Laboratorio lab02 = new Laboratorio(35,  02);
	Laboratorio lab03 = new Laboratorio(50,  03);
	Laboratorio lab04 = new Laboratorio(35,  04);
	Laboratorio lab05 = new Laboratorio(35,  05);
	/*
	for (int j = 0; j < a.length; j++) {
		a [j] = new Computadora();
		lab01.setComputadora(a);
		System.out.println(j + lab01.toString());
	}*/
	
	System.out.println(lab01.toString());
}

}

