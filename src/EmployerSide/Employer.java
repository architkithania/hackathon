package EmployerSide;

import javax.swing.*;
import java.awt.*;

public class Employer {
    private static JLabel jobTitle;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 250);
        Panel panel = new Panel();
        frame.add(panel);

        GridBagConstraints gc = new GridBagConstraints();

        Insets labelInsets = new Insets(0, 0, 0, 5);
        Insets blankInset = new Insets(0,0,0,0);

        gc.weightx = 1.0;
        gc.weighty = 1.0;

        jobTitle = new JLabel("Job Title:");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInsets;
        panel.add(jobTitle, gc);

        frame.setVisible(true);

    }
}
