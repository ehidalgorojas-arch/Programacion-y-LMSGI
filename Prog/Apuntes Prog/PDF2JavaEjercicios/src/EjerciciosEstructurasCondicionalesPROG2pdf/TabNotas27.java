package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class TabNotas27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intrduzca la nota del alumno:");
		int nota = sc.nextInt();
		
		if(nota >= 0 && nota <= 10) {
			if(nota < 3) {
				System.out.println("MD");
			}else if(nota >= 3 && nota < 5) {
				System.out.println("Insuficiente");			
			}else if(nota >= 5 && nota < 6) {
				System.out.println("Suficiente");
			}else if(nota >= 6 && nota <7) {
				System.out.println("Bien");
			}else if(nota >= 7 && nota < 9) {
				System.out.println("Notable");
			}else if(nota >= 9 && nota <= 10) {
				System.out.println("Sobresaliente");
			}
		}else {
			System.out.println("Introduzca una nota válida entre 0 y 10");
		}
		
		sc.close();
	}
}
