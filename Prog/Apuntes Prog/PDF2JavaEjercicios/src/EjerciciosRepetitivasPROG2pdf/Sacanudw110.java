package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sacanudw110 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca un número entero positivo");
		int numero= sc.nextInt();
		
		if(numero >= 1) {
			int i = numero;
			while(i >= 1){
				System.out.println(i);
				i--;
			}
		}else {
			System.out.println("ERROR, Introduzca un número válido");
		}
		sc.close();
	}
}
