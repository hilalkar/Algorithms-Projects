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
public class eDegeriHesaplama {

    /**
     * @param args the command line arguments
     */            
    /*             ∞
       e değeri e= ∑ (2k+1)/(2k+1)! "brothers formülü" kullanılarak hesaplanmaktadır
                  k=o
       buna göre klavyeden girilen terim sayısına göre e sayısını hesaplayan program */
    
    public static int faktoriyel(int a){
     if(a<=1) return 1;
     else  return  a*faktoriyel(a-1);
    }
     
    public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    System.out.println(" bir n sayısı giriniz ");
    int n =input.nextInt();
    int t=2;
    
    for(int k=1 ; k<=n ; k++){
        int f=faktoriyel(2*k+1);
        t=t+(2*k+2)/f;
        
        
    }
        System.out.println(t);
    
   
    
    
        
    }
    
}
