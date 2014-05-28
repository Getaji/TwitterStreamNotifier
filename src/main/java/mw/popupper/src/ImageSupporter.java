package mw.popupper.src;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class ImageSupporter {
    public static ImageIcon loadImageIcon(String url) throws MalformedURLException {
        return new ImageIcon(new URL(url));
    }
}
