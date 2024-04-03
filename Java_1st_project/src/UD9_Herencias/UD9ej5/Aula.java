package UD9_Herencias.UD9ej5;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int identificador;
    private int maxEstudiantes;
    private String materia;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(int identificador, int maxEstudiantes, String materia) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.estudiantes = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getMaxEstudiantes() {
        return maxEstudiantes;
    }

    public void setMaxEstudiantes(int maxEstudiantes) {
        this.maxEstudiantes = maxEstudiantes;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Método para agregar un estudiante al aula
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El aula está llena, no se puede agregar más estudiantes.");
        }
    }

    // Método para verificar si se puede dar clase en el aula
    public boolean sePuedeDarClase() {
        return profesor != null && profesor.estaDisponible() &&
                profesor.getMateria().equals(materia) &&
                estudiantes.size() > maxEstudiantes / 2;
    }

    // Método para contar estudiantes aprobados
    public void contarEstudiantesAprobados() {
        int aprobadosHombres = 0;
        int aprobadasMujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCalificacion() >= 5.0) {
                if (estudiante.getSexo() == 'M') {
                    aprobadosHombres++;
                } else if (estudiante.getSexo() == 'F') {
                    aprobadasMujeres++;
                }
            }
        }

        System.out.println("Estudiantes aprobados:");
        System.out.println("Hombres: " + aprobadosHombres);
        System.out.println("Mujeres: " + aprobadasMujeres);
    }
}

