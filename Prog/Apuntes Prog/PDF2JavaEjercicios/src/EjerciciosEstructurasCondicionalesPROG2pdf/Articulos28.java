package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Articulos28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de un artículo: ");
		int cantidadArt = sc.nextInt();
		
		System.out.println("Introduce el precio de el artículo seleccionado: ");
		double precioArt = sc.nextDouble();
		
		int porcentajeDescuento = 0;
		double precioTotal = 0;
		
		if(cantidadArt > 10 ) {
			if(cantidadArt <=25) {
				porcentajeDescuento = 10;
			}else if(cantidadArt <= 100) {
				porcentajeDescuento = 20;
			}else if(cantidadArt >100) {
				porcentajeDescuento = 40;
			}
		}else {
			porcentajeDescuento= 0; 
		}
		
		double descuento = precioArt * (porcentajeDescuento / 100.00);
		precioTotal = precioArt - descuento;
		
		System.out.print("Cantidad del artículo: "+cantidadArt);
		System.out.printf(" Precio del Artículo seleccionado: %.2f%n ",precioArt);
		System.out.println("Descuento aplicado del: "+ porcentajeDescuento+"%");
		System.out.printf("El prefio total del artículo es: %.2f%n ",precioTotal);
		
		sc.close();
	}
}
