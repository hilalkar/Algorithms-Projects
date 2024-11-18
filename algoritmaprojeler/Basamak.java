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
public class Basamak {

    /**
     * @param args the command line arguments
     */
    
    /*Bu Java programı, kullanıcıdan iki basamaklı bir sayı girmesini isteyen
    ve bu sayıyı Türkçe yazıya çeviren bir
    dönüştürme işlemi gerçekleştiren bir program*/
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" iki basamaklı bir sayı girin:");
        int sayi=input.nextInt();
        String[]birler={"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz","on"};
        String[]onlar={"on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
        
        if(sayi!=0){
            if(sayi<0){
                System.out.println("eksi");
                sayi=Math.abs(sayi); //mutlak değeri almak için 
            }
            
            int basamak_on=sayi/10;
            int basamak_bir=sayi%10;
            System.out.println(onlar[basamak_on-1]);
            
            System.out.println(birler[basamak_bir]);
            
        }else
            System.out.println(" sıfır ");
        
        
    }

}
