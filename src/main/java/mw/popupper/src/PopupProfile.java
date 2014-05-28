package mw.popupper.src;

import javax.swing.*;
import java.awt.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupProfile {
    private Icon icon;
    private Icon iconLeftTop;
    private Icon iconLeftBottom;
    private Icon iconRightTop;
    private Icon iconRightBottom;

    private Color colorBorder = Color.BLACK;
    private Color colorTitle = Color.BLACK;
    private Color colorText = Color.BLACK;
    private Color colorBackground = Color.WHITE;

    private String title;
    private String text;

    public PopupProfile() {
    }

    public PopupProfile(Icon icon, String title, String text) {
        this.icon = icon;
        this.title = title;
        this.text = text;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Icon getIconLeftTop() {
        return iconLeftTop;
    }

    public void setIconLeftTop(Icon iconLeftTop) {
        this.iconLeftTop = iconLeftTop;
    }

    public Icon getIconLeftBottom() {
        return iconLeftBottom;
    }

    public void setIconLeftBottom(Icon iconLeftBottom) {
        this.iconLeftBottom = iconLeftBottom;
    }

    public Icon getIconRightTop() {
        return iconRightTop;
    }

    public void setIconRightTop(Icon iconRightTop) {
        this.iconRightTop = iconRightTop;
    }

    public Icon getIconRightBottom() {
        return iconRightBottom;
    }

    public void setIconRightBottom(Icon iconRightBottom) {
        this.iconRightBottom = iconRightBottom;
    }
    
    public void setIcons(Icon icon, Icon iconLeftTop, Icon iconLeftBottom, Icon iconRightTop, Icon iconRightBottom) {
        this.icon = icon;
        this.iconLeftTop = iconLeftTop;
        this.iconLeftBottom = iconLeftBottom;
        this.iconRightTop = iconRightTop;
        this.iconRightBottom = iconRightBottom;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public Color getColorTitle() {
        return colorTitle;
    }

    public void setColorTitle(Color colorTitle) {
        this.colorTitle = colorTitle;
    }

    public Color getColorText() {
        return colorText;
    }

    public void setColorText(Color colorText) {
        this.colorText = colorText;
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(Color colorBackground) {
        this.colorBackground = colorBackground;
    }

    public void setColors(Color colorBorder, Color colorTitle, Color colorText, Color colorBackground) {
        this.colorBorder = colorBorder;
        this.colorTitle = colorTitle;
        this.colorText = colorText;
        this.colorBackground = colorBackground;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
