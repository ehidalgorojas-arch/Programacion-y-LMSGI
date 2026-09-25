package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sumaparf116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		int numero = sc.nextInt();
		
		if (numero >= 1) {
			int suma = 0;
			
			for(int i = 2; i <= numero; i+=2) {
				suma = suma + i;
			}
			System.out.println("La suma de los números pares desde el 0 hasta el número es: "+ suma);
		}else {
			System.out.println("Introduzca un número válido");
		}
		sc.close();
	}
}
