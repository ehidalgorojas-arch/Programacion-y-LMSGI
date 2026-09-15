package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Segundoi26 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inroduzca una cantidad de horas: ");
		int horas = sc.nextInt();
		
		System.out.println("Introduzca una cantidad de minutos: ");
		int minutos = sc.nextInt();
		
		System.out.println("Introduzca una cantidad de segundos: ");
		int segundos = sc.nextInt();
		
		segundos = segundos + 1;
		
		if(segundos >=60) {
			segundos = segundos - 60;
			minutos = minutos + 1;
			
			if(minutos >=60) {
				minutos = minutos - 60;
				horas = horas + 1;
			}
		}
		
		System.out.println("La hora introducida aumentada en un segundo es: "+ horas+ "h "+minutos+"m "+segundos+"s ");
		sc.close();
		
		
	}
}
