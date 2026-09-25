package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class MenuCase44 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Elija la opciones:%n1. Opción 1%n2. Opción 2%n3. Opción 3%n4. Opción 4%n5. Opción 5%n0. Salir");
		int opciones = sc.nextInt();
		
		switch (opciones) {
			case 0: 
				System.out.println("Usted ha salido de la aplicación");
				break;
			case 1: 
				System.out.println("Ha seleccionado la opción 1");
				break;
			case 2: 
				System.out.println("Ha seleccionado la opción 2");
				break;
			case 3: 
				System.out.println("Ha seleccionado la opción 3");
				break;
			case 4: 
				System.out.println("Ha seleccionado la opción 4");
				break;
			case 5: 
				System.out.println("Ha seleccionado la opción 5");
				break;
			default:
				System.out.println("Introduzca una opción válida");		
		}
		sc.close();
	}
}
