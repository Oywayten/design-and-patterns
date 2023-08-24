package vitaliy.grab.proxy.virtualproxy;

import java.awt.*;

/**
 * Oywayten 19.08.2023.
 */

public interface State {

    int getIconWidth();

    int getIconHeight();

    void paintIcon(Component c, Graphics g, int x, int y);
}
