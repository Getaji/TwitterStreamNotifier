package mw.popupper.src;

import javax.swing.*;
import java.awt.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupView extends Window {
    private PopupModel model;
    private PopupController controller;

    private final JPanel panelBack = new JPanel();
    private final JPanel panelIcon = new JPanel();
    private final JLabel labelIcon = new JLabel();
    private final JPanel panelMiniIcons = new JPanel();
    private final JLabel labelIconLeftTop = new JLabel();
    private final JLabel labelIconLeftBottom = new JLabel();
    private final JLabel labelIconRightTop = new JLabel();
    private final JLabel labelIconRightBottom = new JLabel();
    private final JLabel labelTitle = new JLabel();
    private final JLabel labelText = new JLabel();

    public PopupView() {
        super((Window) null);
    }

    public void setupUI() {
        setBounds(model.getWindowRectangle());
        add(panelBack);

        panelBack.setLayout(new BorderLayout());
        panelBack.add(panelIcon, BorderLayout.WEST);
        panelBack.add(labelTitle, BorderLayout.NORTH);
        panelBack.add(labelText, BorderLayout.CENTER);

        panelIcon.setPreferredSize(toDim(model.getWidthIcon(), model.getHeightIcon()));
    }

    public void setModelAndController(Popup popup) {
        model = popup.getModel();
        controller = popup.getController();
    }

    public static Dimension toDim(int width, int height) {
        return new Dimension(width, height);
    }
}
