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
public class Loan {

    int LoanID;
    String LoanType;
    Float LoanAmount;

    Loan(int LoanID, String LoanType, Float LoanAmount) {
        this.LoanID = LoanID;
        this.LoanType = LoanType;
        this.LoanAmount = LoanAmount;
    }

    public String toString() {//overriding the toString() method  
        return LoanID + " " + LoanType + " " + LoanAmount;
    }
}
