package UD9_Herencias.UD9ej5;

public class Estudiante {
    private String nombre;
    private int edad;
    private char sexo;
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
