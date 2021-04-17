/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq9;

/**
 *
 * @author Akhil Kasuvojula
 */
public class Mango implements Fruit {
    
    private String color;

    public Mango(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    public String getFruitType(){
        return "sesional fruit";
    }
}
