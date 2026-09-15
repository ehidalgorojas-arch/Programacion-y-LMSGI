package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class SignoNum26 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		num = num * -1;
		System.out.println("El valor del número con el signo cambiado es: "+num);
		sc.close();
	}
}
