package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Calcuiva21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la cantidad de euros:");
		double valorEuros = sc.nextDouble();
		double iva;
		
		//condición if-false7
		if(valorEuros < 20000) {
			iva = valorEuros * 0.7;
		}else {
			iva = valorEuros * 0.16;
		}
		
		System.out.println("El IVA de: " + valorEuros + "euros es: " + iva);
		sc.close();
	}
	
}
