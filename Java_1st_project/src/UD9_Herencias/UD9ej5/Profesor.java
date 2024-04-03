package UD9_Herencias.UD9ej5;

import java.util.Random;

public class Profesor {
    private String nombre;
    private int edad;
    private char sexo;
    private String materia;

    public Profesor(String nombre, int edad, char sexo, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.materia = materia;
    }

    public boolean estaDisponible() {
        Random random = new Random();
        return random.nextDouble() > 0.2;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
