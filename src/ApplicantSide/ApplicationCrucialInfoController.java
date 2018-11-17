package ApplicantSide;

import javax.swing.*;
import java.awt.*;

public class ApplicationCrucialInfoController extends JFrame {
    public boolean signUpComplete;

    ApplicationCrucialInfoController() {
        super("Job Info Page");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(signUpComplete);
        setLayout(new BorderLayout());


    }
}
