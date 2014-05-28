package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class Popup {
    private final PopupModel model;
    private final PopupView view;
    private final PopupController controller;

    public Popup(PopupModel model, PopupView view, PopupController controller) {
        this.model = model;
        this.view = view;
        this.controller = controller;

        setupModel();
        setupView();
        setupController();
    }

    protected void setupModel() { }

    protected void setupView() {
        view.setModelAndController(this);
        view.setupUI();
    }

    protected void setupController() {
        controller.setModelAndView(this);
    }

    public void pop() {
        view.setVisible(true);
    }

    public PopupModel getModel() {
        return model;
    }

    public PopupView getView() {
        return view;
    }

    public PopupController getController() {
        return controller;
    }
}
