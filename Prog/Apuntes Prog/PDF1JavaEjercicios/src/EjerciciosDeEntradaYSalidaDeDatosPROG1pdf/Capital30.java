package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class Capital30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cantidad de euros: ");
		double euros = sc.nextDouble();
		System.out.println("Introduce el tipo de interés (Ejm: 5,5%): ");
		double TipoInteres = sc.nextDouble();
		System.out.println("Introduce el el tiempo en días: ");
		int dias = sc.nextInt();
		double interes = (euros*TipoInteres*dias)/(360*100);
		
		System.out.printf("El interés generado para %.2f€ al %.2f%% es de: %.2f€%n", euros, TipoInteres, interes);

		sc.close();
	}
}
