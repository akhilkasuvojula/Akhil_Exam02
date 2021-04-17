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
public class Staff extends Employee{
    
    private String title;

    public Staff(String title, String office, double salary, int dateHired, String name,String address, String phno, String email) {
        super(office, salary, dateHired, name,address, phno, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{"+super.getName()+ "title=" + title + '}';
    }
    
    
    
}
