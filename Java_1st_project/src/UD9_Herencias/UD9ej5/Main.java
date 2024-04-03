package UD9_Herencias.UD9ej5;

public class Main {
    public static void main(String[] args) {
        // Crear un profesor y unos estudiantes
        Profesor profesor = new Profesor("Profesor1", 40, 'M', "Matemáticas");
        Estudiante estudiante1 = new Estudiante("Estudiante1", 20, 'M', 7.5);
        Estudiante estudiante2 = new Estudiante("Estudiante2", 21, 'F', 6.8);
        Estudiante estudiante3 = new Estudiante("Estudiante3", 22, 'M', 4.5);
        Estudiante estudiante4 = new Estudiante("Estudiante4", 20, 'F', 8.2);

        // Crear un aula para matemáticas y agregar estudiantes
        Aula aulaMatematicas = new Aula(1, 20, "Matemáticas");
        aulaMatematicas.agregarEstudiante(estudiante1);
        aulaMatematicas.agregarEstudiante(estudiante2);
        aulaMatematicas.agregarEstudiante(estudiante3);
        aulaMatematicas.agregarEstudiante(estudiante4);
        aulaMatematicas.setProfesor(profesor);

        // Verificar si se puede dar clase y contar estudiantes aprobados
        if (aulaMatematicas.sePuedeDarClase()) {
            System.out.println("Se puede dar clase en el aula de Matemáticas.");
            aulaMatematicas.contarEstudiantesAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula de Matemáticas.");
        }

        // Mostrar información detallada de los estudiantes y el profesor
        System.out.println("\nInformación detallada:");
        System.out.println("Profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Sexo: " + profesor.getSexo());
        System.out.println("Materia: " + profesor.getMateria());
        System.out.println("Disponible: " + (profesor.estaDisponible() ? "Sí" : "No"));

        System.out.println("\nEstudiantes:");
        for (Estudiante estudiante : aulaMatematicas.getEstudiantes()) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Edad: " + estudiante.getEdad());
            System.out.println("Sexo: " + estudiante.getSexo());
            System.out.println("Calificación: " + estudiante.getCalificacion());
            System.out.println();
        }
    }
}
