package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int horas = 0;
		float tar_h = 0;
		
		System.out.print("Ingrese horas trabajadas: ");
		horas = scn.nextInt();
		System.out.print("Ingrese tarifa por hora: ");
		tar_h = scn.nextFloat();
		
		float sueldo = horas * tar_h;
		float bono = (float)(sueldo * 0.05);
		float total = sueldo + bono;
		float total_d = total / (float)3.24;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Sueldo............: S/. " + df.format(sueldo));
		System.out.println("Bono..............: $   " + df.format(bono));
		System.out.println("Total.............: $   " + df.format(total));
		System.out.println("Total en dolares..: $   " + df.format(total_d));
		

	}

}
