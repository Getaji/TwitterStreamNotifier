package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupController {
    private PopupModel model;
    private PopupView view;

    public void setModelAndView(Popup popup) {
        model = popup.getModel();
        view = popup.getView();
    }
}
