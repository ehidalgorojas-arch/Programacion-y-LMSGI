package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sumaparw115 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero positivo");
		int numero = sc.nextInt();
		
		if(numero >=1) {
			int i = 0;
			int suma = 0;
			while(i<=numero) {
				suma= suma +i;
				i+=2;
			}
			System.out.println("La suma de los números pares desde el 0 hasta el número es: "+ suma);
		}else {
			System.out.println("ERROR, Introduzca un número válido");
		}
		sc.close();
	}
}
