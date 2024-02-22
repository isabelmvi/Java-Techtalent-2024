package UD6JavaBasics;
import javax.swing.JOptionPane;
public class T06ej7 {

	public static void main(String[] args) {
		
		String eurosStr=JOptionPane.showInputDialog("Introduce la cantidad en euros: ");
		String moneda=JOptionPane.showInputDialog("Introduce la moneda a"
				+ " la que quieres pasarlo: ");
		double euros=Double.parseDouble(eurosStr);
		
		switch (moneda){
			case "libras":
				double libras;
				double resultLibras=libras(euros*0.86);
				JOptionPane.showMessageDialog(null,euros+" euros = "+resultLibras+" libras");
				break;
			case "$":
				double $;
				double result$=$(euros*1.28611);
				JOptionPane.showMessageDialog(null,euros+" euros = "+result$+" $");
				break;
			case "yenes":
				double yenes;
				double resultYenes=yenes(euros*129.852);
				JOptionPane.showMessageDialog(null,euros+" euros = "+resultYenes+" yenes");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Moneda no válida.");
                break;
		}
	}
	public static double moneda(double euros, double result) {
		return result;
	}
	private static double libras(double resultLibras) {
		return resultLibras;
	}
	private static double $(double result$) {
		return result$;
	}

	private static double yenes(double resultYenes) {
		return resultYenes;
	}

}
