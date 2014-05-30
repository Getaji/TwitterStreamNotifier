package mw.popupper.src;

import mw.util.DefaultWrap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupModel {
    private int width = 350;
    private int height = 50;
    private int x = 0;
    private int y = 0;
    private int widthIcon = 48;
    private int heightIcon = 48;
    private Color colorBorder = Color.BLACK;
    private Color colorTitle = Color.BLACK;
    private Color colorText = Color.BLACK;
    private Color colorBackground = Color.WHITE;
    private Icon icon;
    private Icon iconLeftTop;
    private Icon iconLeftBottom;
    private Icon iconRightTop;
    private Icon iconRightBottom;
    private DefaultWrap<Font> fontTitle = new DefaultWrap<>(ComponentSupporter.FONT_MEIRYO_UI_BOLD_13PT);
    private DefaultWrap<Font> fontText = new DefaultWrap<>(ComponentSupporter.FONT_MEIRYO_UI_12PT);

    private String title;
    private String text;

    private int index;
    private boolean isUsing = true;
    private final Timer timer = new Timer(5000, null);
    private QueueViewer viewer;

    public PopupModel(QueueViewer viewer) {
        this.viewer = viewer;
        timer.setRepeats(false);
    }

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

    public Rectangle getIconRectangle() {
        return new Rectangle(0, 0, getWidthIcon(), getHeightIcon());
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public Color getColorTitle() {
        return colorTitle;
    }

    public Color getColorText() {
        return colorText;
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    //    public Color getForegroundColor() {
//        return foregroundColor;
//    }
//
//    public Color getBackgroundColor() {
//        return backgroundColor;
//    }
//
    public Icon getIcon() {
        return icon;
    }

    public Icon getIconLeftTop() {
        return iconLeftTop;
    }

    public Icon getIconLeftBottom() {
        return iconLeftBottom;
    }

    public Icon getIconRightTop() {
        return iconRightTop;
    }

    public Icon getIconRightBottom() {
        return iconRightBottom;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isUsing() {
        return isUsing;
    }

    public void setUsing(boolean using) {
        isUsing = using;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidthIcon(int widthIcon) {
        this.widthIcon = widthIcon;
    }

    public void setHeightIcon(int heightIcon) {
        this.heightIcon = heightIcon;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public void setColorTitle(Color colorTitle) {
        this.colorTitle = colorTitle;
    }

    public void setColorText(Color colorText) {
        this.colorText = colorText;
    }

    public void setColorBackground(Color colorBackground) {
        this.colorBackground = colorBackground;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setIconLeftTop(Icon iconLeftTop) {
        this.iconLeftTop = iconLeftTop;
    }

    public void setIconLeftBottom(Icon iconLeftBottom) {
        this.iconLeftBottom = iconLeftBottom;
    }

    public void setIconRightTop(Icon iconRightTop) {
        this.iconRightTop = iconRightTop;
    }

    public void setIconRightBottom(Icon iconRightBottom) {
        this.iconRightBottom = iconRightBottom;
    }

    public Font getFontTitle() {
        return fontTitle.get();
    }

    public void setFontTitle(Font fontTitle) {
        this.fontTitle.setValueIfNonNull(fontTitle);
    }

    public Font getFontText() {
        return fontText.get();
    }

    public void setFontText(Font fontText) {
        this.fontText.setValueIfNonNull(fontText);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addTimerListener(ActionListener listener) {
        timer.addActionListener(listener);
    }

    public void onStartTimer() {
        timer.start();
    }

    public void onRestartTimer() {
        timer.restart();
    }

    public void onStopTimer() {
        timer.stop();
    }

    public QueueViewer getViewer() {
        return viewer;
    }
}
