package JavaBasics.iniciales;

public class PruebaApp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador=10;
		int x=3;
		int suma=0;
		int resta=0;
		
		suma=operador+++x;
		resta=operador---x;
		
		operador++; //operador = 11
		operador++; //operador =12
		operador--; //operador =11
		
		System.out.println("El resultado de la suma es " +suma);
		System.out.println("El resultado de la resta es " +resta);
	}

}
