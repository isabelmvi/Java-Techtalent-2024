package JavaBasics.UD5JavaBasics;
import java.util.Scanner;
public class T05ejExtra3 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduce un número: ");
				int numero = scanner.nextInt();
				scanner.close();
				
				int suma=0;
		         for (int i = numero; i >= 1; i--) {
		                suma += i;
		     } 
		         System.out.println("La suma de los números anteriores al " + numero + " es: " + suma);
		}
}
