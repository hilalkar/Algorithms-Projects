/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class TamBolunenSayi {

    /**
     * @param args the command line arguments
     */
    
    /*kendi hanelerine tam bölünen 11-99 arasındaki tam sayıları listeleyen program*/
    
    public static void main(String[] args) {
        
        for(int i=11 ; i<=99 ; i++){
            int onlarbasamagi= i/10;
            int birlerbasamagi= i%10;
            
        
       if(i%(onlarbasamagi+birlerbasamagi)==0){
           System.out.println(i);
       }
           
       }
    }
    
}
