package EmployerSide;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.sql.SQLOutput;

public class Employer {
    private static JLabel jobTitleLabel;
    private static JTextField jobTitleField;
    private static JLabel educationLabel;
    private static JComboBox educationComboBox;
    private static File file;
    private static Gson gson;

    public static void createListingsJSON(){
        gson = new Gson();
        try {
            ParseAPI parseAPI = new ParseAPI();
            for(int i = 0; i < parseAPI.records.length; i++){
                PrintStream ps = new PrintStream(new File("job_listings/" + parseAPI.records[i].jobtitle + ".json"));
                ps.println(gson.toJson(parseAPI.records[i].jobtitle));
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 250);
        GridBagConstraints gc = new GridBagConstraints();
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);

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
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInsets;
        panel.add(jobTitleField, gc);

        educationLabel = new JLabel("Education:");
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = labelInsets;
        panel.add(educationLabel, gc);

        String[] educationLevels = {"Diploma", "Bachelor's", "Master's", "PhD"};
        educationComboBox = new JComboBox(educationLevels);
        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = blankInsets;
        panel.add(educationComboBox, gc);

        frame.setVisible(true);

        createListingsJSON();
    }
}