package JavaBasics.UD5JavaBasics;
import javax.swing.JOptionPane;

public class T05ej10 {

    public static void main(String[] args) {

        String text_num = JOptionPane.showInputDialog(null, "Introduce un número de ventas");

        
        if (text_num != null && !text_num.isEmpty()) {
            int numVentas = Integer.parseInt(text_num);
            double sumaVentas=0;
            
        for (int i = 1; i <= numVentas; i++) {
            String text_num2 = JOptionPane.showInputDialog(null, "Introduce la venta " + i);
      
            if (text_num2 != null && !text_num2.isEmpty()) {
                double venta = Double.parseDouble(text_num2);
                sumaVentas += venta;
        } else {
            
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se esperaba un número.");
            i--;
        }
        }
        
            JOptionPane.showMessageDialog(null, "La suma total de las ventas es: " + sumaVentas);
        } else {
            
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se esperaba un número.");
        }
    
            
       
        
    }
}
