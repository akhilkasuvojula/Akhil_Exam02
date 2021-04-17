/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq6;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Triangle extends GeometricObject {

    private int side1;
    private int side2;
    private int side3;
    private String color;
    private boolean triangleFilled;

    public Triangle(int side1, int side2, int side3, String color, boolean triangleFilled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;                                                                         
        this.color = color;
        this.triangleFilled = triangleFilled;
    }

    @Override
    public double area() {
        return side1 * side2 * side3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

}
