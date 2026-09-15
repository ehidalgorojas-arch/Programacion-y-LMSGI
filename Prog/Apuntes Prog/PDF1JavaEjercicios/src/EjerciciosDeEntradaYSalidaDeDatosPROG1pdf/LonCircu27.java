package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class LonCircu27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de un círculo: ");
		double radio = sc.nextDouble();
		double Longitud = 2 * Math.PI * radio;
		System.out.println("La longitud de la circunferencia es:"+ Longitud);
		sc.close();
	}
}
