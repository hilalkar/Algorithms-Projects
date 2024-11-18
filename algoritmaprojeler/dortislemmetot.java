/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class dortislemmetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float sayi1=12 ;
        float sayi2=4;
        System.out.println(toplam(sayi1,sayi2));
        System.out.println(cikarma(sayi1,sayi2));
        System.out.println(carpma(sayi1,sayi2));
        System.out.println(bolme(sayi1,sayi2));
        
        
    }
    
    
    public static float toplam(float sayi1 , float sayi2){
        return sayi1+sayi2;
    }
    public static float cikarma(float sayi1 , float sayi2){
        return sayi1-sayi2;
    }
    public static float carpma(float sayi1 , float sayi2){
        return sayi1*sayi2;
    }
    public static float bolme(float sayi1 , float sayi2){
        return sayi1/sayi2;
    }
}
