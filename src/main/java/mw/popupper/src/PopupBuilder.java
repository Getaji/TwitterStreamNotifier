package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public interface PopupBuilder {

    public default PopupModel getModel() {
        return new PopupModel();
    }

    public default PopupView getView() {
        return new PopupView();
    }

    public default PopupController getController() {
        return new PopupController();
    }

    public default final Popup build() {
        PopupModel model = getModel();
        PopupView view = getView();
        PopupController controller = getController();
        Popup popup = new Popup(model, view, controller);
        return popup;
    }
}
