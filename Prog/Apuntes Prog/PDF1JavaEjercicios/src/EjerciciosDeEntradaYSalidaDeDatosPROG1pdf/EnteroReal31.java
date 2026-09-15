package EjerciciosDeEntradaYSalidaDeDatosPROG1pdf;
import java.util.Scanner;

public class EnteroReal31 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número real: ");
        double numeroCompleto = sc.nextDouble();
        
        int parteEntera = (int) numeroCompleto;
        
        double parteDecimal = numeroCompleto - parteEntera;
        
        System.out.println("Parte entera: " + parteEntera);
        System.out.printf("Parte decimal: %.2f%n", parteDecimal);
        
        sc.close();
	}
}
