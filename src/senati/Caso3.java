package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Ingrese primer numero: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		num2 = scn.nextFloat();
		
		System.out.println("Numero ingresado");
		System.out.println("================");
		System.out.println("Numero 1: " + num1);
		System.out.println("Numero 2: " + num2);

	}

}
