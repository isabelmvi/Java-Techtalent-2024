package UD7JavaBasics;
import java.util.*;
import javax.swing.*;
public class T07ej1 {

	public static void main(String[] args) {
		HashMap<String, Object> alumnos = new HashMap<>();
		String pedirNombre=pedirNombre();
		String notas=pedirNotas();
		String[] partes=notas.split(", ");
		double sumaNotas=0.0;
		
		for (String notas1:partes) {
			double nota=Double.parseDouble(notas1);
			sumaNotas+=nota;
		}
		double media=sumaNotas/partes.length;
		alumnos.put(pedirNombre, media);
		JOptionPane.showMessageDialog(null, alumnos);
	}
	public static String pedirNombre () {
		return JOptionPane.showInputDialog(null, "Introduce el nomobre del alumno: ");
	}
	public static String pedirNotas() {
		return (String) JOptionPane.showInputDialog(null, "Introduce las notas del "
				+ "alumno separadas por comas: ");
	}
	public static double sumarNotas(double suma, double nota) {
		return suma+=nota;
	}
	
		
	//	Scanner scanner=new Scanner(System.in);
		
	//	System.out.println("Introduce el número de alumnos:");
	//	int cantidadAlumnos=scanner.nextInt();
	//	scanner.nextLine();
	//	
	//	System.out.println("Introduce el número de notas por alumno:");
	//	int cantidadNotas=scanner.nextInt();
	//	scanner.nextLine();
		
	//	HashMap<String, Integer> notaAlumnos=new HashMap<>();
		
	//	for(int i=0; i<cantidadAlumnos; i++) {
	//		System.out.println("Introduce el nombre y las notas de cada"
	//				+ " alumno en formato Pedro, 7, 4, 9): ");
	//		String nombreNotas=scanner.nextLine();
	//		String[] partes=nombreNotas.split(", ");
	//		String nombre=partes[0];
			
	//		double sumaNotas=0;
	//		for(int j=1; j<partes.length; j++) {
	//			sumaNotas+=Double.parseDouble(partes[j]);
	//		}
	//		double notaMedia=sumaNotas/cantidadNotas;
	//		notaAlumnos.put(nombre, (int) notaMedia);
	//	}
	//	System.out.println("La nota media de cada alumno es: "+notaAlumnos);
		
}
