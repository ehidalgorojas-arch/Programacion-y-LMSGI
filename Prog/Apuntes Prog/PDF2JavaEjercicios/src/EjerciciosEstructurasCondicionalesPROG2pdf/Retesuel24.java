package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Retesuel24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el sueldo del trabajador: ");
		double sueldo = sc.nextDouble();
		int porcentajeRetencion;
		
		if(sueldo < 1000.00) {
			porcentajeRetencion = 10;

		}else if(sueldo == 1000.00) {
			porcentajeRetencion = 12;
		
		}else{
			porcentajeRetencion = 14;
	
		}
		
		double retencion = sueldo * (porcentajeRetencion/100.0);
		System.out.println("Se le aplica una retención del " + porcentajeRetencion + "% ( "+ retencion + " euros)");
		
		sc.close();
	}
}
