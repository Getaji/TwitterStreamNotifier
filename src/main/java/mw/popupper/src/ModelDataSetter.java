package mw.popupper.src;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class ModelDataSetter<M extends PopupModel, P extends PopupProfile> {

    private M model;
    private P profile;

    public ModelDataSetter(M model, P profile) {
        this.model = model;
        this.profile = profile;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public P getProfile() {
        return profile;
    }

    public void setProfile(P profile) {
        this.profile = profile;
    }

    public M setData() {
        return setData(profile);
    }

    public M setData(PopupProfile profile) {
        model.setIcon(profile.getIcon());
        model.setIconLeftTop(profile.getIconLeftTop());
        model.setIconRightTop(profile.getIconRightTop());
        model.setIconLeftBottom(profile.getIconLeftBottom());
        model.setIconRightBottom(profile.getIconRightBottom());

        model.setColorBackground(profile.getColorBackground());
        model.setColorBorder(profile.getColorBorder());
        model.setColorTitle(profile.getColorTitle());
        model.setColorText(profile.getColorText());

        model.setTitle(profile.getTitle());
        model.setText(profile.getText());

        model.setFontTitle(profile.getFontTitle());
        model.setFontText(profile.getFontText());

        return model;
    }
}
