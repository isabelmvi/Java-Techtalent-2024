package UD6JavaBasics;
import java.util.Scanner;
public class T06ej8 {

	public static void main(String[] args) {
		
		int[] array=new int[10];
		llenarValores(array);
		mostrarArray(array);
	}
	public static void llenarValores(int[] array) {
		Scanner scanner=new Scanner(System.in);
		for (int i=0; i<array.length; i++) {
			System.out.println("Introduce el valor para la posición "+i+": ");
			array[i]=scanner.nextInt();
		}	
	}
	public static void mostrarArray(int[] array) {
		System.out.println("\nÍndice\tValor");
		for (int i=0; i<array.length;i++) {
			System.out.println(i+"\t"+array[i]);
		}
	}

}
