package trabajo_Final;
import java.util.Random;
public class STRA {
	Random rd = new Random();
	private final static String STRING_NUM_INVENTARIO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private final static String STRING_IP_ESTATICA = "01234567890.";
	public static String numInventarioAleatoria(int count) {
		StringBuilder builder = new StringBuilder();
	while(count--!=0) {
		int character = (int)(Math.random()*STRING_NUM_INVENTARIO.length());
		builder.append(STRING_NUM_INVENTARIO.charAt(character));
	}
	return builder.toString();
	}
	
	public static String numIp(int count) {
		StringBuilder builder = new StringBuilder();
	while(count--!=0) {
		int character = (int)(Math.random()*STRING_IP_ESTATICA.length());
		builder.append(STRING_IP_ESTATICA.charAt(character));
	}
	return builder.toString();
	}
	
	
	
}
