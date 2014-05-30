package mw.popupper.src;

import javax.swing.*;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupManager {
    private final List<Popup> popups = new LinkedList<>();
    private final QueueViewer viewer = new QueueViewer();

    public PopupManager() {
        viewer.setVisible(true);
    }

    public void push(PopupProfile profile) {
        push(profile, PopupBuilder.INSTANCE);
    }

    public void push(PopupProfile profile, PopupBuilder builder) {
        Popup popup = ensure(builder);
        popup.setupProfileData(profile);
        viewer.offer(popup.getView());
        popup.getView().setVisible(true);
    }

    protected synchronized Popup ensure(PopupBuilder builder) {
        Popup popup = getUnusedPopup();
        if (popup == null) {
            popup = builder.build(popups.size(), viewer);
            popups.add(popup);
        }
        return popup;
    }

    protected Popup getUnusedPopup() {
        for (Popup popup : popups) {
            if (!popup.isUsing())
                return popup;
        }
        return null;
    }

    public void setupProfileData(Popup popup, PopupProfile profile) {
        PopupModel model = popup.getModel();



        popup.getView().setupData();
    }

    public Icon loadIconIfNonEmpty(String url) {
        if (url != null && !url.isEmpty()) {
            try {
                return ImageSupporter.loadImageIcon(url);
            } catch (MalformedURLException ignored) {}
        }
        return null;
    }
}
