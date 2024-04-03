package UD9_Herencias.UD9ej1;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico2[] electrodomesticos = new Electrodomestico2[10];

        		electrodomesticos[0] = new Lavadora(150, 30);
        		electrodomesticos[1] = new Television(42, true, 300, "negro", 'A', 15);
        		electrodomesticos[2] = new Lavadora(400, 0, "rojo", 'D', 25);
        		electrodomesticos[3] = new Television(50, false, 600, "azul", 'E', 35);
        		electrodomesticos[4] = new Electrodomestico2(200, "blanco", 'B', 10);
                electrodomesticos[5] = new Lavadora(700, 50);
                electrodomesticos[6] = new Television(60, true, 800, "gris", 'C', 45);
                electrodomesticos[7] = new Lavadora(1000, 70);
                electrodomesticos[8] = new Television(70, false, 900, "rojo", 'D', 55);
                electrodomesticos[9] = new Electrodomestico2(400, "azul", 'E', 20);

                double precioTotalElectrodomesticos = 0;
                double precioTotalLavadoras = 0;
                double precioTotalTelevisiones = 0;

                for (Electrodomestico2 electrodomestico : electrodomesticos) {
                    if (electrodomestico instanceof Lavadora) {
                        precioTotalLavadoras += electrodomestico.precioFinal();
                    } else if (electrodomestico instanceof Television) {
                        precioTotalTelevisiones += electrodomestico.precioFinal();
                    }
                    precioTotalElectrodomesticos += electrodomestico.precioFinal();
                }

                System.out.println("Precio total de electrodomésticos: " + precioTotalElectrodomesticos);
                System.out.println("Precio total de lavadoras: " + precioTotalLavadoras);
                System.out.println("Precio total de televisiones: " + precioTotalTelevisiones);
            }
        }
