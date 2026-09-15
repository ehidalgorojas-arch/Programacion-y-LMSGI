package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class Cubo29 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num= sc.nextInt();
		num = num*num*num;
		System.out.println("El valor del número elevado al cubo es: "+num);
		sc.close();
	}
}
