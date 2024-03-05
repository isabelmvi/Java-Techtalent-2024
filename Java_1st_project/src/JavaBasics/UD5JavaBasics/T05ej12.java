package JavaBasics.UD5JavaBasics;
import javax.swing.JOptionPane;

public class T05ej12 {

	public static void main(String[] args) {

		 String pass = "12345";
		 int cont = 0;
		
	while (cont<3){
		 String texto_num = JOptionPane.showInputDialog(null, "Introduce la contraseña:");
		if (texto_num.equals(pass)){
			JOptionPane.showMessageDialog(null, "Contraseña válida!");
			break;
		} else {JOptionPane.showMessageDialog(null, "No es una contraseña válida.");
			cont++;
	}
}
			if(cont>=3){
			JOptionPane.showMessageDialog(null, "Se acabaron los intentos:(");
		}
}
}	