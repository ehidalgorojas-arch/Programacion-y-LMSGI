package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Notavali30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la nota del alumno: ");
		int nota = sc.nextInt();
		
		if(nota >= 0 && nota <=10) {
			System.out.println("Nota introducida correctamente");
		}else {
			System.out.println("Introduzca una nota válida entre el 0 y el 10");
		}
		sc.close();
	}

}
