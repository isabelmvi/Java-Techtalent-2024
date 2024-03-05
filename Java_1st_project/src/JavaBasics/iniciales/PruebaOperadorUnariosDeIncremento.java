package JavaBasics.iniciales;

public class PruebaOperadorUnariosDeIncremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador=10;
		int x=0;
		operador++;
		operador++;
		operador--;

		x=operador++;
		x=++operador;
		x=operador--;
		
		System.out.println(operador);
		System.out.println(operador++);
		System.out.println(++operador);
	}

}
