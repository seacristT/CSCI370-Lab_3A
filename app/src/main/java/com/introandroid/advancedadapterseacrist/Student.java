package com.introandroid.advancedadapterseacrist;

public class Student
{
    private String studentFirstName;
    private String studentSecondName;
    private String studentMajor;

    public Student(String studentFirstName, String studentSecondName, String studentMajor)
    {
        this.studentFirstName = studentFirstName;
        this.studentSecondName = studentSecondName;
        this.studentMajor = studentMajor;
    }

    public String getStudentFirstName()
    {
        return studentFirstName;
    }
    public void setStudentFirstName (String studentFirstName)
    {
        this.studentFirstName = studentFirstName;
    }
    public String getStudentLastName()
    {
        return studentSecondName;
    }
    public void setStudentSecondName (String studentSecondName)
    {
        this.studentSecondName = studentSecondName;
    }
    public String getStudentMajor()
    {
        return studentMajor;
    }
    public void setStudentMajor (String studentMajor)
    {
        this.studentMajor = studentMajor;
    }
}
