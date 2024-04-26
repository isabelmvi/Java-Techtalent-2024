import java.util.Scanner;
public class T05ejExtra4 {

	public static void main(String[] args) {
		//Programa que calcula números primos
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();
			scanner.close();
			
				if (primo(numero)) {
				System.out.println("El número "+numero+" es primo.");
			 } else {
				System.out.println("El número "+numero+" no es primo.");
			}}
				static boolean primo(int num) {
					if (num <= 1) {
						return false; // Los números menores o iguales a 1 no son primos
				        }

				        for (int i = 2; i < num; i++) {
				            if (num % i == 0) {
				                return false; // Si tiene algún divisor además de 1 y el propio número, no es primo
				            }
				        }

				        return true; // Si no se encontraron divisores, es primo
	}

}
