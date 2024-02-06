import javax.swing.JOptionPane;

public class T05ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "¿Cuál de las dos es mayor, a o b?");
		
		String texto_num1 = JOptionPane.showInputDialog("Introduce el valor de la variable a");
		int Variable1=Integer.parseInt(texto_num1);
		String texto_num2= JOptionPane.showInputDialog("Introduce el valor de la variable b");
		int Variable2=Integer.parseInt(texto_num2);
		
	if (Variable1>Variable2){
//		System.out.println("a es mayor que b");
		String result; JOptionPane.showMessageDialog(null, "a es mayor que b");
	}
	else if (Variable1<Variable2){
//		System.out.println("b es mayor que a");
		String result; JOptionPane.showMessageDialog(null, "b es mayor que a");
	}
	else {
//		System.out.println("a es igual a b");
		String result; JOptionPane.showMessageDialog(null, "a es igual a b");
	}
	}

}
