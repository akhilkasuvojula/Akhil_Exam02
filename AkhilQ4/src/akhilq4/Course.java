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
public class Course {
    private int id;
    private String intake;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getinTake() {
        return intake;
    }

    public void setgetIntake(String intake) {
        this.intake = intake;
    }

    public Course(int id, String intake) {
        this.id = id;
        this.intake = intake;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", intake" + intake + '}';
    }
    
    public double calGpa(int i,int j)
    {
     return 1;
    }
}
