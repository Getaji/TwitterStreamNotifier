package mw.popupper.src;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupView extends JPanel {
    private PopupModel model;
    private PopupController controller;

    private final JPanel panelIcon = new JPanel();
    private final JLabel labelIcon = new JLabel();
    private final JPanel panelMiniIcons = new JPanel();
    private final JLabel labelIconLeftTop = new JLabel("┏");
    private final JLabel labelIconLeftBottom = new JLabel("┗");
    private final JLabel labelIconRightTop = new JLabel("┓");
    private final JLabel labelIconRightBottom = new JLabel("┛");
    private final JPanel panelText = new JPanel();
    private final JLabel labelTitle = new JLabel();
    private final JLabel labelText = new JLabel();

    public PopupView() {
    }

    public void setupUI() {
        setBounds(model.getWindowRectangle());
        setFocusable(false);

        setLayout(new BorderLayout());
        setOpaque(true);
        setPreferredSize(toDim(model.getWidth(), model.getHeight()));
        add(panelIcon, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);

        panelText.setBorder(new EmptyBorder(0, 7, 0, 0));
        panelText.setLayout(new BorderLayout());
        panelText.setOpaque(false);
        panelText.add(labelTitle, BorderLayout.NORTH);
        panelText.add(labelText, BorderLayout.CENTER);

        Dimension dimensionIcon = toDim(model.getWidthIcon(), model.getHeightIcon());
        panelIcon.setPreferredSize(dimensionIcon);
        panelIcon.setLayout(null);
        panelIcon.setOpaque(false);
        panelIcon.add(labelIcon);
        panelIcon.add(panelMiniIcons);
        labelIcon.setBounds(0, 0, model.getWidthIcon(), model.getHeightIcon());
        panelMiniIcons.setBounds(0, 0, model.getWidthIcon(), model.getHeightIcon());
        panelMiniIcons.setLayout(new GridLayout(2, 2));
        panelMiniIcons.setOpaque(false);
        panelMiniIcons.add(labelIconLeftTop);
        panelMiniIcons.add(labelIconRightTop);
        panelMiniIcons.add(labelIconLeftBottom);
        panelMiniIcons.add(labelIconRightBottom);
        setAlignment(labelIcon, JLabel.CENTER, JLabel.CENTER);
        setAlignment(labelIconLeftTop, JLabel.LEFT, JLabel.TOP);
        setAlignment(labelIconRightTop, JLabel.RIGHT, JLabel.TOP);
        setAlignment(labelIconLeftBottom, JLabel.LEFT, JLabel.BOTTOM);
        setAlignment(labelIconRightBottom, JLabel.RIGHT, JLabel.BOTTOM);
    }

    public void setupData() {
        labelIcon.setIcon(model.getIcon());
        labelIconLeftTop.setIcon(model.getIconLeftTop());
        labelIconRightTop.setIcon(model.getIconRightTop());
        labelIconLeftBottom.setIcon(model.getIconLeftBottom());
        labelIconRightBottom.setIcon(model.getIconRightBottom());
        labelTitle.setText(model.getTitle());
        labelTitle.setFont(model.getFontTitle());
        labelTitle.setForeground(model.getColorTitle());
        labelText.setText(model.getText());
        labelText.setFont(model.getFontText());
        labelText.setForeground(model.getColorText());
        setBorder(new LineBorder(model.getColorBorder()));
        setBackground(model.getColorBackground());
    }

    public void setModelAndController(Popup popup) {
        model = popup.getModel();
        controller = popup.getController();
    }

    private static Dimension toDim(int width, int height) {
        return new Dimension(width, height);
    }

    private static void setAlignment(JLabel label, int horizontal, int vertical) {
        label.setHorizontalAlignment(horizontal);
        label.setVerticalAlignment(vertical);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        model.setUsing(visible);
        if (visible) {
            model.onStartTimer();
        } else {
            getParent().remove(this);
        }
    }
}
