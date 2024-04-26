
public class UD6MetodosApp {

	public static void main(String[] args) {
		
		int operador1=3, operador2=5;
		
		int resultado=sumaNumeros(operador1, operador1);
		System.out.println("El resultado de la suma es: "+resultado);
		
		if (positivos(resultado)){
			System.out.println("El resultado es mayor que 0.");
		}else {
			System.out.println("El resultado es menor que 0.");
		}
	}
	public static int sumaNumeros(int num1, int num2) {
		int resultado=num1+num2;
			return resultado;
		
	}
	public static boolean positivos(int param1) {
		if (param1>=0) {
			return true;
		}else {
			return false;
		}
		
	}
}
