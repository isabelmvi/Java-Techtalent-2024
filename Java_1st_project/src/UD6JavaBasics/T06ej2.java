package UD6JavaBasics;
import java.util.Scanner;
public class T06ej2 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ingresa el número mínimo del rango.");
		int minimo=scanner.nextInt();
		
		System.out.println("Ingresa el número máximo del rango.");
		int maximo=scanner.nextInt();
		
		System.out.println("Ingrese la cantidad de números aleatorios a generar:");
        int cantidad = scanner.nextInt();
        
        for (int i=0; i<cantidad; i++) {
        	int numeroAleatorio=generarNumeroAleatorio(minimo, maximo);
        	System.out.println("Número aleatorio #"+i+(i+1)+":"+numeroAleatorio);
        }
	}
	
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		return (int)(Math.random()*maximo-minimo+1)+minimo;
	}

}
