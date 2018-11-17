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

        fields.closeThis(new CloseWindow() {
            @Override
            public void buttonListner(boolean open) {
                setVisible(!open);

            }
        });

        add(fields, BorderLayout.CENTER);
        System.out.println(ApplicantGUI.changeToCrucial);
    }
}