package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String producto = "";
		float precio = 0;
		int cantidad = 0;
		
		System.out.print("Ingrese el nombre del producto: ");
		producto = scn.nextLine();
		System.out.print("Ingrese el precio del producto: ");
		precio = scn.nextFloat();
		System.out.print("Ingrese la cantidad: ");
		cantidad = scn.nextInt();
		
		float importe = precio * cantidad;
		float IGV = (importe * (float)0.18);
		float des = (importe * (float)0.03);
		float total = importe + IGV - des;
		
		System.out.println("================");
		System.out.println("RESULTADOS");
		System.out.println("================");
		System.out.println("Nombre del producto: " + producto);
		System.out.println("Importe........: " + df.format(importe));
		System.out.println("IGV............: " + df.format(IGV));
		System.out.println("Descuento......: " + df.format(des));
		System.out.println("Total a pagar..: " + df.format(total));

	}

}
