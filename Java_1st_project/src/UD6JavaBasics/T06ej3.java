package UD6JavaBasics;
import java.util.Scanner;
public class T06ej3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero=scanner.nextInt();
		boolean esPrimo=esPrimo(numero);
		System.out.println("El número "+numero+" es "+(esPrimo?"primo":"no es primo."));
		}
		
		public static boolean esPrimo(int num) {
			if (num<=1) {
				return false;
				}
			for (int i=2; i<=Math.sqrt(num); i++) {
				if (num % i==0){
					return false;
				}
			}
					return true;	
		}
	}


