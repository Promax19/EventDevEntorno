package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class TarjetaEvento extends JPanel {

    public TarjetaEvento(String titulo, String fecha, String precio) {
        this.setLayout(new BorderLayout(5, 5));
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));

        JLabel tituloLabel = new JLabel(titulo);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(tituloLabel, BorderLayout.NORTH);

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        JLabel fechaLabel = new JLabel("Fecha: " + fecha);
        JLabel ubicacionLabel = new JLabel("Ubicación confirmada.");
        infoPanel.add(fechaLabel);
        infoPanel.add(ubicacionLabel);
        this.add(infoPanel, BorderLayout.CENTER);

        JButton comprarButton = new JButton("Comprar - " + precio);
        this.add(comprarButton, BorderLayout.SOUTH);
    }
}
