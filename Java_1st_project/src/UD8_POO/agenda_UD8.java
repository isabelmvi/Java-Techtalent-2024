package UD8_POO;

public class agenda_UD8 {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    // Métodos
    public boolean plus(double sueldoPlus) {
        boolean aumento = false;
        if (edad > 40) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }

    // Puedes agregar getters y setters según sea necesario
    // Ejemplo de getter para el salario
    public double getSalario() {
        return salario;
    }

    // Puedes agregar otros métodos según sea necesario
}
