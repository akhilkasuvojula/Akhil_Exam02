/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq4;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Java extends Course {
     private String facultyName;
    private int duration;
    private int marks;
    private int totMarks;
    

    public Java(String facultyName, int duration, int marks, int totMarks,  int id, String name) {
        super(id, name);
        this.facultyName = facultyName;
        this.duration = duration;
        this.marks = marks;
        this.totMarks = totMarks;
        
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getTotMarks() {
        return totMarks;
    }

    public void setTotMarks(int totMarks) {
        this.totMarks = totMarks;
    }

  
    
    public double calGpa(int marks,int totMarks)
    {
     return marks+totMarks;
    }
}
