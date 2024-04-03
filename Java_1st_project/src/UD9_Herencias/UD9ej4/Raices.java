package UD9_Herencias.UD9ej4;

public class Raices {
    private double a;
    private double b;
    private double c;

    // Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular el discriminante
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    // Método para comprobar si tiene raíces reales
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    // Método para comprobar si tiene una única raíz real
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    // Método para calcular y mostrar las soluciones de la ecuación de segundo grado
    public void calcular() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2);
        } else if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La solución única de la ecuación es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

    // Método para obtener las raíces
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las raíces de la ecuación son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }

    // Método para obtener la raíz única
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La raíz única de la ecuación es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene raíz única.");
        }
    }
}
