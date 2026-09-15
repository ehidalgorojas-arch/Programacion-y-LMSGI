package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Nxn22 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		double numero = sn.nextDouble();
		
		double valorCuadrado = numero * numero;
		
		if(valorCuadrado > 100) {
			System.out.println("El cuadrado de " + numero + " restado - 100 es: " + (valorCuadrado - 100));
		}else {
			System.out.println("El cuadrado de " + numero + " le falta para llegar a 100 es: " + (100 - valorCuadrado));
		}
		
		sn.close();
		}
	}

