import javax.swing.JOptionPane;

public class T05ej12 {

	public static void main(String[] args) {

		 String texto_num = JOptionPane.showInputDialog(null, "Introduce la contraseña:");
		 String pass = "12345";
		 int cont = 1;
		
		 
	int validacion=Integer.parseInt(texto_num);	
	
	while ((!texto_num.equals(pass)) && (cont<3)){
		cont++;
		if (texto_num.equals(pass)){
			JOptionPane.showMessageDialog(null, "Contraseña válida");
			cont =10;
		} else {JOptionPane.showMessageDialog(null, "No es una contraseña válida.");
		texto_num = JOptionPane.showInputDialog(null, "Introduce la contraseña:");
	}
		
		
		
	}
}
}	