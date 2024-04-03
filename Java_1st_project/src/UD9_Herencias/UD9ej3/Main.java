package UD9_Herencias.UD9ej3;

public class Main {
    public static void main(String[] args) {
   
        Libro libro1 = new Libro("978-0545139700", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 320);
        Libro libro2 = new Libro("978-0061120084", "To Kill a Mockingbird", "Harper Lee", 336);

        System.out.println(libro1);
        System.out.println(libro2);

        String libroConMasPaginas = libro1.getNumeroPaginas() > libro2.getNumeroPaginas() ? libro1.getTitulo() : libro2.getTitulo();
        System.out.println("El libro con más páginas es: " + libroConMasPaginas);
    }
}
