package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float num = 0;
		
		System.out.print("Ingrese valor del gasto: ");
		num = scn.nextFloat();
		
		float dis = num - (float)(num * 0.12);
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("El valor del gasto es....: " + df.format(dis));

	}

}
