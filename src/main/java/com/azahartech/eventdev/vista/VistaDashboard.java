package com.azahartech.eventdev.vista;

import javax.swing.*;
import java.awt.*;

public class VistaDashboard extends JFrame {

    public VistaDashboard() {
        this.setTitle("EventDEV - Catálogo de eventos");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        Container lienzo = this.getContentPane();
        lienzo.setLayout(new BorderLayout(5, 5));

        // --- ZONA WEST: Barra lateral ---
        JPanel barraLateral = new JPanel();
        barraLateral.setBackground(Color.LIGHT_GRAY);
        barraLateral.setPreferredSize(new Dimension(140, 0));
        barraLateral.setLayout(new GridLayout(10, 1));
        barraLateral.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton btnCatalogo = new JButton("Catálogo");
        JButton btnMisEntradas = new JButton("Mis entradas");
        JButton btnPerfil = new JButton("Perfil");
        JButton btnSalir = new JButton("Salir");

        barraLateral.add(btnCatalogo);
        barraLateral.add(btnMisEntradas);
        barraLateral.add(btnPerfil);
        barraLateral.add(btnSalir);

        lienzo.add(barraLateral, BorderLayout.WEST);

        // --- ZONA SOUTH: Barra de estado ---
        JPanel barraEstado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblUsuario = new JLabel("Usuario: Invitado");
        barraEstado.add(lblUsuario);
        lienzo.add(barraEstado, BorderLayout.SOUTH);

        // --- ZONA CENTER: Lista de tarjetas con scroll ---
        JPanel pnlLista = new JPanel();
        pnlLista.setLayout(new GridLayout(0, 1, 0, 10));
        pnlLista.setBackground(Color.WHITE);
        pnlLista.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

// Añadimos tarjetas de prueba
        String[] eventos = {
                "Concierto 1", "Concierto 2", "Concierto 3",
                "Teatro A", "Teatro B", "Festival Rock",
                "Jazz Night", "Ópera Carmen", "Stand-up Comedy",
                "Ballet Clásico", "Flamenco Show"
        };

        for (String evento : eventos) {
            pnlLista.add(new TarjetaEvento(evento, "20/05/2026", "145,00€"));
        }

        JScrollPane scroll = new JScrollPane(pnlLista);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        lienzo.add(scroll, BorderLayout.CENTER);
    }
}
