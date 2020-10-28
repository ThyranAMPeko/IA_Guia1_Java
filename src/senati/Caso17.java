package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float na = 0, nd = 0, nr = 0;
		
		System.out.print("Ingrese numero de aprobados: ");
		na = scn.nextFloat();
		
		System.out.print("Ingrese numero de desaprobados: ");
		nd = scn.nextFloat();
		
		System.out.print("Ingrese numero de retirados: ");
		nr = scn.nextFloat();
		
		float suma = na + nd + nr;
		
		float vp_na = na / suma * 100;
		float vp_nd = nd / suma * 100;
		float vp_nr = nr / suma * 100;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Aprobados.......: " + df.format(vp_na) + "%");
		System.out.println("Desaprobados....: " + df.format(vp_nd) + "%");
		System.out.println("Retirados.......: " + df.format(vp_nr) + "%");
		
	}

}
