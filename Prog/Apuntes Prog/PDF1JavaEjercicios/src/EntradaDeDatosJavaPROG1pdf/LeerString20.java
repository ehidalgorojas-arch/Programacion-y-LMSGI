package EntradaDeDatosJavaPROG1pdf;
import java.util.Scanner;

public class LeerString20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra: ");
		String palabra = sc.next();
		System.out.println("La palabra introducida es " + palabra);
		sc.close();
	}
}
