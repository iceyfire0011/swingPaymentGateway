package view.swingGUI;

import iService.IUserService;
import view.swingGUI.textFields.TextFieldContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    JPanel panel, formHeaderPanel, formPanel;
    JLabel formHeader, user_label, password_label, full_name_label, message;
    JButton btnSubmit, btnCancel, btnLogin;
    GridLayout loginFormLayout;
    IUserService iUserService;
    TextFieldContext textFieldContext = TextFieldContext.getContext();

    RegistrationForm() {
        //form header
        formHeader = new JLabel();
        formHeader.setText("Registration Form");
        formHeader.setSize(120, 50);
        formHeaderPanel = new JPanel(new FlowLayout());
        formHeaderPanel.add(formHeader);
        // Username Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        textFieldContext.setUserName(new JTextField());
        textFieldContext.getUserName().setSize(120,40);
        // Password Label
        password_label = new JLabel();
        password_label.setText("Password :");
        textFieldContext.setPassWord(new JPasswordField());
        textFieldContext.getPassWord().setSize(120,40);
        // Full name Label
        full_name_label = new JLabel();
        full_name_label.setText("Full Name :");
        textFieldContext.setFullName(new JTextField());
        textFieldContext.getFullName().setSize(120,40);

        // Submit
        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");
        btnLogin = new JButton("Login");
        loginFormLayout = new GridLayout();
        loginFormLayout.setHgap(20);
        loginFormLayout.setVgap(20);
        loginFormLayout.setRows(5);
        loginFormLayout.setColumns(2);
        formPanel = new JPanel(loginFormLayout);
        panel = new JPanel(new BorderLayout());
//        panel.setLayout(null);
        panel.add(formHeaderPanel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.SOUTH);

        formPanel.add(user_label);
        formPanel.add(textFieldContext.getUserName());
        formPanel.add(password_label);
        formPanel.add(textFieldContext.getPassWord());
        formPanel.add(full_name_label);
        formPanel.add(textFieldContext.getFullName());
        formPanel.add(btnSubmit);
        formPanel.add(btnCancel);
        formPanel.add(btnLogin);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adding the listeners to components..
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrationForm registrationForm = new RegistrationForm();
                System.out.println(textFieldContext.getUserName().getText());
                System.out.println(textFieldContext.getFullName().getText());
                System.out.println(new String(textFieldContext.getPassWord().getPassword()));
//                UserViewModel userViewModel = new UserViewModel();
//                userViewModel.setUsername(userName_text.getText());
//                userViewModel.setPassword(new String(password_text.getPassword()));
//                userViewModel.setFullName(full_name_text.getText());
//                iUserService = new UserService();
//                iUserService.checkLogin(userViewModel);

            }
        });
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LoginForm();
                RegistrationForm.this.dispose();
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrationForm.this.dispose();
            }
        });
        add(panel, BorderLayout.CENTER);
        setTitle("Please Login Here !");
        setSize(450, 300);
        setVisible(true);
    }


}
