package UD7JavaBasics;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T07ej2 {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de artículos comprados: ");
        int cantidadProductos = scanner.nextInt();

        Map<String, Double> productos = new HashMap<>();
        double totalProductos = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Introduce el precio del artículo " + i + ": ");
            double precioProd = scanner.nextDouble();

            productos.put("producto" + i, precioProd);

            totalProductos += precioProd; // Sumar al total de productos
        }

        System.out.println("Selecciona el tipo de IVA (21% o 4%): ");
        int tipoIVA = scanner.nextInt();

        double iva = tipoIVA == 21 ? 0.21 : 0.04;

        System.out.println("Resumen de compras: ");
        DecimalFormat formato = new DecimalFormat("#,##.##");
        for (String producto : productos.keySet()) {
            double precioProd = productos.get(producto);
            double ivaProducto = precioProd * iva;
            double precioTotal = precioProd + ivaProducto;
            System.out.println(producto + ": Precio Total: " + formato.format(precioTotal) +
                    " - IVA: " + formato.format(ivaProducto) + "€");
        }

        System.out.println("IVA aplicado: " + (iva * 100) + "%");
        System.out.println("Número de artículos comprados: " + cantidadProductos);
        System.out.println("Precio total bruto: " + formato.format(totalProductos) + "€");
        System.out.println("Precio total neto: "+formato.format(totalProductos+iva));

        System.out.println("Introduce la cantidad pagada: ");
        double cantidadPagada = scanner.nextDouble();
        double cambio = cantidadPagada - totalProductos-iva;
        System.out.println("Cambio a devolver al cliente: " + formato.format(cambio) + "€");

        scanner.close();
     */
    }
}
