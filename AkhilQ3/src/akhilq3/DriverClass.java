/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Akhil Kasuvojula
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Answer for question 3: Akhil Kasuvojula");

        System.out.println("Please enter LoanID : ");
        int LoanID = input.nextInt();
        System.out.println("Please enter LoanType : ");
        String LoanType = input.next();
        System.out.println("Please enter LoanAmount : ");
        float LoanAmount = input.nextFloat();
        System.out.println("enter radius");
        int radius = input.nextInt();
        ArrayList<Object> a = new ArrayList<Object>();
        Loan l1 = new Loan(LoanID, LoanType, LoanAmount);
        Circle c1 = new Circle(radius);
        c1.calcarea(radius);
        c1.calcCircumference(radius);
        Date date = new Date();

        a.add(l1);
        a.add(c1);
        a.add(date.toString());
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
