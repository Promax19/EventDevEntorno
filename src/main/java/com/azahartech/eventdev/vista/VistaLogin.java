package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaLogin extends JFrame {

    public VistaLogin() {
        this.setTitle("Acceso a EventDEV");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        Container lienzo = this.getContentPane();
        lienzo.setLayout(new BorderLayout(10, 10));
        ((JPanel) lienzo).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel tituloLabel = new JLabel("Bienvenido a EventDEV");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
        tituloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lienzo.add(tituloLabel, BorderLayout.NORTH);

        JPanel formularioPanel = new JPanel();
        formularioPanel.setLayout(new GridLayout(2, 2, 10, 10));

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel contrasenyaLabel = new JLabel("Contraseña:");
        JPasswordField contrasenyaField = new JPasswordField();

        formularioPanel.add(emailLabel);
        formularioPanel.add(emailField);
        formularioPanel.add(contrasenyaLabel);
        formularioPanel.add(contrasenyaField);

        lienzo.add(formularioPanel, BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton loginButton = new JButton("Entrar");
        JButton registroButton = new JButton("Registrarse");

        botonesPanel.add(loginButton);
        botonesPanel.add(registroButton);

        lienzo.add(botonesPanel, BorderLayout.SOUTH);
    }
}
