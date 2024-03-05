package proyectos_grupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class proyectoGrupo1 {

	public static void main(String[] args) {
		 String nombresInput = JOptionPane.showInputDialog(null, "Ingrese nombres de personas separados por espacios:");
	        String[] nombres = nombresInput.split(" ");

	        gruposAleatorios(nombres);
	    }

	    // Método para formar grupos aleatorios
	    private static void gruposAleatorios(String[] nombres) {
	        int totalPersonas = nombres.length;
	        int tamanoGrupo = 3;

	        // Verificar si es posible formar grupos de 3 personas
	        if (totalPersonas < tamanoGrupo) {
	            JOptionPane.showMessageDialog(null, "No hay suficientes personas para formar un grupo de " + tamanoGrupo + " personas.");
	            return;
	        }

	        List<String> nombresList = new ArrayList<>();
	        Collections.addAll(nombresList, nombres);
	        Collections.shuffle(nombresList);
	        nombres = nombresList.toArray(new String[0]);

	        StringBuilder gruposTexto = new StringBuilder();
	        int personasRestantes = totalPersonas;
	        int numeroGrupo = 1;

	        // Formar grupos de 3 personas
	        while (personasRestantes >= tamanoGrupo) {
	            gruposTexto.append("Grupo ").append(numeroGrupo).append(": ");
	            for (int j = 0; j < tamanoGrupo; j++) {
	                gruposTexto.append(nombres[totalPersonas - personasRestantes]).append(" ");
	                personasRestantes--;
	            }
	            gruposTexto.append("\n");
	            numeroGrupo++;
	        }

	        // Si quedan personas sueltas, formar un grupo con ellas
	        if (personasRestantes > 0) {
	            gruposTexto.append("Grupo Adicional: ");
	            for (int k = 0; k < personasRestantes; k++) {
	                gruposTexto.append(nombres[totalPersonas - personasRestantes + k]).append(" ");
	            }
	            gruposTexto.append("\n");
	        }

	        JOptionPane.showMessageDialog(null, gruposTexto.toString());
	    }
	}
