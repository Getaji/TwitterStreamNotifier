package mw.popupper.src;

import java.awt.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class ComponentSupporter {
    public static final Color COLOR_CLEANNESS = new Color(0, 0, 0, 0);
    public static final Font FONT_MEIRYO_UI_BOLD_13PT = new Font("Meiryo UI", Font.BOLD, 14);
    public static final Font FONT_MEIRYO_UI_12PT = new Font("Meiryo UI", Font.PLAIN, 12);

    public static Component addAll(Container target, Component... components) {
        for (Component component : components) {
            target.add(component);
        }
        return target;
    }
}
