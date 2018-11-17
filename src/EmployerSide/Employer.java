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
    private static File file;
    private static Gson gson;

    public static void createListingsJSON(){
        gson = new Gson();
        try {
            ParseAPI parseAPI = new ParseAPI();
            for(int i = 0; i < parseAPI.records.length; i++){
                PrintStream ps = new PrintStream(new File("job_listings/" + parseAPI.records[i].jobtitle + ".json"));
            }
            JSONFileFormatter fileFormatter = new JSONFileFormatter();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

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

        createListingsJSON();
    }
}