package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Menuif29 {
	public static void main(String[] args) {
		System.out.printf("Elija la opción que deseas realizar:%n1. Sumar%n2. Restar%n3. Multiplicar%n4. Dividir%n5. Resto(%%)%n0. Salir");
		Scanner sc = new Scanner(System.in);
		int opciones = sc.nextInt();
		
		if(opciones == 0 ) {
			System.out.println("Haz salido del programa");
		}else if(opciones >= 1 && opciones <= 5) {
			System.out.println("Inserte el primer número");
			double numero1 = sc.nextDouble();
			System.out.println("Inserte el segundo número");
			double numero2 = sc.nextDouble();
			
			if (opciones == 1) {
                double suma = numero1 + numero2;
                System.out.println("La suma de los dos números introducidos es: " + suma);
            } 
            else if (opciones == 2) {
                double resta = numero1 - numero2;
                System.out.println("La resta de los dos números introducidos es: " + resta);
            } 
            else if (opciones == 3) {
                double multiplicacion = numero1 * numero2; 
                System.out.println("La multiplicación de los dos números introducidos es: " + multiplicacion);
            } 
            else if (opciones == 4) {
                //no se puede dividir entre cero
                if (numero2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    double division = numero1 / numero2;
                    System.out.println("La división de los dos números introducidos es: " + division);
                }
            } 
            else if (opciones == 5) {
            	//no se puede dividir entre cero
                if (numero2 == 0) {
                    System.out.println("Error: No se puede calcular el resto si se divide entre cero.");
                } else {
                    double resto = numero1 % numero2;
                    System.out.println("El resto de la división de los dos números es: " + resto);
                }
            }
        
			
		}else {
			System.out.println("Intrduzca un número válido entre el 0 y el 5");
		}
		sc.close();
		
	}
}
