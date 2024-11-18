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
public class SayiBulmaOyunu {

    /**
     * @param args the command line arguments
     */
    
    /* bilgisayarın ürettiği 1-99 arası bir tam sayının tahmin edilme 
    oyunu yani sayı bulma oyunu programı yazdıran program*/
    
    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int BS,tahmin,denemesayisi = 0;
        BS=(int)(Math.random()*99)+1;
        
        do{
            System.out.println(" tahmininiz: ");
            tahmin=input.nextInt();
            denemesayisi++;
             
            if(tahmin>BS) System.out.println(" daha küçük bir sayı girin:");
            else if(tahmin<BS) System.out.println(" daha büyük bir sayı girin:");
            else System.out.println(" tebrikler! sayıyı "+denemesayisi+ "denemede buldunuz.");
         
        }
        while(tahmin != BS);
        
    }
        
       
    
    
}
