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
public class UsAlma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("kuvveti alınacak sayıyı girin:");
        int sayi=input.nextInt();
        System.out.println(" kuvveti girin:");
        int kuvvet=input.nextInt();
        
        int carpim=1;
        for(int i=1; i<=kuvvet ;i++){
        carpim=carpim*sayi;
    }
        System.out.println(" bulunan sonuc:" + carpim);
        
    
}}
