package cuarta_Actividad;
import java.util.Scanner;
public class AppComputadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
		
		private static void menu() {
			Scanner sc = new Scanner(System.in);
			Computadora lab01[] = new Computadora[5];
			String aplicaciones[] = new String[5];
			boolean perifericos[] = new boolean[3];
		for (int j = 0; j < lab01.length; j++) {
			lab01 [j] = new Computadora();
			int x;
			try{do {
				System.out.println("Ingresar datos de la computadora: " + (j+1) + "\n 1. Ingresar código de inventario \n 2. Insertar aplicaciones \n 3. Mac Adress \n 4. Ip fija \n 5. Perifericos \n 6. Observaciones \n 7. Imprimir resultados \n 8. Pasar a la siguiente máquina ");
				x = sc.nextInt();
				switch (x) {
				case 1:	System.out.println("Ingresa cadena alfanúmerica de 15 caracteres"); lab01[j].setNumInventario(sc.next());break;
				
				case 2: 
				System.out.println("Ingresa 5 aplicaciones únicas del equipo de computo:");
					for (int i = 0; i < aplicaciones.length; i++) {
						aplicaciones[i] = sc.next();
					}
				try{lab01[j].setAplicaciones(aplicaciones);}catch(Exception e) {
					for (int i = 0; i < aplicaciones.length; i++) {
						if(aplicaciones[i] == null) {
							System.out.println("Inserte otra aplicacion");
							aplicaciones[i] = sc.next();
						}
					}
				};break;
				
				case 3: System.out.println("Ingresa Mac Adress"); try{lab01[j].setMacAdrees(sc.next());}catch(Exception e) {System.out.println("Mac Adress no valida");} break;
				
				case 4: System.out.println("Ingresa Ip Fija"); lab01[j].setIpFija(sc.next()); break;
				
				case 5:	try{System.out.println("Inserta perifericos (Escribir true si tiene el perifericos, escribir false si no lo tiene) 1.bluetooth, 2. bocina, 3. Lector cd");
					
					for (int i = 0; j < perifericos.length; j++) {
						System.out.println(j + 1 + ". ");
						perifericos[j] = sc.nextBoolean();
					}
					lab01[j].setPerifericos(perifericos);}catch(Exception e) {System.out.println("Datos invalidos"); menu();}; break;
				
				case 6: System.out.println("Insertar observaciones"); lab01[j].setObservaciones(sc.next());break;
					
				case 7: System.out.println(lab01[j].toString());break;
					
				
				
				default:
					break;
				}
				
			} while (x<=7);}catch(Exception e){}
			
			
			}for (int i = 0; i < lab01.length; i++) {
				System.out.println(lab01[i].toString());
		}
		}
}


