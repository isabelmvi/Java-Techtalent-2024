package UD6JavaBasics;
import java.util.Random;
import java.util.Scanner;

public class T06ej12 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el tamaño del array: ");
		int arraySize=scanner.nextInt();
		int[] numeros=new int[arraySize];
		Random random=new Random();
		for (int i=0; i<arraySize; i++) {
			numeros [i]=random.nextInt(300)+1;
		}
		
		System.out.println("Introduce el dígito final de los números: ");
		int digito=scanner.nextInt();
		if (digito < 0 || digito > 9) {
	        System.out.println("Por favor, introduce un dígito válido (0-9).");
	        System.exit(0);// Terminar el programa
	        } 
		int[] numFiltrados=filtrarNumeros(numeros, digito);
		
		System.out.println("Números entre 1-300 que terminan en "+digito+":");
		showArray(numFiltrados);
	}
	public static void showArray(int[]array) {
		for (int num:array) {
			System.out.println(num+" ");
		}
		System.out.println();
	}
	public static int[] filtrarNumeros(int[] array, int digito) {
		int contador=0;
		for (int num:array) {
			if (num%10==digito) {
				contador++;
			}
		}
		int[] numFiltrados=new int[contador];
		int indice=0;
		for (int num:array) {
			if(num%10==digito) {
				numFiltrados[indice]=num;
				indice++;
			}
		}
		return numFiltrados;	
	}

}
