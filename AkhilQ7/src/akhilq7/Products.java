/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq7;

/**
 *
 * @author Akhil Kasuvojula
 */
public enum Products {
    LAPTOP(200), FRIDGE(300.5),OVEN(100);
    private double cost;

    private Products(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    
    
    
}
