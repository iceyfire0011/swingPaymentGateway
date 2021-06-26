package view.swingGUI.buttons;

import view.swingGUI.textFields.TextFieldContext;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationActionListener implements ActionListener {
    private TextFieldContext textFieldContext;

    RegistrationActionListener(TextFieldContext textFieldContext){
        this.textFieldContext=textFieldContext;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
