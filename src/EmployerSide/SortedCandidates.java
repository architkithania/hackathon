package EmployerSide;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortedCandidates {

    int [] ids;

    SortedCandidates(int interviewSlots, String [] priorityList, String jobTitle) {
        try {
            Gson gson = new Gson();
            Scanner jobListing = new Scanner(new File("job_listings/" + jobTitle + ".json"));


        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
}
