package mw.popupper.src;

import java.awt.*;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupModel {
    private int width = 350;
    private int height = 50;
    private int x, y;
    private int widthIcon;
    private int heightIcon;
    private Color borderColor;
    private Color foregroundColor;
    private Color backgroundColor;
    private Image icon;
    private Image iconLeftTop;
    private Image iconLeftBottom;
    private Image iconRightTop;
    private Image iconRightBottom;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getWindowRectangle() {
        return new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    public int getWidthIcon() {
        return widthIcon;
    }

    public int getHeightIcon() {
        return heightIcon;
    }
}
