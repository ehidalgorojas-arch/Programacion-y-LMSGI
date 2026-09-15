package EntradaDeDatosJavaPROG1pdf;
import java.util.Scanner;

public class LeerStringCompuesto21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase o texto compuesto: ");
		String texto = sc.nextLine();
		System.out.println("El texto introducido es: "+ texto);
		sc.close();
	}
}
