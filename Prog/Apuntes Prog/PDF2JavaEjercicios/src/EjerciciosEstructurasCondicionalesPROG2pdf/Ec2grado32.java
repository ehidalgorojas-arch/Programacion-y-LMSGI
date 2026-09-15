package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Ec2grado32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer coeficiente");
		double a= sc.nextDouble();
		System.out.println("Introduce el segundo coeficiente");
		double b = sc.nextDouble();
		System.out.println("Introduce el tercer coeficiente");
		double c = sc.nextDouble();
		
		double discriminante = Math.pow(b,2) - (4*a*c);
		/* discriminantes 
		 * 
		 * discriminante > 0 tiene dos raíces reales y distintas
		 * discriminante = 0 tiene raíz real doble
		 * discriminante < 0 tiene raíces complejas
		 * 
		 */
		double solucion1 = 	(-b + Math.sqrt(discriminante))/(2*a);
		double solucion2 = (-b - Math.sqrt(discriminante))/(2*a);
		
		if (discriminante > 0) {
			System.out.println("La ecuación tiene dos raíces reales y distinas");
			System.out.println("Solución 1: "+ solucion1);
			System.out.println("Solución 2: "+ solucion2);
		}else if(discriminante == 0) {
			System.out.println("La ecuación tiene raíz real doble");
			System.out.println("Solución 1: "+ solucion1);
			System.out.println("Solución 2: "+ solucion2);
		}else{
			System.out.println("ERROR: La ecuación tiene raíces complejas");

		}
		sc.close();
	}
}
