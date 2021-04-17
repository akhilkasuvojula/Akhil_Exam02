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
public class AkhilQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 4: Akhhil Kasuvojula");
        Course c = new Java("Ajay",1,80,100,1,"summer");
        System.out.println(c);
       
       double tot= c.calGpa(10,20);
        System.out.println("the gpa is"+tot);
        
        
    }
    
}
