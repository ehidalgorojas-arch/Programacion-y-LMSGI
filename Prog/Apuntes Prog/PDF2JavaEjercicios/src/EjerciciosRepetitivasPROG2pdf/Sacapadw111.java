package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sacapadw111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero positivo");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			int i = numero;
			while(i >= 0) {
				System.out.println(i);
				i-=2;
			}
		}else {
			System.out.println("ERROR, Introduzca un número válido");
		}
		sc.close();
	}
}
