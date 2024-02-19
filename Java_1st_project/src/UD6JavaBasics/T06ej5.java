package UD6JavaBasics;
import javax.swing.JOptionPane;
public class T06ej5 {

	public static void main(String[] args) {
		
		
		double numDecimal=Double.parseDouble(JOptionPane.showInputDialog("Inserta un número: "));
		String numBin=pasarNumBin((int)numDecimal);
		JOptionPane.showMessageDialog(null, "El número binario es: "+numBin);
	}

		public static String pasarNumBin(int numDecimal) {
			if (numDecimal==0) {
				return "0";
			}
			
		StringBuilder numBin=new StringBuilder();
			while (numDecimal>0) {
				int residuo=(numDecimal%2);
				numBin.insert(0, residuo);
				numDecimal=numDecimal/2;		
			}		
			return numBin.toString();
		}
}
