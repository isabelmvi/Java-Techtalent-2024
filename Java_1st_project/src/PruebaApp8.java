
public class PruebaApp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operador1=10;
		int operador2=20;
		int operador3=10;
		boolean resultado;
		
		resultado=operador1==operador2; //¿10 es igual a 20? resultado=false
		resultado=operador1==operador3; //¿10 es igual a 10? resultado=true
		resultado=operador1!=operador2; //¿10 es distinto a 20? resultado=true
		resultado=operador1>operador2; //¿10 es mayor que 20? resultado=false
		resultado=operador1>operador3; //¿10 es mayor que 10? resultado=false
		resultado=operador1<operador2; //¿20 es mayor que 10? resultado=true
		resultado=operador1<=operador3; //¿10 es mayor o igual que 10? resultado=true
		resultado=operador1>=operador2; //¿10 es mayor o igual que 20? resultado=false
		
	}

}
