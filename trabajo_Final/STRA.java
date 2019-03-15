package trabajo_Final;
import java.util.Random;
public class STRA {
	Random rd = new Random();
	
	public static String randomString(int count, String x) {
		StringBuilder builder = new StringBuilder();
	while(count--!=0) {
		int character = (int)(Math.random()*x.length());
		builder.append(x.charAt(character));
	}
	return builder.toString();
	}
}
