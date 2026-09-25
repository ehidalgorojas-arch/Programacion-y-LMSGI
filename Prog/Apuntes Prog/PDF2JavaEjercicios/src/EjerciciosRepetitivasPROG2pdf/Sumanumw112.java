package EjerciciosRepetitivasPROG2pdf;
import java.util.Scanner;

public class Sumanumw112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int numero = sc.nextInt();
		
	
		if(numero >= 1) {
			int i = 1;
			int suma = 0;
			//ascendente
			//descendente sería i >=1 en el while e i--;
			while(i <= numero) {
				suma = suma + i;
				i++;
			}
			System.out.println("La sumatoria del número introducido hasta el cero es : "+ suma);
		}else {
			System.out.println("ERROR, Introduzca un número válido");
		}
		sc.close();
	}
}
