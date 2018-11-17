package ApplicantSide;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUpFields extends JPanel {
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JButton submitButton;

    SignUpFields() {
        setPreferredSize(new Dimension(300, 250));
        Border innerBorder = BorderFactory.createTitledBorder("Log In");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border border = BorderFactory.createCompoundBorder(innerBorder, outerBorder);
        setBorder(border);
        setLayout(new GridBagLayout());

        ArrayList<PersonalDataJSON> pbj = new ArrayList<>();

        nameField = new JTextField(10);
        emailField = new JTextField(10);
        phoneField = new JTextField(10);

        submitButton = new JButton("Log In");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().equals("") || emailField.getText().equals("") || phoneField.getText().equals(""))
                     JOptionPane.showMessageDialog(null, "Please Input all correct Fields");
                else {
                    pbj.add(new PersonalDataJSON(nameField.getText(), emailField.getText(), phoneField.getText()));
                }
            }
        });

        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 1.0;
        gc.weighty = 1.0;


        ////////// Visuals ////////

        Insets labelInset = new Insets(0,0,0,5);
        Insets blankInset = new Insets(0,0,0,0);

        // Row 1
        nameLabel = new JLabel("Name:");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInset;
        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInset;
        add(nameField, gc);

        // Row 2
        emailLabel = new JLabel("E-Mail:");
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInset;
        add(emailLabel, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInset;
        add(emailField, gc);

        // Row 3
        phoneLabel = new JLabel("Phone:");
        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInset;
        add(phoneLabel, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInset;
        add(phoneField, gc);

        // Row 4
        gc.weightx = 1.0;
        gc.weighty = 10.0;
        gc.gridx = 0;
        gc.gridy = 4;
        gc.gridwidth = 2;
        gc.anchor = GridBagConstraints.PAGE_START;
        add(submitButton, gc);
    }
}

class PersonalDataJSON {
    public String name;
    public String email;
    public String phoneNumber;

    PersonalDataJSON(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
