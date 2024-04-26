import javax.swing.JOptionPane;
public class T05ej13 {
//Calculadora inversa
	public static void main(String[] args) {
		
		int var1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer operando:"));
		int var2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo operando:"));
		String signo = JOptionPane.showInputDialog(null, "Introduce uno de los signos aritméticos "
				+ "siguientes: +, -, *, /, ^, % ");
		
		double result=0;
		switch (signo) {
			case "+":
				result=var1+var2;
				break;
			case "-":
				result=var1-var2;
				break;
			case "*":
				result=var1*var2;
				break;
			case "/":
				if (var2 !=0) {
					result =(double)var1/var2;
					} else {
						JOptionPane.showMessageDialog(null, "Error! Se ha intentado dividir un número entre 0.");
						System.exit(0);
				} break;
			case "^":
				result=Math.pow(var1, var2);
				break;
			case "%":
				result=var1%var2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "El signo aritmético introducido no es válido.");
				System.exit(0);
			}
		JOptionPane.showMessageDialog(null, "El resultado es: "+result);
	}

}
