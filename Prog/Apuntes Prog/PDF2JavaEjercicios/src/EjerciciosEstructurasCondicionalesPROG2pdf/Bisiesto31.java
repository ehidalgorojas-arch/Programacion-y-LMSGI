package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Bisiesto31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un año bisiesto");
		int anioBisiesto = sc.nextInt();
		
		if((anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0) || (anioBisiesto % 400 == 0)) {
			System.out.println("El año introducido es bisiesto");
		}else {
			System.out.println("El año introducido no es bisiesto");
		}
		sc.close();
	}
}
