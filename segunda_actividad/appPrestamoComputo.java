package segunda_actividad;
import java.util.Scanner;

public class appPrestamoComputo {

	public static void main(String[] args) {
		String aplicaciones[] = new String[5];
		boolean perifericos[] = new boolean[3];
		Computadora uno = new Computadora();	
		System.out.println("Ingrese número de inventario (este numero es una cadena alfanumérica de 15 caracteres)");
		Scanner sc = new Scanner(System.in);
		uno.setNumInventario(sc.nextLine());
		System.out.println("Ingrese 5 aplicaciones especializadas");
		for (int i = 0; i < aplicaciones.length; i++) {
			aplicaciones[i] = sc.nextLine();
		}
		uno.setAplicaciones(aplicaciones);
		System.out.println("Inserte Mac Adress");
		uno.setMacAdrees(sc.nextLine());
		System.out.println("Inserte IP fija");
		uno.setIpFija(sc.nextLine());
		System.out.println("Inserte observaciones al equipo");
		uno.setObservaciones(sc.nextLine());
		System.out.println("Inserte si la maquina tiene alguno de los siguientes perifericos (Ponga true si tiene el periferico, y ponga false si no lo tiene) \n 1. Bluetooth, 2. Bocina, 3. lector de CD)");
		for (int i = 0; i < perifericos.length; i++) {
			System.out.println(i+1 + ".");
			perifericos[i] = sc.nextBoolean();
		}
		uno.setPerifericos(perifericos);
		
		System.out.println(uno.toString());
	}
}
