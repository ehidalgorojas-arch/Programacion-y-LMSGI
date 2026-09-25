package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class DeCemil35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre el 0 y 99999:");
		int numero = sc.nextInt();
		int u = numero % 10; 
		int d = (numero / 10) % 10;
		int c = (numero / 100) % 10;
		int uM = (numero / 1000) % 10;
		int dM = (numero / 10000) % 10;
		
		if(numero >= 0 && numero <= 99999 ) {
			System.out.println("El número: "+numero+" tiene: "+u+" unidades "+d+" decenas "+c+" centenas "+uM+" unidades de millar "+dM+" decenas de millar");
		}else {
			System.out.println("Introduzca un número válido");
		}
		sc.close();
	}
}
