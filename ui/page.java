package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page {
    private JPanel Panels;
    private JLabel userlable;
    private JLabel passlabel;
    private JTextField user;
    private JPasswordField password;
    private JButton Login;
    private JFrame frame;
    private MovieStore store;

    public page(MovieStore store) {
        this.store = store;
        frame = new JFrame();
        Panels = new JPanel();

        userlable = new JLabel("Username:");
        passlabel = new JLabel("Password:");
        user = new JTextField(15);
        password = new JPasswordField(15);
        Login = new JButton("Login");

        Panels.add(userlable);
        Panels.add(user);
        Panels.add(passlabel);
        Panels.add(password);
        Panels.add(Login);

        frame.setContentPane(Panels);
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getText().isEmpty() || password.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Input Username and Password");
                } else {
                    JOptionPane.showMessageDialog(null, "Login Success!");
                    frame.dispose();
                    new main_page(store);
                }
            }
        });
    }
}