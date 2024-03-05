package JavaBasics.UD5JavaBasics;

public class T05ej11 {

	public static void main(String[] args) {
		String dia="Martes";
		String laborable="Hoy es día laborable.";
		String error="No has introducido un día correcto.";
		switch(dia) {
			case "Lunes":
				System.out.println(laborable);
				break;
			case "Martes":
				System.out.println(laborable);
				break;
			case "Miércoles":
				System.out.println(laborable);
				break;
			case "Jueves":
				System.out.println(laborable);
				break;
			case "Viernes":
				System.out.println(laborable);
				break;
			case "Sábado":
				System.out.println(laborable);
				break;
			case "Domingo":
				System.out.println(laborable);
				break;
			default:
				System.out.println(error);
		}

	}

}
