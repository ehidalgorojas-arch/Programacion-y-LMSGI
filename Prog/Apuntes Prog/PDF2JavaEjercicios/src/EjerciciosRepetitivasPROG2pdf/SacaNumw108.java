package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class SacaNumw108 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número ");
		int numero = sc.nextInt();
		
		if(numero >0 ) {
			int i = 1;	
		while(i <= numero) {
			System.out.println(i);
			i++;
		}
		}else {
			System.out.println("ERROR, Introduce un número entero positivo");
		}
		sc.close();
	}
}