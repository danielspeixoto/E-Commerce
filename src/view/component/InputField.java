package view.component;

import javax.swing.*;

/**
 * Created by daniel on 02/08/17.
 */
public class InputField extends TextField {

    public InputField(String text) {
        super(text);
        textField = new JTextField(20);
        textField.setBounds(0, 20, 250, 25);
        add(textField);
    }

}