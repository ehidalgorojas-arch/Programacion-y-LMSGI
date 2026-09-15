package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class CentimosEuros32 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cantidad de euros: ");
		double CantidadEuros = sc.nextDouble();
		
		int euros =  (int) CantidadEuros;
		double parteDecimal = (CantidadEuros - euros);
		
		int centimos = (int) Math.round(parteDecimal * 100);
		
		System.out.println("Euros: " + euros);
		System.out.printf("Céntimos: %d%n", centimos);
		sc.close();
		
	}
}
