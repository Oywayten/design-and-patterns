package vitaliy.grab.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Oywayten 22.08.2023.
 */

public class ImageIconNotNullState implements State {

    volatile ImageIcon imageIcon;

    public ImageIconNotNullState(ImageProxy imageProxy) {
        this.imageIcon = imageProxy.getImageIcon();
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }
}
