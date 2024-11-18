/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
import java.util.Scanner;

public class FibonacciSayisi {

    /**
     * @param args the command line arguments
     */
    
    /*klavyeden girilen terim sayısı n için fibonacci serisinin 
ilk n terimini bulup ekrana yazdıran program */
    
    public static void main(String[] args) {
        int n, T1, T2, T3;
        System.out.println(" Fibonacci serisi\n ");
        Scanner input = new Scanner(System.in);
        System.out.println(" terim sayısı: \n ");
        n = input.nextInt();
        T1=1;
        T2=1;
        System.out.println(T1);
        System.out.println(T2);
        for(int i=1 ; i<=n-2 ; i++){
            T3=T1+T2;
         
            T1=T2;
            T2=T3;
             System.out.println( T3);
            
        }
    }

}
