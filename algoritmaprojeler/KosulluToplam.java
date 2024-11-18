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
public class KosulluToplam {

    /**
     * @param args the command line arguments
     */
    
    /*KLAVYEDEN SIFIR GİRİLENE KADAR ALINAN SAYILARIN TOPLAMI*/
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
      
        int toplam=0;
        int girilen=0;
        do{
            System.out.println("bir sayı giriniz: ");
            girilen=input.nextInt();
            toplam+=girilen;
            
        }while(girilen!=0);
        System.out.println(" girilen sayıların toplamı = " +toplam);
        
        
        
    }
    
}
