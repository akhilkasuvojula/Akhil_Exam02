/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhilq2;

import java.util.Scanner;

/**
 *
 * @author Akhil Kasuvojula
 */
public class AkhilQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 2: Akhil Kasuvojula");
        Scanner s = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = s.nextInt();
            }
        }
        boolean res = equals(m1, m2);
        if (res == true) {
            System.out.print("The two arrays are strictly identical");
        } else {
            System.out.print("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
