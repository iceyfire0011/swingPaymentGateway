package view.swingGUI.buttons;

import javax.swing.*;

public class ButtonContext extends JButton {
   private JButton btnSubmit, btnCancel, btnLogin;

   private ButtonContext(){}

    public ButtonContext getContext(){
       return new ButtonContext();
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }
}
