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
    private final ModelDataSetter<?, ?> modelDataSetter;

    public Popup(PopupModel model, PopupView view, PopupController controller) {
        this(model, view, controller, new ModelDataSetter<>(model, null));
    }

    public Popup(PopupModel model, PopupView view, PopupController controller, ModelDataSetter setter) {
        this.model = model;
        this.view = view;
        this.controller = controller;

        this.modelDataSetter = setter;

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

    public void setupProfileData(PopupProfile profile) {
        modelDataSetter.setData(profile);
        view.setupData();
    }
}
