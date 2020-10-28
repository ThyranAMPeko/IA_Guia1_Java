package senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Ingrese numero 1: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese numero 2: ");
		num2 = scn.nextFloat();
		
		float promedio = (num1 + num2) / 2;
		
		float aum_20 = num1 + (float)(num1 * 0.2);
		
		float dis_30 = num2 - (float)(num2 * 0.3);
		
		System.out.println("=============");
		System.out.println("RESULTADOS");
		System.out.println("=============");
		System.out.println("Promedio...: " + promedio);
		System.out.println("Resultado 1: " + aum_20);
		System.out.println("Resultado 2: " + dis_30);

	}

}
