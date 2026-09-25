package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class Expendedor48v2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su saldo en la máquina expendedora");
			double saldoEuros = sc.nextDouble();
			System.out.println("Seleccione el número del producto");
			System.out.printf("1. Café(0.43€)%n2. Refrescos(1.11€)%n3. Agua(0.36€)%n");
			int opcion = sc.nextInt();
			
			double precioEuros = 0.0;
			boolean opcionValida = true;
			
			switch(opcion){
			case 1 -> precioEuros = 0.43;
			case 2 -> precioEuros = 1.11;
			case 3 ->precioEuros = 0.36;
			default -> opcionValida = false;
			}
			
			switch (Boolean.toString(opcionValida)){
				
			case "false" -> {
				System.out.println("\nOpcion incorrecta");
				System.out.printf("Se le devuelve su saldo: %.2f €\n", saldoEuros);
			}
			case "true" ->{
				int comparacionSaldo = Double.compare(saldoEuros,precioEuros);
				
				switch (comparacionSaldo) {
				case -1 -> {
					System.out.println("\nSaldo insuficiente ");
					System.out.printf("Se le devuelve su saldo: %.2f  €\n", saldoEuros);
				}
				default ->
				{
					System.out.println("\n Su producto. Gracias");
					// devolucioón del vuelto 
					double cambioEuros = saldoEuros-precioEuros;
					int cambio = (int) Math.round(cambioEuros*100);
					
					System.out.printf("Su cambio total es: %.2f €\n", cambioEuros);
					
					int cen200 = cambio/200;
					cambio %= 200;
					
					int cen100 = cambio/100;
					cambio %= 100;
					
					int cen50 = cambio /50;
					cambio %= 50;
					
					int cen20 = cambio/20;
					cambio %= 20;
					
					int cen10 = cambio/10;
					cambio %=10;
					
					int cen5 = cambio/5;
					cambio %=5;
					
					int cen2 = cambio/2;
					cambio %=2;
					
					int cen1 = cambio;
					
					System.out.println("Monedas de 2€: " + cen200);
                    System.out.println("Monedas de 1€: " + cen100);
                    System.out.println("Monedas de 50cts: " + cen50);
                    System.out.println("Monedas de 20cts: " + cen20);
                    System.out.println("Monedas de 10cts: " + cen10);
                    System.out.println("Monedas de 5cts: " + cen5);
                    System.out.println("Monedas de 2cts: " + cen2);
                    System.out.println("Monedas de 1ct: " + cen1);
				}
				}
			}
			}
			
			sc.close();
	}
}