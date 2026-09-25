package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class MenuMeses46 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un mes del año:");
		String meses = sc.next().toUpperCase();
		
		switch (meses) {
			case "ENERO":
				System.out.println("Mes 1");
				break;
			case "FEBRERO":
				System.out.println("Mes 2");
				break;
			case "MARZO":
				System.out.println("Mes 3");
				break;
			case "ABRIL":
				System.out.println("Mes 4");
				break;
			case "MAYO":
				System.out.println("Mes 5");
				break;
			case "JUNIO":
				System.out.println("Mes 6");
				break;
			case "JULIO":
				System.out.println("Mes 7");
				break;
			case "AGOSTO":
				System.out.println("Mes 8");
				break;
			case "SEPTIEMBRE":
				System.out.println("Mes 9");
				break;
			case "OCTUBRE":
				System.out.println("Mes 10");
				break;
			case "NOVIEMBRE":
				System.out.println("Mes 11");
				break;
			case "DICIEMBRE":
				System.out.println("Mes 12");
				break;
			default:
				System.out.println("Introduzca un mes válido");
				break;
		}
		sc.close();
	}
}
