package mw.popupper.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupController implements ActionListener {
    private PopupModel model;
    private PopupView view;

    public void setModelAndView(Popup popup) {
        model = popup.getModel();
        view = popup.getView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setVisible(false);
    }
}
