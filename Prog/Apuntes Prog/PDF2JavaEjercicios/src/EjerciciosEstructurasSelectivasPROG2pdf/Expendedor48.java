package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class Expendedor48 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su saldo en la máquina expendedora");
		double saldoEuros = sc.nextDouble();
		System.out.println("Seleccione el número del producto");
		System.out.printf("1. Café(0.43€)%n2. Refrescos(1.11€)%n3. Agua(0.36€)%n");
		int opcion = sc.nextInt();
		
		double precioEuros = 0.0;
		boolean opcionValida =true;
		
		switch(opcion) {
			case 1 -> precioEuros = 0.43;
			case 2 -> precioEuros = 1.11;
			case 3 -> precioEuros = 0.36;
			default -> opcionValida = false;
			
		}
			switch (Boolean.toString(opcionValida)) {
            case "false" -> {
                System.out.println("\nOpción incorrecta.");
                System.out.printf("Se le devuelve su saldo: %.2f €\n", saldoEuros);
            }
            case "true" -> {
                // Evaluamos la comparación: 1/0 si saldo >= precio, -1 si saldo < precio
                int comparacionSaldo = Double.compare(saldoEuros, precioEuros);

                // Switch 3: Validación del saldo
                switch (comparacionSaldo) {
                    case -1 -> {
                        System.out.println("\nSaldo insuficiente.");
                        System.out.printf("Se le devuelve su saldo: %.2f €\n", saldoEuros);
                    }
                    default -> 
                    	{ // Entra aquí si es 0 (igual) o 1 (mayor)
                        System.out.println("\nSu producto. Gracias.");

                        // Conversión a céntimos redondeando
                        double cambioEuros = saldoEuros - precioEuros;
                        int cambio = (int) Math.round(cambioEuros * 100);

                        System.out.printf("Su cambio total es: %.2f €\n", cambioEuros);

                        // Cálculo del desglose de monedas
                        int m200 = cambio / 200;
                        cambio %= 200;

                        int m100 = cambio / 100;
                        cambio %= 100;

                        int m50 = cambio / 50;
                        cambio %= 50;

                        int m20 = cambio / 20;
                        cambio %= 20;

                        int m10 = cambio / 10;
                        cambio %= 10;

                        int m5 = cambio / 5;
                        cambio %= 5;

                        int m2 = cambio / 2;
                        cambio %= 2;

                        int m1 = cambio;

                        // Muestra de monedas devueltas
                        System.out.println("\n--- Desglose de monedas ---");
                        System.out.println("Monedas de 2€: " + m200);
                        System.out.println("Monedas de 1€: " + m100);
                        System.out.println("Monedas de 50cts: " + m50);
                        System.out.println("Monedas de 20cts: " + m20);
                        System.out.println("Monedas de 10cts: " + m10);
                        System.out.println("Monedas de 5cts: " + m5);
                        System.out.println("Monedas de 2cts: " + m2);
                        System.out.println("Monedas de 1ct: " + m1);
                    }
                }
            }
		}
		sc.close();
		}
	}
