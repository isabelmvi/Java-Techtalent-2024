package UD8_POO;

public class Serie {
		
	    private String titulo;
	    private int numTemporadas;
	    private boolean completado;
	    private String genero;
	    private String autor;

	    // Constructor por defecto
	    public Serie() {
	        this("", 3, false, "", "");
	    }

	    // Constructor con título y autor
	    public Serie(String titulo, String autor) {
	        this(titulo, 3, false, "", autor);
	    }

	    // Constructor con todos los atributos excepto 'completado'
	    public Serie(String titulo, int numTemporadas, String genero, String autor) {
	        this(titulo, numTemporadas, false, genero, autor);
	    }

	    // Constructor con todos los atributos
	    public Serie(String titulo, int numTemporadas, boolean completado, String genero, String autor) {
	        this.titulo = titulo;
	        this.numTemporadas = numTemporadas;
	        this.completado = completado;
	        this.genero = genero;
	        this.autor = autor;
	    }

	    // Métodos getter y setter
	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public int getNumTemporadas() {
	        return numTemporadas;
	    }

	    public void setNumTemporadas(int numTemporadas) {
	        this.numTemporadas = numTemporadas;
	    }

	    public boolean isCompletado() {
	        return completado;
	    }

	    public void setCompletado(boolean completado) {
	        this.completado = completado;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    // Método toString para imprimir la información de la serie
	    @Override
	    public String toString() {
	        return "Serie{" +
	                "titulo='" + titulo + '\'' +
	                ", numTemporadas=" + numTemporadas +
	                ", completado=" + completado +
	                ", genero='" + genero + '\'' +
	                ", autor='" + autor + '\'' +
	                '}';
	    }
	    public static void main(String[] args) {
	        // Crear una instancia de Electrodomestico
	       Serie serie = new Serie();

	        // Mostrar los datos de la persona
	        serie.mostrarDatos();
	    }
	    public void mostrarDatos() {
	        System.out.println(this.toString());
	    }

}
