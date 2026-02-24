package com.azahartech.eventdev.vista;

import javax.swing.SwingUtilities;

public class AppGui {
    public static void main(String[] args) {
        VistaLogin ventana = new VistaLogin();
        ventana.setVisible(true);

        new VistaRegistro().setVisible(true);
        new VistaDashboard().setVisible(true);
    }
}

