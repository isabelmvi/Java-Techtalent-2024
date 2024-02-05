
public class T04ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=2;
		int B=4;
		int C=7;
		int D=5;
					
		System.out.println("Valores iniciales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);

        // Realizar intercambio de valores
        int temp = B;
        B = C;
        C = A;
        A = D;
        D = temp;

        // Mostrar los valores después del intercambio
        System.out.println("Valores después del intercambio:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
	
	}

}
