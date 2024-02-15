package UD6JavaBasics;
import javax.swing.JOptionPane;

public class T06ej1 {
	
	public static void main(String[] args) {
		
		String poligono= JOptionPane.showInputDialog("Introduce un polígono: ");
		
		switch(poligono.toLowerCase()) {
		case "circulo":
			//1. Crear variable(s) de parámetro(s)
			//2. Pedir los valores
			//3. Llamar al método y mostrar
			double var1=Double.parseDouble(JOptionPane.showInputDialog("Dame el radio: "));
			double resultado1=Math.round(circulo(var1));
			JOptionPane.showMessageDialog(null, "El resultado del área del circulo es: "+resultado1);
			break;
		case "triangulo":
			double var2=Double.parseDouble(JOptionPane.showInputDialog("Dame la base: "));
			double var3=Double.parseDouble(JOptionPane.showInputDialog("Dame la altura: "));
			double resultado2=triangulo(var2, var3);
			JOptionPane.showMessageDialog(null, "El resultado del área del triangulo es: "+resultado2);
			break;
		case "cuadrado":
			double var4=Double.parseDouble(JOptionPane.showInputDialog("Dame el lado: "));
			double resultado3=cuadrado(var4);
			JOptionPane.showMessageDialog(null, "El resultado del área del triangulo es: "+resultado3);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Esto no es un polígono.");
			break;
		}
	}	

	public static double circulo(double radio) {
	return(Math.pow(radio, 2))*Math.PI;
	}
	public static double triangulo(double var2, double var3){
	return (var2*var3)/2;
	}
	public static double cuadrado(double var4) {
	return (var4*var4);
	}
	


}
