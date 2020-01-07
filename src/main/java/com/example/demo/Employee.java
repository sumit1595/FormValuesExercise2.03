package com.example.demo;

public class Employee {
    private String First_Name;
    private String Last_Name;
    private int SSN;
    private char DOB;

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public char getDOB() {
        return DOB;
    }

    public void setDOB(char DOB) {
        this.DOB = DOB;
    }
}
