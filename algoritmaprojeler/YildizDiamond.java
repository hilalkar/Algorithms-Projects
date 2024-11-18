/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class YildizDiamond {

    /**
     * @param args the command line arguments
     */ 
    //yıldızlarla diamond yapmak 
    /*        *
             ***
            *****
           *******
            *****
             ***
              *         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" satır sayısı girin:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
