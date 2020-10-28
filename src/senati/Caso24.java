package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float num1, num2, num3;
		
		System.out.print("Ingrese el 1er valor: ");
		num1 = scn.nextFloat();
		System.out.print("Ingrese el 2do valor: ");
		num2 = scn.nextFloat();
		System.out.print("Ingrese el 3er valor: ");
		num3 = scn.nextFloat();
		
		float n1 = (num1 / 5) + (num2 * (float)0.2);
		float n2 = (num3 + (num3 * (float)0.6)) / 2 ;
		float suma = (num1 + num2 + num3);
		float n3 = suma - (suma * (float)0.08);
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Punto 1: " + df.format(n1));
		System.out.println("Punto 2: " + df.format(n2));
		System.out.println("Punto 3: " + df.format(n3));
		

	}

}
