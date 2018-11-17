package EmployerSide;

public class Jobs
{
    private String help;
    private Boolean success;
    Results result;
}
class Results {
    private Boolean include_total;
    private String resource_id;
    Fields[] fields;
    private String records_format;
    Records[] records;
    Links _links;
    private int total;
}
class Fields
{
    private String type;
    private String id;
}
class Records
{
    private int _id;
    private String jobtitle;
    private String education;
    private String experience;
    private String mediansalary;
    private String skills;
}
class Links
{
    private String start;
    private String next;
}


