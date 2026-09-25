package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sumanumf113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero positivo: ");
		int numero = sc.nextInt();
		//descendente en memoria mismo resultado
		if(numero>= 1) {
			
			int suma = 0;
			
			for(int i = numero; i>=1; i--) {
				suma= suma + i;
			}
			
			/*//ascendente en memoria mismo resultado
			 * if(numero>= 1) {
			
			int suma = 0;
			
			for(int i = 1; i<=numero; i++) {
				suma= suma + i;
			}
			 */
			
			System.out.println("La sumatoria del número introducido hasta el 1 es: "+ suma);
		}else {
			System.out.println("Introduzca un número válido");
		}
		sc.close();
	}
}
