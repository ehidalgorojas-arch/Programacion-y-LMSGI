package ConcatenaciónDeValoresPROG1pdf;

public class MostrarFormato17 {
	public static void main(String[] args) {
		
		String nombre = "Juan";
		int edad = 25;
		/*formatos:
			%s para strings
			%d para enteros decimales
			%n para salto de línea 
		*/
		System.out.printf("%s tiene %d años.%n", nombre, edad);
	}
}
