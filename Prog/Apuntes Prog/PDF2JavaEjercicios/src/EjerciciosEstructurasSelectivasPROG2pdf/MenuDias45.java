package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class MenuDias45 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Elija la opciones:%nL Lunes%nM Martes%nX Miércoles%nJ Jueves%nV Viernes%nS Sábado%nD Domingo%nOtro Carácter ERROR");
		/*String entrada = sc.next().toUpperCase(); // Lee el texto ingresado
		char dias = entrada.charAt(0);             // Toma la primera letra
		 */
		char dias = sc.next().toUpperCase().charAt(0);
		
		switch (dias) {
			
			case 'L': 
				System.out.println("Ha seleccionado Lunes");
				break;
			case 'M': 
				System.out.println("Ha seleccionado Martes");
				break;
			case 'X': 
				System.out.println("Ha seleccionado Miércoles");
				break;
			case 'J': 
				System.out.println("Ha seleccionado Jueves");
				break;
			case 'V': 
				System.out.println("Ha seleccionado Viernes");
				break;
			case 'S': 
				System.out.println("Ha seleccionado Sábado");
				break;
			case 'D': 
				System.out.println("Ha seleccionado Domingo");
				break;
			default:
				System.out.println("ERROR");	
				break;
		}
		sc.close();
	}
}
