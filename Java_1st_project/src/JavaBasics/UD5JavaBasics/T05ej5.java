package JavaBasics.UD5JavaBasics;
import javax.swing.JOptionPane;

public class T05ej5 {

	public static void main(String[] args) {
		int a = 2;
		
		String text_num = JOptionPane.showInputDialog("Introduce un valor para \n"
				+ "saber si es divisible entre 2");
		try {
		    int numero = Integer.parseInt(text_num);
		    if (numero % a == 0) {
		        JOptionPane.showMessageDialog(null, text_num + " es divisible entre 2!");
		    } else {
		        JOptionPane.showMessageDialog(null, text_num + " no es divisible entre 2, \n"
		        		+ "introduce otro valor.");
		    }
		} catch (NumberFormatException e) {
		    JOptionPane.showMessageDialog(null, text_num + " no es un valor válido.");
		}
	}
}
