package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float num = 0;
		
		System.out.print("Ingrese el valor de la venta: ");
		num = scn.nextFloat();
		
		float aum = num + (float)(num * 0.42);
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("El valor de la venta es....: " + df.format(aum));
		
		
	}

}
