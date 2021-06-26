package view.swingGUI.textFields;

import javax.swing.*;

public class TextFieldContext extends JTextField{
    private JTextField userName;
    private JPasswordField passWord;
    private JTextField fullName;

    private TextFieldContext(){}

    public static TextFieldContext getContext(){
        return new TextFieldContext();
    }

    public JTextField getUserName() {
        return userName;
    }

    public void setUserName(JTextField userName) {
        this.userName = userName;
    }

    public JPasswordField getPassWord() {
        return passWord;
    }

    public void setPassWord(JPasswordField passWord) {
        this.passWord = passWord;
    }

    public JTextField getFullName() {
        return fullName;
    }

    public void setFullName(JTextField fullName) {
        this.fullName = fullName;
    }
}
