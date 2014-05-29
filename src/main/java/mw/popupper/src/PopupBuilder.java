package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupBuilder {

    public static final PopupBuilder INSTANCE = new PopupBuilder();

    public PopupModel getModel(int index, QueueViewer viewer) {
        return new PopupModel(viewer);
    }

    public PopupView getView() {
        return new PopupView();
    }

    public PopupController getController() {
        return new PopupController();
    }

    public Popup build(int index, QueueViewer viewer) {
        PopupModel model = getModel(index, viewer);
        PopupView view = getView();
        PopupController controller = getController();
        Popup popup = new Popup(model, view, controller);
        return popup;
    }
}
