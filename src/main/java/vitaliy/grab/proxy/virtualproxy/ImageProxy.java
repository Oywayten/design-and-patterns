package vitaliy.grab.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Oywayten 22.08.2023.
 */

public class ImageProxy implements Icon {

    private final URL imageURL;
    private final State nullState;
    private final State notNullState;
    volatile ImageIcon imageIcon;
    private State state;

    public ImageProxy(URL url) {
        imageURL = url;
        nullState = new ImageIconNullState(this);
        notNullState = new ImageIconNotNullState(this);
        state = nullState;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public State getNullState() {
        return nullState;
    }

    public State getNotNullState() {
        return notNullState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getIconWidth() {
        return state.getIconWidth();
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public int getIconHeight() {
        return state.getIconHeight();
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }
}