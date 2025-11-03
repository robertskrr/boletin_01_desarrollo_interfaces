/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_15_panel_tematico;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Robert
 */
public class FondoPanel extends JPanel {

    private Image imagen;

    public FondoPanel() {
        // Carga la imagen al crear la instancia
        // **IMPORTANTE**: Reemplaza "fondo.jpg" con la ruta correcta
        // Si está en el classpath, usa getClass().getResource()
        try {
            // Ejemplo si la imagen está en src/miproyecto/imgs/fondo.jpg
            imagen = new ImageIcon(getClass().getResource("/ej_15_panel_tematico/imgs/fondo.jpeg")).getImage();
        } catch (Exception e) {
            // Manejo de errores si la imagen no se encuentra
            System.err.println("Error al cargar la imagen de fondo: " + e.getMessage());
            imagen = null;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (imagen != null) {
            // Dibuja la imagen escalada para que ocupe todo el JPanel
            // El 'this.getWidth()' y 'this.getHeight()' son el tamaño actual del JPanel.
            g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}
