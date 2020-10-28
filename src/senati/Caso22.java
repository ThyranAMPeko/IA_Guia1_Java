package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String nom = "";
		
		float nt1 = 0, nt2 = 0, nt3 = 0;
		
		System.out.print("Ingrese el nombre del alumno: ");
		nom = scn.nextLine();
		
		System.out.print("Ingrese la primera nota: ");
		nt1 = scn.nextFloat();
		System.out.print("Ingrese la segunda nota: ");
		nt2 = scn.nextFloat();
		System.out.print("Ingrese la tercera nota: ");
		nt3 = scn.nextFloat();
		
		
		float por1 = nt1 * (float)0.2;
		float por2 = nt2 * (float)0.3;
		float por3 = nt3 * (float)0.5;
		
		float pro = por1 + por2 + por3;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Nombre del alumno: " + nom);
		System.out.println("Promedio: " + df.format(pro));
		
		

	}

}
