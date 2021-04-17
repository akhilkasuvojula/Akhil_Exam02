/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq6;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for question 6: Akhil Kasuvojula");
        System.out.println("Enter 3 sides");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        System.out.println("enter colour");
        String colour = sc.next();
        System.out.println("whether filled or not");
        boolean b = sc.nextBoolean();

        Triangle t = new Triangle(side1, side2, side3, colour, b);
        double area = t.area();
        double perimter = t.perimeter();

        System.out.println("sides are: " + side1 + "," + side2 + "," + side3 + "\n"
                + "colour is: " + colour + "\n" + "whether filled or not:" + b + "\n" + "area is " + area + "\n" + "perimter is "
                + perimter);

    }
}
