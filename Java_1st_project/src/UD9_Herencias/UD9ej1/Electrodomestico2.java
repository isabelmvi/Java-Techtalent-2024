package UD9_Herencias.UD9ej1;

public class Electrodomestico2 {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
    protected static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
    protected static final double PRECIO_BASE_POR_DEFECTO = 100;
    protected static final double PESO_POR_DEFECTO = 5;

    public Electrodomestico2() {
        this.color = "blanco";
        this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico2(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico2(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    protected void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        }
    }

    protected void comprobarColor(String color) {
        boolean encontrado = false;
        for (String colorDisponible : COLORES_DISPONIBLES) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                this.color = colorDisponible;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            this.color = "blanco"; // Color por defecto
        }
    }

    public double precioFinal() {
        double precioFinal = precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
            default:
                precioFinal += 10; // Si la letra no está entre A y F, se agrega un valor predeterminado
        }

        if (peso >= 0 && peso < 20) {
            precioFinal += 10;
        } else if (peso < 50) {
            precioFinal += 50;
        } else if (peso < 80) {
            precioFinal += 80;
        } else {
            precioFinal += 100;
        }

        return precioFinal;
    }
}
