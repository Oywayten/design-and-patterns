package vitaliy.grab.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * Oywayten 22.08.2023.
 */

public class ImageIconNullState implements State {

    public static final int DEFAULT_WIDTH = 800;
    public static final int DEFAULT_HEIGHT = 600;
    private final ImageProxy imageProxy;

    private boolean retrieving = false;
    private Thread retrievalThread;

    public ImageIconNullState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return DEFAULT_WIDTH;
    }

    @Override
    public int getIconHeight() {
        return DEFAULT_HEIGHT;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.drawString("Loading album cover, please wait...", x + 300, y + 190);
        if (!retrieving) {
            retrieving = true;
            retrievalThread = new Thread(() -> {
                try {
                    setImageIcon(new ImageIcon(imageProxy.getImageURL(), "Album Cover"));
                    imageProxy.setState(imageProxy.getNotNullState());
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            retrievalThread.start();
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        imageProxy.imageIcon = imageIcon;
    }
}
