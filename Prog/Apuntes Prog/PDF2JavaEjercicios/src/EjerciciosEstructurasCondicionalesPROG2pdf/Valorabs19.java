package EjerciciosEstructurasCondicionalesPROG2pdf;
import java.util.Scanner;

public class Valorabs19 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un número real: ");
	double numero = sc.nextDouble();
	
	double valorAbsoluto;
	
	//condición if-false
	if(numero < 0 ) {
		valorAbsoluto = -numero;
	} else {
		valorAbsoluto = numero;
	}
	
	//condición resumida de if-else
	//-- double valorAbsoluto = (numero < 0) ? -numero : numero; --
	
	System.out.println("El valor absoluto de " + numero + "es: "+valorAbsoluto);
	
	sc.close();
}

}
