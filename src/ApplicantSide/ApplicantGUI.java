package ApplicantSide;

import javax.swing.*;
import java.io.FileNotFoundException;

public class ApplicantGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ApplicationSignUpController applicationSignup = new ApplicationSignUpController();
                ApplicationCrucialInfoController applicationCruial = new ApplicationCrucialInfoController();
            }
        });
    }
}
