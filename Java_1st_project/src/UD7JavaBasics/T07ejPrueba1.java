package UD7JavaBasics;

import java.util.*;
import java.util.Scanner;

public class T07ejPrueba1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el número de alumnos:");
		int cantidadAlumnos=scanner.nextInt();
		scanner.nextLine();
		
		HashMap<String, Integer> edadAlumnos=new HashMap<>();
		
		System.out.println("Introduce el nombre y la edad de cada alumno"
				+ "(en formato Pedro, 24: ");
		for(int i=0; i<cantidadAlumnos; i++) {
			String nombreEdad=scanner.nextLine();
			String[] partes=nombreEdad.split(", ");
			String nombre=partes[0];
			int edad=Integer.parseInt(partes[1]);
			
			edadAlumnos.put(nombre, edad);
		}
		System.out.println("Edades de alumnos: "+edadAlumnos);
	}
}
