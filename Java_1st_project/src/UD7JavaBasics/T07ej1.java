package UD7JavaBasics;
import java.util.HashMap;
import java.util.Scanner;
public class T07ej1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Introduce el número de alumnos:");
		int cantidadAlumnos=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Introduce el número de notas por alumno:");
		int cantidadNotas=scanner.nextInt();
		scanner.nextLine();
		
		HashMap<String, Integer> notaAlumnos=new HashMap<>();
		
		for(int i=0; i<cantidadAlumnos; i++) {
			System.out.println("Introduce el nombre y las notas de cada"
					+ " alumno en formato Pedro, 7, 4, 9): ");
			String nombreNotas=scanner.nextLine();
			String[] partes=nombreNotas.split(", ");
			String nombre=partes[0];
			
			double sumaNotas=0;
			for(int j=1; j<partes.length; j++) {
				sumaNotas+=Double.parseDouble(partes[j]);
			}
			double notaMedia=sumaNotas/cantidadNotas;
			notaAlumnos.put(nombre, (int) notaMedia);
		}
		System.out.println("La nota media de cada alumno es: "+notaAlumnos);
	}
}
