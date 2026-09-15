package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class RetesueDos25 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduza el sueldo del trabajador: ");
	double sueldo = sc.nextDouble();
	int porcentajeRetencion;
	
	if(sueldo < 1000.00) {
		porcentajeRetencion = 10;
	}else if(sueldo == 1000.00) {
		porcentajeRetencion = 12;
	}else if(sueldo > 1000.00 && sueldo < 2000.00) {
		porcentajeRetencion = 14;
	}else if(sueldo == 2000.00) {
		porcentajeRetencion = 16;
	}else {
		porcentajeRetencion = 18;
		}
	
	double retencion = sueldo * (porcentajeRetencion/100.0);
	System.out.println("Se le aplica una retención del " + porcentajeRetencion + "% ( "+ retencion + " euros)");
	sc.close();
	}
}
