package EntradaDeDatosJavaPROG1pdf;
import java.util.Scanner;

public class LeerReal19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número real: ");
		double numero = sc.nextDouble();
		System.out.println("El número real introducido es " + numero);
		sc.close();
		
	}
}
