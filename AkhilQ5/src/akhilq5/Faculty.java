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

    public class Faculty extends Employee{
    private double officeHours;
    private int  numberofsubject;

    public Faculty(double officeHours, int numberofsubject, String office, double salary, int dateHired, String name, String address, String phno, String email) {
        super(office, salary, dateHired, name, address, phno, email);
        this.officeHours = officeHours;
        this.numberofsubject = numberofsubject;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public int getnumberofSubject() {
        return numberofsubject;
    }

    public void setSubject(String subject) {
        this.numberofsubject = numberofsubject;
    }

    @Override
    public String toString() {
        return "Faculty{"+super.getName() + "officeHours=" + officeHours + ", numberofsubject=" + numberofsubject + '}';
    }
    
    
    
}

    
