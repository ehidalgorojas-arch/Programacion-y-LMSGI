package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class MayorMenor23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza el primer número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Introduza el segundo número: ");
		double numero2 = sc.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("El número " + numero1 + " es mayor que "+ numero2);
		}else if (numero1 < numero2) {
			System.out.println("El número " + numero1 + " es menor que "+ numero2);
		}else {
			System.out.println("El número " + numero1 + " es igual que " + numero2);
		}
		
		sc.close();
		
	}

}
