package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class DobleNum25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		num = num *2;
		System.out.println("El valor del número multiplicado por 2 es: " + num); 
		sc.close();		
	}
}
