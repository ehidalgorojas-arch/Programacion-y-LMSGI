package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Mayor3n33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		double n1 = sc.nextDouble();
		System.out.println("Introduce el segundo número");
		double n2 = sc.nextDouble();
		System.out.println("Introduce el tercer número");
		double n3 = sc.nextDouble();
		
		double maximoValor = Math.max(n1, Math.max(n2, n3));
		if(n1 == maximoValor) {
			System.out.println("El primer número mayor es: "+ n1);
		}
		if(n2 == maximoValor) {
			System.out.println("El segundo número mayor es: "+ n2);
		}
		if(n3 == maximoValor) {
			System.out.println("El tercer número mayor es : "+ n3);
		}
		sc.close();
	}

}
