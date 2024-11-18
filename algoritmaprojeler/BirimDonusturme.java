/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class BirimDonusturme {
 
    /*klavyeden metre cinsinden girilen uzunluğu , seçilen birime dönüştüren program */
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float a,b = 0;
        int sec;
        Scanner input =new Scanner(System.in);
        System.out.println(" uzunluğu giriniz (m) : ");
        a=input.nextFloat();
        System.out.println("\n Dönüştürme  \n 1-mm \n 2-cm \n 3-dm \n 4-km \n");
        System.out.println(" \n Seçiminiz: ");
        sec=input.nextByte();
        switch(sec){
            case 1 : b= 1000*a ;
            case 2 : b= 100*a  ;
            case 3 : b= 10*a   ;
            case 4 : b= a/1000 ;
            default:
                System.out.println(" geçersiz seçim ");
                
            
           }
        System.out.println(" sonuç " + b);
        
        }
        
        
        
    }
    
