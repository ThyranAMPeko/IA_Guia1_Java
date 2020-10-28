package senati;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lado1 = 0, lado2 = 0;
		
		System.out.print("Ingrese lado 1: ");
		lado1 = scn.nextInt();
		
		System.out.print("Ingrese lado 2: ");
		lado2 = scn.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = (lado1 * 2) + (lado2 * 2);
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Area del cuadrado....: " + area);
		System.out.println("Perimetro....: " + perimetro);

	}

}
