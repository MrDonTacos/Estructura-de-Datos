package trabajo_Final;
import java.util.Random;
public class STRA {
	Random r = new Random();
	private final static String STRING_NUM_INVENTARIO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	
	public  String numInventarioAleatoria(int count) {
		StringBuilder builder = new StringBuilder();
	while(count--!=0) {
		int character = (int)(Math.random()*STRING_NUM_INVENTARIO.length());
		builder.append(STRING_NUM_INVENTARIO.charAt(character));
	}
	return builder.toString();
	}
	
	public String numIp() {
		
		return r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256);
	}
	
	public String numMacAdress() {
		   byte[] macAddr = new byte[6];
		    r.nextBytes(macAddr);

		    macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

		    StringBuilder sb = new StringBuilder(18);
		    for(byte b : macAddr){

		        if(sb.length() > 0)
		            sb.append(":");

		        sb.append(String.format("%02x", b));
		    }


		    return sb.toString();
		}
	} //Comentario de prueba Agregando más texto
