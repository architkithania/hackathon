package EmployerSide;
import java.io.*;
import java.util.*;
import com.google.gson.Gson;


public class EmployerDataJSON {
//    public ArrayList<EmployerData> pdj = new ArrayList<EmployerData>();
//    Scanner sc;
//
//    try{
//         sc = new Scanner(new File("employerRequirement.json"));
//        Gson gson = new Gson();
//        if(sc.hasNextLine()) {
//            EmployerDataJSON[] employerDataArray = gson.fromJson(sc.nextLine(), EmployerDataJSON[].class);
//            pdj = new ArrayList<EmployerData>(Arrays.asList(employerDataArray));
//            pdj.add(new EmployerDataJSON());
//            sc.close();
//        }
//        PrintStream printFile = new PrintStream(new File("employerRequirements.json"));
//        printFile.println(gson.toJson(pdj));
//        printFile.close();
//    }
//    catch(FileNotFoundException ex){
//        System.out.println(ex.getMessage());
//    }

}

class EmployerData {
    public String jobTitle;
    public String education;
    public String skills;
    public int experience;
    public int interviewSlots;
    public String[] priority = new String[3];

    EmployerData(String jobTitle, String education, String skills, int experience, int interviewSlots, String[] priority) {
        this.jobTitle = jobTitle;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
        this.interviewSlots = interviewSlots;
        this.priority = priority;
    }
}
