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
public class DriverClass {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: Akhil kasuvojula");
        
        Person p = new Person("Smith","LB nagar", "660789123", "smith.j@gmail.com");
        
        Student s = new Student("B", "Smith","Ram Nagar", "660789123", "smith.j@gmail.com");
        
        Employee e = new Employee("IS", 700, 15, "Smith","sagar", "660789123", "smith.j@gmail.com");
        
        Faculty f = new Faculty(3, 4, "IS", 500, 12, "Smith","karmangat", "660789123", "smith.j@gmail.com");
        
        Staff st = new Staff("professor", "IS", 500, 12, "Smith","gaganpur", "12345", "abc@gmail.com");

        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(f);
        System.out.println(st);

    }

}