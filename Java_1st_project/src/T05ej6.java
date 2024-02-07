import javax.swing.JOptionPane;

public abstract class T05ej6 {

	public static void main(String[] args) {

		double IVA = 0.21;
		
		String texto_num = JOptionPane.showInputDialog(null, "Inserte el precio "
				+ "del producto (€)");
	try {
		double numero = Double.parseDouble(texto_num);
		double precioConIVA = numero+numero*IVA;
		JOptionPane.showMessageDialog(null, "El precio del producto, "
				+ "incluido el IVA, es: "+precioConIVA+"€");
	
	} catch (NumberFormatException e) {
		  JOptionPane.showMessageDialog(null, texto_num + " no es un número válido.");
	}
}}
