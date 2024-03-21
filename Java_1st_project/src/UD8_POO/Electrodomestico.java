package UD8_POO;

public class Electrodomestico {

    //ATRIBUTOS
    protected double precioBase;
    protected String color;
    protected char consumoEnerg;
    protected double peso;

    //Constantes por defecto
    protected final String COLOR_POR_DEFECTO = "blanco";
    protected final char CONSUMOENERG_POR_DEFECTO = 'F';
    protected final double PRECIOBASE_POR_DEFECTO = 100;
    protected final double PESO_POR_DEFECTO = 5;

    // Constructores
    public Electrodomestico() {
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnerg = CONSUMOENERG_POR_DEFECTO;
        this.precioBase = PRECIOBASE_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = COLOR_POR_DEFECTO;
        } else {
            this.color = color;
        }
        if (consumoEnergetico < 'A' || consumoEnergetico > 'F') {
            this.consumoEnerg = CONSUMOENERG_POR_DEFECTO;
        } else {
            this.consumoEnerg = consumoEnergetico;
        }
        this.peso = peso;
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Electrodomestico [" + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
                + consumoEnerg + ", peso=" + peso + "]";
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnerg;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnerg = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        // Crear una instancia de Electrodomestico
        Electrodomestico electrodomestico = new Electrodomestico();

        // Mostrar los datos de la persona
        electrodomestico.mostrarDatos();
    }
}
