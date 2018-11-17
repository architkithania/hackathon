package ApplicantSide;

import javax.swing.*;
import java.awt.*;

public class ApplicationSignUpController extends JFrame {
    ApplicationSignUpController() {
        super("Sign Up Page");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

        SignUpFields fields = new SignUpFields();

        add(fields, BorderLayout.CENTER);
    }
}
