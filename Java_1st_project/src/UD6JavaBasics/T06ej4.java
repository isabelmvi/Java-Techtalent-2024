package UD6JavaBasics;
import java.util.Scanner;
public class T06ej4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserta un número: ");
		int numero=scanner.nextInt();
		scanner.close();
		
		int factorial=generarFactorial(numero);
			System.out.println("El factorial de "+numero+" es "+factorial);
		}

	
	public static int generarFactorial(int numero) {
		if (numero==0||numero==1) {
			return 1;
		} else {
			return numero*generarFactorial(numero-1);
		}
	}

}
