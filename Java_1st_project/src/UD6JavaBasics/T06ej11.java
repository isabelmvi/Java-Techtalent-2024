package UD6JavaBasics;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class T06ej11 {

		
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce la dimensión de los arrays: ");
		int arraySize=scanner.nextInt();
		
		if (arraySize<=0) {
			System.out.println("La dimensión de los arrays debe ser un número positivo.");
			return;
			}
		int[] arrayAleatorio=generarArrayAleatorio(arraySize);
		int[] arrayCopy=reasignarValores(arrayAleatorio);
		
		mostrarArray(arrayAleatorio, "Aleatorio: ");
		mostrarArray(arrayCopy, "Copia (reasignando aleatoriamente: ");
		
		int[] resultadoMultiplicacion=multiplicarArrays(arrayAleatorio, arrayCopy); 
		mostrarArray (resultadoMultiplicacion, "Multiplicación: ");
		}
	
		public static int[]generarArrayAleatorio(int size){
			int[]array=new int[size];
			
			for (int i=0; i<size; i++) {
				array[i]=(int) (Math.random()*100);
			}
			return array;
		}
		public static void mostrarArray(int[]array, String nombre) {
			System.out.println("Contenido del array "+nombre+":"+Arrays.toString(array));
		}
		
		public static int[] reasignarValores(int[] array) {
			int[] newArray=Arrays.copyOf(array, array.length);
			Random random=new Random();
			
			for (int i=0; i<newArray.length; i++) {
				newArray[i]=random.nextInt(100);
			} 
			return newArray;
		}
		
		public static int[] multiplicarArrays(int[]array1, int[]array2) {
			int[] resultado=new int[array1.length];
			for (int i=0; i<array1.length; i++) {
				resultado[i]=array1[i]*array2[i];
			}
			return resultado;
		}
}

