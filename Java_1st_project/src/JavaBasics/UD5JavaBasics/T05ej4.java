package JavaBasics.UD5JavaBasics;
import javax.swing.JOptionPane;

public class T05ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Pi=3.141592653;
		
		String texto_num = JOptionPane.showInputDialog(""
				+ "¿Cuál es el valor del radio del círculo?");
		try {
		    double numero = Double.parseDouble(texto_num);
		    double area = numero*numero*Pi;
		    JOptionPane.showMessageDialog(null, "El área del círculo será de "+area+" m^2");
		} catch (NumberFormatException e) {
			  JOptionPane.showMessageDialog(null, texto_num + " no es un número válido.");
	}
	}

}
