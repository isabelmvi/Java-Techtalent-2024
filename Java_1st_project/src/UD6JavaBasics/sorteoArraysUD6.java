import javax.swing.JOptionPane;

public class sorteoArraysUD6 {

    public static void main(String[] args) {

        String[] participantes = new String[3];

        // Pedir los nombres de los participantes
        for (int i = 0; i < participantes.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre del participante " + (i + 1) + ":");
            participantes[i] = nombre;

            // Mostrar los participantes
            StringBuilder listaParticipantes = new StringBuilder("\nLista de participantes: ");
            for (String participante : participantes) {
                listaParticipantes.append("\n-").append(participante);
            }
            JOptionPane.showMessageDialog(null, listaParticipantes.toString());
        }

        // Realizar el sorteo
        int indiceGanador = (int) (Math.random() * participantes.length);
        String ganador = participantes[indiceGanador];
        JOptionPane.showMessageDialog(null, "\nEl ganador del sorteo es: " + ganador);
    }
}
