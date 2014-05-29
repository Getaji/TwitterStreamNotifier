package mw.popupper.src;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class QueueViewer extends JWindow {

    private final JPanel panel = new JPanel();
    private final Map<JComponent, JPanel> components = new HashMap<>();

    public QueueViewer() {
        setBackground(ComponentSupporter.COLOR_CLEANNESS);
        setLayout(new BorderLayout());
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setFocusable(false);
        panel.setBackground(ComponentSupporter.COLOR_CLEANNESS);
        panel.setOpaque(true);
        add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    public void offer(JComponent component) {
        Border border = component.getBorder();
        //component.setBorder(new CompoundBorder(createEmptyBorder(5), border));
        JPanel wrapPanel = new JPanel();
        wrapPanel.setBorder(createEmptyBorder(5));
        wrapPanel.setPreferredSize(component.getPreferredSize());
        wrapPanel.add(component);
        wrapPanel.setBackground(ComponentSupporter.COLOR_CLEANNESS);
        wrapPanel.setOpaque(true);
        spread(wrapPanel, 10, 10);
        panel.add(wrapPanel);
        components.put(component, wrapPanel);
        pack();
    }

    public JComponent poll(JComponent component) {
        panel.remove(components.get(component));
        components.remove(component);
//        if (component.getBorder() instanceof CompoundBorder) {
//            Border border = ((CompoundBorder) component.getBorder()).getInsideBorder();
//            component.setBorder(border);
//        }
        pack();
        return component;
    }

    public void poll(int index) {
        panel.remove(index);
    }

    public Border createEmptyBorder(int margin) {
        return new EmptyBorder(margin, margin, margin, margin);
    }

    public void spread(Component component, int width, int height) {
        Dimension dim = component.getPreferredSize();
        dim.setSize(dim.getWidth() + width, dim.getHeight() + height);
        component.setPreferredSize(dim);
    }
}
