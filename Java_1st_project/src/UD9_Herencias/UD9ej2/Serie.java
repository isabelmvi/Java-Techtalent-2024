package UD9_Herencias.UD9ej2;

//Serie.java
public class Serie implements Entregable {
 private String titulo;
 private int numeroTemporadas;
 private boolean entregado;
 private String genero;
 private String creador;

 // Constructores
 public Serie() {
     this("", 3, false, "", "");
 }

 public Serie(String titulo, String creador) {
     this(titulo, 3, false, "", creador);
 }

 public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
     this.titulo = titulo;
     this.numeroTemporadas = numeroTemporadas;
     this.entregado = entregado;
     this.genero = genero;
     this.creador = creador;
 }

 // Métodos de la interfaz Entregable
 @Override
 public void entregar() {
     entregado = true;
 }

 @Override
 public void devolver() {
     entregado = false;
 }

 @Override
 public boolean isEntregado() {
     return entregado;
 }

 // Método compareTo para comparar por número de temporadas
 @Override
 public int compareTo(Object a) {
     Serie serie = (Serie) a;
     return Integer.compare(numeroTemporadas, serie.numeroTemporadas);
 }

 // Getters y setters
 public String getTitulo() {
     return titulo;
 }

 public void setTitulo(String titulo) {
     this.titulo = titulo;
 }

 public int getNumeroTemporadas() {
     return numeroTemporadas;
 }

 public void setNumeroTemporadas(int numeroTemporadas) {
     this.numeroTemporadas = numeroTemporadas;
 }

 public String getGenero() {
     return genero;
 }

 public void setGenero(String genero) {
     this.genero = genero;
 }

 public String getCreador() {
     return creador;
 }

 public void setCreador(String creador) {
     this.creador = creador;
 }

 // Método toString()
 @Override
 public String toString() {
     return "Serie{" +
             "titulo='" + titulo + '\'' +
             ", numeroTemporadas=" + numeroTemporadas +
             ", entregado=" + entregado +
             ", genero='" + genero + '\'' +
             ", creador='" + creador + '\'' +
             '}';
 }
}
