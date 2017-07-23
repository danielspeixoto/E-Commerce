package view;

import contract.Login;

import javax.swing.*;
import java.awt.*;

/**
 * Created by daniel on 22/07/17.
 */
public class LoginView implements Login.View {

    public LoginView() {
        JFrame frame = new JFrame("Bem-Vindo!");
        JPanel panel = new JPanel();

        JTextField emailField = new JTextField(20);
        emailField.setMaximumSize(new Dimension(500, 75));
        emailField.setMargin(new Insets(5,5,5,5));
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField passwordField = new JTextField("Senha");
        JButton createAccountButton = new JButton("Criar conta");

        panel.add(passwordField);
        panel.add(emailField);
        panel.add(createAccountButton);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
