/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq5;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Student extends Person {
    
    private String grade;
    public static final String classStatus="GRADUATE";

    public Student(String grade, String name,String address, String phno, String email) {
        super(name,address, phno, email);
        this.grade = grade;
       
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

   

    @Override
    public String toString() {
        return "Student {"+super.getName()+ "grade=" + grade + ", classStatus=" + classStatus +"}";
    }
    
    
    
}
