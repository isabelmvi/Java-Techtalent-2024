package JavaBasics.iniciales;

public class PruebaApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador1 = 15;
		int operador2 = 20;
		int resultado = 0;
		int suma = 0;
		int resta1 = 0;
		int resta2 = 0;
		int multiplicacion = 0;
		int division = 0;
		int modulo = 0;
		
		
		suma= operador1+operador2; //resultado = 35
		resta1= operador1-operador2; //resulatado = 5
		resta2= operador2-operador1; //resultado = -5
		multiplicacion= operador1*operador2; //resultado = 300
		division= operador1/operador2; //resultado = 1 (como es int, no incluye decimales)
		modulo= operador1%operador2; //resultado = 5 (el resto de la división)
		
		System.out.println("El resultado de la suma es "+suma);
		System.out.println("El resultado de la resta1 es "+resta1);
		System.out.println("El resultado de la resta2 es "+resta2);
		System.out.println("El resultado de la multiplicacion es "+multiplicacion);
		System.out.println("El resultado de la division es "+division);
		System.out.println("El resultado de la modulo es "+modulo);
	}

}
