package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float base = 0, altura = 0;
		
		System.out.print("Ingresar base: ");
		base = scn.nextFloat();
		
		System.out.print("Ingresar altura: ");
		altura = scn.nextFloat();
		
		float area = base * altura / 2;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Area....: " + df.format(area));
		

	}

}
