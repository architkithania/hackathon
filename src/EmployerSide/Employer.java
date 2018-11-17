package EmployerSide;

import javax.swing.*;
import java.awt.*;

public class Employer {
    private static JLabel jobTitleLabel;
    private static JTextField jobTitleField;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 250);
        Panel panel = new Panel();
        frame.add(panel);

        GridBagConstraints gc = new GridBagConstraints();

        Insets labelInsets = new Insets(0, 0, 0, 5);
        Insets blankInsets = new Insets(0,0,0,0);

        gc.weightx = 1.0;
        gc.weighty = 1.0;

        jobTitleLabel = new JLabel("Job Title:");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInsets;
        panel.add(jobTitleLabel, gc);

        jobTitleField = new JTextField(10);
        gc.gridx = 1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInsets;
        panel.add(jobTitleField, gc);

        jobTitleLabel = new JLabel("Job Title:");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInsets;
        panel.add(jobTitleLabel, gc);

        jobTitleField = new JTextField(10);
        gc.gridx = 1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInsets;
        panel.add(jobTitleField, gc);

        frame.setVisible(true);

    }
}
