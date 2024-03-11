package UD7JavaBasics;

import java.util.*;
import javax.swing.*;

public class T07ej3 {

    public static void main(String[] args) {
        // Crear un diccionario para almacenar los artículos y sus precios
        Map<String, Double> productos = new HashMap<>();
        pedirNombre(productos);
        int respuesta = masProd();
        do { pedirMasNombres(productos, respuesta);
            respuesta=masProd();
        }while (respuesta == JOptionPane.YES_OPTION);
        consultaPrecio(productos);
        info(productos);
    }

    public static void pedirNombre(Map<String, Double> productos) {
        int num = 3;
        for (int i = 0; i < num; i++) {
            String articulo = JOptionPane.showInputDialog(null, "Introduce el artículo " + (i + 1));
            double precio = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Introduce el precio de " + articulo, "Precio", JOptionPane.PLAIN_MESSAGE));
            productos.put(articulo, precio);
        }
    }
    public static void pedirMasNombres(Map<String, Double>productos, int respuesta) {
    	int numero=productos.size();
    	if(respuesta==JOptionPane.YES_OPTION) {
    		 String articulo = JOptionPane.showInputDialog(null, "Introduce el artículo " + (numero + 1));
             double precio = Double.parseDouble(JOptionPane.showInputDialog(null,
                     "Introduce el precio de " + articulo, "Precio", JOptionPane.PLAIN_MESSAGE));
             productos.put(articulo, precio);
    	} 
    }

    public static int masProd() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas introducir otro producto?",
                "Pregunta", JOptionPane.YES_NO_OPTION);
        return respuesta;
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
        JOptionPane.showMessageDialog(null, "\nInformación almacenada:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
        	lista.append(entry.getKey() + ": €" + entry.getValue()+"\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
