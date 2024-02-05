
public class PruebaApp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1=10;
		int op2=20;
		int op3=10;
		int op4=30;
		int op5=15;
		
		boolean result1;
		boolean result2;
		boolean result3;
		
		result1=op1==op3 && op2<op4;
		//¿Es 10 igual a 10 y es 20 menor que 30? =true
		result2=op1!=op4 || op3==op5;
		//¿Es 10 distinto a 30 o es 10 igual a 15? =true
		//Si fuese &&, sería false
		result3=op1==op3 && op2<=op4 || op2>=op5;
		//¿Es 10 igual a 10 y es 20 menor que 30 o es 10 mayor o igual que 15? =true
		//Aquí primero se evalúan las coniciones con && y el resultado de esta se compara con ||
		
		System.out.println("¿Es "+op1+" igual a "+op3+ "y es "+op2+" menor que "+op4+ "? "+result1);
		System.out.println("¿Es "+op1+" distinto a "+op4+" o es "+op3+" igual a "+op5+ "? " +result2);
		System.out.println("¿Es "+op1+"igual a "+op3+" y es "+op2+" menor que "+op4+ " o es "+op2+" mayor o igual que "+op5+"? " +result3);
		
	}

}
