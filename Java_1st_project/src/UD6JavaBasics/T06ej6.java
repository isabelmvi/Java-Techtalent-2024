package UD6JavaBasics;
import javax.swing.JOptionPane;
public class T06ej6 {

	public static void main(String[] args) {
		
		String numEnt=JOptionPane.showInputDialog("Introduce "
				+ "un número entero positivo: ");
		int result=contar(numEnt);
		JOptionPane.showMessageDialog(null, result);
	
	}
	public static int contar(String numEnt) {
		int length=numEnt.length();
		return length;
		
	}
}
