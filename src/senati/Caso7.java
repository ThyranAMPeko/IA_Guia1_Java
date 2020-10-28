package senati;

import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		float po = (float) Math.pow(3, 2);
		
		float n1 = (17 *2 + po - 6)/ 5 - 2 * (float)(4.7 - 2 * 1.2);
		
		
		System.out.print("El resultado es " + df.format(n1));
		

	}

}
