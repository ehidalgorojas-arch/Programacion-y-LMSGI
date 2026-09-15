package EntradaDeDatosJavaPROG1pdf;
import java.util.Scanner;

public class LeerEntero18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		System.out.println("El número introducido es "+ numero);
		sc.close();
	}
}
