package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.println("Ingrese lado del cuadrado: ");
		lado = scn.nextInt();
		
		int area = lado * lado;
		int perimetro = lado * 4;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Area del cuadrado....: " + area);
		System.out.println("Perimetro....: " + perimetro);

	}

}
