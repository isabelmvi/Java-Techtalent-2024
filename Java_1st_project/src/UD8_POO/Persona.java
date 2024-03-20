package UD8_POO;

public class Persona {
	public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 30, "12345678Z", 'H', 70.5, 1.75);
        
        // Mostrar los datos de la persona
        persona.mostrarDatos();
    }
    private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    // Constante para el sexo por defecto
    private static final char SEXO_POR_DEFECTO = 'H';
    
    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    // Constructor con nombre, edad y sexo, el resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    // Método para generar un DNI aleatorio
    private String generarDNI() {
        // Código para generar un DNI aleatorio
        return "00000000T";
    }
    
    // Método para comprobar el sexo
    private char comprobarSexo(char sexo) {
        // Si el sexo introducido no es válido, se asigna el sexo por defecto
        if (sexo != 'H' && sexo != 'M') {
            return SEXO_POR_DEFECTO;
        } else {
            return sexo;
        }
    }
    
    // Getters y setters (solo para nombre, edad, peso y altura)
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
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para mostrar los detalles de la persona
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + DNI);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
}
