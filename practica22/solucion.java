package tema2.practica22;

import java.util.Scanner;

public class solucion {

	public static void main(String[] args) {
		
		System.out.println("Este es mi cambio");
		// 
		String descripcionProducto;
		
		double precioEnEuros;
		int cantidad;
		boolean enviado;
		final double iva=4;
		double totalBruto, importeIva, totalGeneral;
		
		System.out.println("Introduce la descripción del producto: ");
		Scanner teclado = new Scanner(System.in);
		descripcionProducto= teclado.next();
		System.out.println("Introduce la cantidad que quiere: ");
		cantidad=teclado.nextInt();
		System.out.println("Precio en euros");
		precioEnEuros=teclado.nextDouble();
		System.out.println("Enviado (sí/no): ");
		enviado=teclado.nextBoolean();
		
		totalBruto=cantidad*precioEnEuros;
		importeIva= totalBruto+(iva/100);
		totalGeneral=totalBruto+importeIva;
		
		System.out.printf("%-20s %-7s %8s %6s %9s %7s %13s","Descripción Enviado Cantidad Precio Imp_Bruto Imp_iva Total_General");
		System.out.print("-------------------------------------------------------------------");
		System.out.printf("%-20s %-7s % %8d %6.2f %9.2f %7.2f %13.2f",descripcionProducto,enviado, cantidad, precioEnEuros,totalBruto,importeIva,totalGeneral);

		
		

	}

}
