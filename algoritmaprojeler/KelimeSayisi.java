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
public class KelimeSayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" cümle giriniz ");
        String yazi=input.nextLine();
        
        System.out.println("karakter sayısı:" + yazi.length());
        int sayac=0;
        for(int i=0 ; i<yazi.length(); i++){
            if(yazi.charAt(i)== ' ' ) sayac++;
            
        }
        System.out.println(" kelime sayısı " +  (sayac+1));
        
        
        
    }
    
}
