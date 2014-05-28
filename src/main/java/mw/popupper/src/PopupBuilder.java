package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupBuilder {

    public static final PopupBuilder INSTANCE = new PopupBuilder();

    public PopupModel getModel() {
        return new PopupModel();
    }

    public PopupView getView() {
        return new PopupView();
    }

    public PopupController getController() {
        return new PopupController();
    }

    public Popup build() {
        PopupModel model = getModel();
        PopupView view = getView();
        PopupController controller = getController();
        Popup popup = new Popup(model, view, controller);
        return popup;
    }
}
