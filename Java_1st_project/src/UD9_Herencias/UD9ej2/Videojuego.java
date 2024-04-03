package UD9_Herencias.UD9ej2;

//Videojuego.java
public class Videojuego implements Entregable {
 private String titulo;
 private int horasEstimadas;
 private boolean entregado;
 private String genero;
 private String compañia;

 // Constructores
 public Videojuego() {
     this("", 10, false, "", "");
 }

 public Videojuego(String titulo, int horasEstimadas) {
     this(titulo, horasEstimadas, false, "", "");
 }

 public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compañia) {
     this.titulo = titulo;
     this.horasEstimadas = horasEstimadas;
     this.entregado = entregado;
     this.genero = genero;
     this.compañia = compañia;
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

 // Método compareTo para comparar por horas estimadas
 @Override
 public int compareTo(Object a) {
     Videojuego videojuego = (Videojuego) a;
     return Integer.compare(horasEstimadas, videojuego.horasEstimadas);
 }

 // Getters y setters
 public String getTitulo() {
     return titulo;
 }

 public void setTitulo(String titulo) {
     this.titulo = titulo;
 }

 public int getHorasEstimadas() {
     return horasEstimadas;
 }

 public void setHorasEstimadas(int horasEstimadas) {
     this.horasEstimadas = horasEstimadas;
 }

 public String getGenero() {
     return genero;
 }

 public void setGenero(String genero) {
     this.genero = genero;
 }

 public String getCompañia() {
     return compañia;
 }

 public void setCompañia(String compañia) {
     this.compañia = compañia;
 }

 // Método toString()
 @Override
 public String toString() {
     return "Videojuego{" +
             "titulo='" + titulo + '\'' +
             ", horasEstimadas=" + horasEstimadas +
             ", entregado=" + entregado +
             ", genero='" + genero + '\'' +
             ", compañia='" + compañia + '\'' +
             '}';
 }
}
