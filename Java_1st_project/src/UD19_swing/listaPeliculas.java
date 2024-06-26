package UD19_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class listaPeliculas extends JFrame {
    private JComboBox<Pelicula> comboBoxPeliculas;
    private JTextField textFieldNuevaPelicula;
    private JButton buttonAgregar;

    public listaPeliculas() {
        setTitle("Lista de Películas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear JComboBox para almacenar las películas
        comboBoxPeliculas = new JComboBox<>();
        comboBoxPeliculas.setPreferredSize(new Dimension(300, 30));
        add(comboBoxPeliculas);

        // Crear JTextField para introducir nuevas películas
        textFieldNuevaPelicula = new JTextField(20);
        add(textFieldNuevaPelicula);

        // Crear JButton para agregar películas
        buttonAgregar = new JButton("Añadir");
        buttonAgregar.addActionListener(e -> {
            String nombrePelicula = textFieldNuevaPelicula.getText();
            if (!nombrePelicula.isEmpty()) {
                Pelicula nuevaPelicula = new Pelicula(nombrePelicula);
                comboBoxPeliculas.addItem(nuevaPelicula);
                textFieldNuevaPelicula.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, introduce el nombre de la película.");
            }
        });
        add(buttonAgregar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            listaPeliculas listaPeliculas = new listaPeliculas();
            listaPeliculas.setVisible(true);
        });
    }
}

class Pelicula {
    private String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
