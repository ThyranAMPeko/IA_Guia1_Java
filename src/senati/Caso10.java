package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int radio = 0;
		
		System.out.print("Ingrese el radio: ");
		radio = scn.nextInt();
		
		/// El valor de pi lo tomamos como 3.14, por eso es que con una diferencia de decimales
		
		float area = (float)Math.pow(radio, 2) * (float)(3.14);
		float perimetro = radio * (float)3.14 * 2;
		
		System.out.println("================");
		System.out.println("  RESULTADOS");
		System.out.println("================");
		System.out.println("Area del circula.........: " + df.format(area));
		System.out.println("Perimetro del circulo....: " + df.format(perimetro));

	}

}
