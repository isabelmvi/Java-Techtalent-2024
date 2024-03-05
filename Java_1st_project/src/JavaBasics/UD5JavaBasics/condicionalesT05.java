package JavaBasics.UD5JavaBasics;
public class condicionalesT05 {

	public static void main(String[] args) {
		int hora=20;
		
		if((hora>=1)&&(hora<=11)) {
			System.out.println("Buenos días!");
		} else if((hora>=12)&&(hora<=19)) {
			System.out.println("Buenas tardes!");
		} else {
			System.out.println("Buenas noches!");
		}
	}

}
