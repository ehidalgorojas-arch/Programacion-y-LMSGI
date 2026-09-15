package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class ParImpar20 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int numero = sc.nextInt();
		
		String resultado = (numero % 2 == 0 ) ? "par" : "impar";
		
		//condición if-false
		if(numero % 2 == 0) {
			System.out.println("El número" + numero + " es par");
		}else {
			System.out.println("El número" + numero + " es impar");
			}
		
	
	//condición resumida de if-else
	//-- String resultado = (numero % 2 == 0) ? "par" : "impar"; --
	
	System.out.println("El número " + numero + " es: " + resultado);
	sc.close();
		
	}
}