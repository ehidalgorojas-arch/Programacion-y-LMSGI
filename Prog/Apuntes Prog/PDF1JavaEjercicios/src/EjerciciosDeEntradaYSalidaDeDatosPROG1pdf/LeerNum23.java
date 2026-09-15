package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class LeerNum23 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intrduce un número : ");
		int num = sc.nextInt();
		System.out.println("El valor del número es: "+num);
		sc.close();
	}
}
