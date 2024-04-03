package UD9_Herencias.UD9ej1;

public class Television extends Electrodomestico2 {
    private static final int RESOLUCION_POR_DEFECTO = 20;
    private static final boolean SINTONIZADOR_TDT_POR_DEFECTO = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_POR_DEFECTO;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_POR_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_POR_DEFECTO;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.30; // Incremento del 30%
        }

        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
