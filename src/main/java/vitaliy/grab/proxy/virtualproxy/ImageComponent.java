package vitaliy.grab.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

/**
 * Oywayten 24.08.2023.
 */

class ImageComponent extends JComponent {
    @Serial
    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}