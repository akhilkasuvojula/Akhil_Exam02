/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq3;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Circle {
    int radius;
    double circumference;
    double area;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public void calcarea(int radius)
    {
         area=3.14*radius*radius;
    }
    public  void calcCircumference(int radius)
    {
     circumference=2*3.14*radius;
    }
    public String toString(){//overriding the toString() method  
  return radius+" "+area+" "+circumference;
}
}


