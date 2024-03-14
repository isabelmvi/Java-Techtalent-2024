package UD7JavaBasics;

import java.util.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class T07ej4 {

	public static void main(String[] args) {
		Map<String, Double>productos=new HashMap<>();
		pedirDatos(productos);
		int respuesta=masProd();
		do {pedirMasProd(productos, respuesta);
		respuesta=masProd();
		} while(respuesta==JOptionPane.YES_OPTION);
		consultaPrecio(productos);
		info(productos);
	}
	public static int masProd() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas introducir otro producto?",
                "Pregunta", JOptionPane.YES_NO_OPTION);
        return respuesta;
    }
	 public static void pedirMasProd(Map<String, Double>productos, int respuesta) {
	    	int numero=productos.size();
	    	if(respuesta==JOptionPane.YES_OPTION) {
	    		 String articulo = JOptionPane.showInputDialog(null, "Introduce el artículo " + (numero + 1));
	             double precio = Double.parseDouble(JOptionPane.showInputDialog(null,
	                     "Introduce el precio de " + articulo, "Precio", JOptionPane.PLAIN_MESSAGE));
	             productos.put(articulo, precio);
	    	} 
	}
	 public static void consultaPrecio(Map<String, Double> productos) {
	        String consulta = JOptionPane.showInputDialog("Introduce el nombre del "
	        		+ "artículo para consultar su precio: ");
	        if (productos.containsKey(consulta)) {
	            JOptionPane.showMessageDialog(null, "El precio de " + consulta + " es €" + productos.get(consulta));
	        } else {
	            JOptionPane.showMessageDialog(null, "El artículo no está en la base de datos.");
	        }
	    }

	    public static void info(Map<String, Double> productos) {
	    	StringBuilder lista=new StringBuilder();
	        JOptionPane.showMessageDialog(null, "\nLista de la compra:");
	        for (Map.Entry<String, Double> entry : productos.entrySet()) {
	        	lista.append(entry.getKey() + ": €" + entry.getValue()+"\n");
	        }
	        JOptionPane.showMessageDialog(null, lista.toString());
	    }
	    public static void pedirDatos(Map<String, Double> productos) {
	    	int cantidadProd=Integer.parseInt(JOptionPane.showInputDialog(null, 
	    			"Introduce la cantidad de artículos comprados: "));
	    	
	    	for (int i = 0; i <cantidadProd; i++) {
	    		JPanel panel=new JPanel();
	    		JTextField articuloField=new JTextField(10);
	    		JTextField precioField=new JTextField(4);
	    		JTextField numArtField=new JTextField(4);
	    		
	    		JComboBox<String>ivaComboBox=new JComboBox<>(new String[]{"4%", "21%"});
	    		
		    	panel.add(new JLabel("Artículo: "+(i+1)+":"));
		    	panel.add(articuloField);
		    	panel.add(new JLabel("Precio: "));
		    	panel.add(precioField);
		    	panel.add(new JLabel("Cantidad: "));
		    	panel.add(numArtField);
		    	panel.add(new JLabel("IVA: "));
		    	panel.add(ivaComboBox);
		    	
		    	int result=JOptionPane.showConfirmDialog(null, panel, 
		    			"Introduce los datos para el artículo "+(i+1), JOptionPane.OK_CANCEL_OPTION);
		    	
		    	if(result==JOptionPane.OK_OPTION) {
		    		String articulo=articuloField.getText();
		    		double precio;
		    	try { 
		    		precio=Double.parseDouble(precioField.getText());
		    			double iva=0.21;
		    		if(ivaComboBox.getSelectedItem().equals("4%")){
		    			iva=0.04;
		    		}
		    		productos.put(articulo, precio*(1+iva));
		    	}catch(NumberFormatException e) {
		    		JOptionPane.showMessageDialog(null, "Error, ingresa un número válido "
		    				+ "para el precio", "Error", JOptionPane.ERROR_MESSAGE);
		    		i--;
		    	}	
		    }else {
		    	break;
		    }	
	    }
	}
}
