/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class YildizSorusu {

    /**
     * @param args the command line arguments
     */  
     //yıldız ile piramit yapma 
    /*    *
         ***
        *****   
       *******
      *********     */
    public static void main(String[] args) {
       for(int i=1 ; i<6 ; i++){
           for(int j=i ; j<=4 ; j++){
               System.out.print(" ");
           }for(int k=0 ; k< 2*i-1 ; k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
}
