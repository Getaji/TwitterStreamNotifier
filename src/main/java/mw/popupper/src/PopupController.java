package mw.popupper.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * javadoc here.
 *
 * @author Getaji
 */
public class PopupController implements ActionListener, MouseListener {
    private PopupModel model;
    private PopupView view;

    public void setModelAndView(Popup popup) {
        model = popup.getModel();
        view = popup.getView();
        view.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        closePopup();
    }

    public void closePopup() {
        model.onStopTimer();
        view.setVisible(false);
        model.getViewer().poll(view);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        closePopup();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //
    }
}
