package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class SacaParw109 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		//aquí permitimos que el 0 sea una entrada válida
		if(numero >=0) {
			
			int i = 0;
			while(i <= numero) {
				System.out.println(i);
				i+=2;
			}
			
		}else {
			System.out.println("ERROR, Introduce un número par");
		}
		sc.close();
	}
}
