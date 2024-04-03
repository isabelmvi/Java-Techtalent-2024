package UD9_Herencias.UD9ej4;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Raices con coeficientes dados
        Raices ecuacion = new Raices(1, -3, 2);

        // Calcular y mostrar información sobre las soluciones de la ecuación
        System.out.println("Discriminante: " + ecuacion.getDiscriminante());
        System.out.println("¿Tiene raíces reales? " + ecuacion.tieneRaices());
        System.out.println("¿Tiene raíz única? " + ecuacion.tieneRaiz());
        ecuacion.calcular();
        ecuacion.obtenerRaices();
        ecuacion.obtenerRaiz();
    }
}
