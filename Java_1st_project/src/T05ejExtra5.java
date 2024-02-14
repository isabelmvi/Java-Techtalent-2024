import java.util.Scanner;

public class T05ejExtra5 {

	    public static void main(String[] args) {
	        // Pedir al usuario que ingrese una cadena de texto
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese una cadena de texto: ");
	        String input = scanner.nextLine();

	        // Verificar si la cadena es un palíndromo
	        if (esPalindromo(input)) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	    }

	    private static boolean esPalindromo(String cadena) {
	        // Eliminar espacios y convertir a minúsculas para hacer la comparación más flexible
	        String cadenaFormateada = cadena.replaceAll("\\s", "").toLowerCase();

	        // Comparar la cadena original con su versión invertida
	        String cadenaInvertida = new StringBuilder(cadenaFormateada).reverse().toString();

	        return cadenaFormateada.equals(cadenaInvertida);
	    }
	}
