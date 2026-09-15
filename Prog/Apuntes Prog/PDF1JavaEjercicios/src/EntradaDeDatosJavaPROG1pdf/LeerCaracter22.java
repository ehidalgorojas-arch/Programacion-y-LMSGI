package EntradaDeDatosJavaPROG1pdf;
import java.util.Scanner;

public class LeerCaracter22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un carácter: ");
		char letra = sc.nextLine().charAt(0);
		System.out.println("El valor de carácter es "+letra);
		sc.close();
		
	}
}
