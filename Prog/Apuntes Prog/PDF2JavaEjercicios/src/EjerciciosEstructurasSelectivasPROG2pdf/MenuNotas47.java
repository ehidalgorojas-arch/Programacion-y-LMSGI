package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class MenuNotas47 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intrduzca la nota del alumno:");
		int nota = sc.nextInt();
		
		/*se omite los breaks cuando se utiliza la flecha */
		
		switch (nota) {
			case 0, 1, 2, 3 -> System.out.println("Muy Deficiente");
	        case 4          -> System.out.println("Insuficiente");
	        case 5, 6       -> System.out.println("Bien");
	        case 7, 8       -> System.out.println("Notable");
	        case 9, 10      -> System.out.println("Sobresaliente");
	        default         -> System.out.println("Nota no válida");
		}
		sc.close();
	}
}
