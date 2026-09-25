package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sumanumd114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número entero positivo");
			numero =sc.nextInt();
			if(numero <= 0) {
				System.out.println("ERROR, Introduzca un número válido");
			}
		}while(numero <= 0); 
		
			int suma = 0;
		for(int i = 1; i<=numero; i++) {
			suma= suma + i;
			
		}
		System.out.println("La sumatoria del número introducido hasta el 1 es: "+ suma);	
		
		sc.close();
	}
}