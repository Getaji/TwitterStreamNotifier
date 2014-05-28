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

        view.setModelAndController(this);
        controller.setModelAndView(this);

        setupModel();
        setupView();
        setupController();
    }

    protected void setupModel() {
        model.addTimerListener(controller);
    }

    protected void setupView() {
        view.setupUI();
    }

    protected void setupController() { }

    public PopupModel getModel() {
        return model;
    }

    public PopupView getView() {
        return view;
    }

    public PopupController getController() {
        return controller;
    }

    public boolean isUsing() {
        return model.isUsing();
    }
}
