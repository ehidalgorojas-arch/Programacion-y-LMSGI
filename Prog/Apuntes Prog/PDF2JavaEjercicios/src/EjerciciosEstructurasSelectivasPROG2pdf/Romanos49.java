package EjerciciosEstructurasSelectivasPROG2pdf;
import java.util.Scanner;

public class Romanos49 {
	public static void main(String [] args) {
		System.out.println("Introduzca un número entre el 1 y el 99");
		Scanner sc = new Scanner(System.in);
		int numero = sc. nextInt();
		
		if(numero < 1 || numero > 99) {
			System.out.print("Número incorrecto");
		}else {
			int decenas = numero / 10;
			int unidades = numero % 10; 
			
			String romano = "";
			
			switch (decenas) {
			case 1 -> romano += "X ";
			case 2 -> romano += "XX ";
            case 3 -> romano += "XXX ";
            case 4 -> romano += "XL ";
            case 5 -> romano += "L ";
            case 6 -> romano += "LX ";
            case 7 -> romano += "LXX ";
            case 8 -> romano += "LXXX ";
            case 9 -> romano += "XC ";
			}
			
			switch (unidades) {
            case 1 -> romano += "I";
            case 2 -> romano += "II";
            case 3 -> romano += "III";
            case 4 -> romano += "IV";
            case 5 -> romano += "V";
            case 6 -> romano += "VI";
            case 7 -> romano += "VII";
            case 8 -> romano += "VIII";
            case 9 -> romano += "IX";
			}
			System.out.println("El número: "+numero+ " en romano es : "+ romano);
		}
		sc.close();
	}
}
