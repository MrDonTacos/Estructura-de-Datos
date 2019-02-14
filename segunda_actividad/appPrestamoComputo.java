package segunda_actividad;
import java.util.Scanner;

public class appPrestamoComputo {

	public static void main(String[] args) {
		String aplicaciones[] = new String[5];
		Computadora uno = new Computadora();	
		uno.disponible();
		System.out.println("Ingrese número de inventario (este numero es una cadena alfanumérica de 15 caracteres)");
		Scanner sc = new Scanner(System.in);
		uno.setNumInventario(sc.nextLine());
		System.out.println("Ingrese aplicaciones 5apps");
		for (int i = 0; i < aplicaciones.length; i++) {
			aplicaciones[i] = sc.nextLine();
		}
		uno.setAplicaciones(aplicaciones);
		uno.conInternet();
		System.out.println("Inserte Mac Adress");
		uno.setMacAdrees(sc.nextLine());
		System.out.println("Inserte IP fija");
		uno.setIpFija(sc.nextLine());
		System.out.println("Inserte perifericos (Bluetooth, Bocina, lector de CD)");
		uno.setPerifericos(sc.nextLine());
		System.out.println("Inserte observaciones al equipo");
		uno.setObservaciones(sc.nextLine());
		System.out.println(uno.toString());
		uno.conInternet();
	}
}
