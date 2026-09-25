package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class UnDecen34 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre el 0 y 999:");
		int numero = sc.nextInt();
		int u = numero % 10; 
		int d = (numero / 10) % 10;
		int c = (numero / 100) % 10;
		
		if(numero >= 0 && numero <= 999 ) {
			System.out.println("El número: "+numero+" tiene: "+u+" unidades "+d+" decenas "+c+" centenas");
		}else {
			System.out.println("Introduzca un número válido");
		}
		sc.close();
	}
}
