package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float lado = 0;
		
		System.out.print("Ingrese los lados: ");
		lado = scn.nextFloat();
		
		float per = lado * 3;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Perimetro....: " + df.format(per));
		

	}

}
