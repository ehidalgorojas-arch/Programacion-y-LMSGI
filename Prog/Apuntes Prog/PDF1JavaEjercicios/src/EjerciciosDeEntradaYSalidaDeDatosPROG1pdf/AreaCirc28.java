package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class AreaCirc28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		double area = Math.PI*Math.pow(radio, 2);
		System.out.println("El área de la circunferencia es: "+ area);
		sc.close();
	}
}
