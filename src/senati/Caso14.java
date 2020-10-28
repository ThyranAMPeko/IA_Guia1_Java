package senati;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Ingrese numero: ");
		n = scn.nextInt();
		
		int sumatoria = (n * (n + 1)) / 2;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("La sumatoria es....: " + sumatoria);

	}

}
