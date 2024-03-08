package UD7JavaBasics;
import java.text.DecimalFormat;
import java.util.*;

public class T07ej2 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de artículos comprados: ");
        int cantidadProductos = scanner.nextInt();

        Map<String, Double> productos = new HashMap<>();
        double totalProductos = 0;
        double iva = 0;
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Introduce el precio del artículo " + i + ": ");
            double precioProd = scanner.nextDouble();
            
            System.out.println("¿Es este producto de primera necesidad? (Sí/No): ");
            String respuesta = scanner.next().toLowerCase(); 
            
            
            if (respuesta.equals("sí") || respuesta.equals("si")) {
                iva = 0.04; 
            } else {
                iva = 0.21; 
            }

            productos.put("producto" + i, precioProd * (1 + iva)); 
            
            totalProductos += precioProd; 
        }

        System.out.println("Resumen de compras: ");
        DecimalFormat formato = new DecimalFormat("#,##.##");
        double precioTotal = 0;
        for (String producto : productos.keySet()) {
            double precioProd = productos.get(producto);
            double ivaProducto = precioProd - (precioProd / (1 + iva));
            precioTotal += precioProd;
            System.out.println(producto + ": Precio Total: " + formato.format(precioProd) +
                    " - IVA: " + formato.format(ivaProducto) + "€");
        }

        System.out.println("IVA aplicado: " + (iva * 100) + "%");
        System.out.println("Número de artículos comprados: " + cantidadProductos);
        System.out.println("Precio total bruto: " + formato.format(totalProductos) + "€");
        System.out.println("Precio total neto: "+formato.format(precioTotal));
        System.out.println("Introduce la cantidad pagada: ");
        double cantidadPagada = scanner.nextDouble();
        double cambio = cantidadPagada - precioTotal;
        System.out.println("Cambio a devolver al cliente: " + formato.format(cambio) + "€");

        scanner.close();
    }
}