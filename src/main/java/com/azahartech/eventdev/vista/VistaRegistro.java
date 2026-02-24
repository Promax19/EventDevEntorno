package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaRegistro extends JFrame {

    public VistaRegistro() {
        this.setTitle("Registro de usuario");
        this.setSize(450, 380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        Container lienzo = this.getContentPane();
        lienzo.setLayout(new BorderLayout(10, 10));
        ((JPanel) lienzo).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel tituloLabel = new JLabel("Nuevo usuario");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lienzo.add(tituloLabel, BorderLayout.NORTH);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel nombreLabel = new JLabel("Nombre completo:");
        JTextField nombreField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel contrasenyaLabel = new JLabel("Contraseña:");
        JPasswordField contrasenyaField = new JPasswordField();

        JLabel repetirLabel = new JLabel("Repetir contraseña:");
        JPasswordField repetirField = new JPasswordField();

        JLabel edadLabel = new JLabel("Edad:");
        JTextField edadField = new JTextField();

        formularioPanel.add(nombreLabel);
        formularioPanel.add(nombreField);
        formularioPanel.add(emailLabel);
        formularioPanel.add(emailField);
        formularioPanel.add(contrasenyaLabel);
        formularioPanel.add(contrasenyaField);
        formularioPanel.add(repetirLabel);
        formularioPanel.add(repetirField);
        formularioPanel.add(edadLabel);
        formularioPanel.add(edadField);

        lienzo.add(formularioPanel, BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton guardarButton = new JButton("Guardar");
        JButton cancelarButton = new JButton("Cancelar");

        botonesPanel.add(guardarButton);
        botonesPanel.add(cancelarButton);

        lienzo.add(botonesPanel, BorderLayout.SOUTH);
    }
}
