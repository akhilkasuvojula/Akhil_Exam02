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
    public class Employee extends Person {
    private String office;
    private double salary;
    private int dateHired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDateHired() {
        return dateHired;
    }

    public void setDateHired(int dateHired) {
        this.dateHired = dateHired;
    }

    public Employee(String office, double salary, int dateHired, String name,String address, String phno, String email) {
        super(name,address, phno, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{ " +super.getName()+ "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
    
    
    
}
