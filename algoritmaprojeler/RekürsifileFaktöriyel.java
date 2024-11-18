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
public class RekürsifileFaktöriyel {

    /**
     * @param args the command line arguments
     */
    
    /* faktöriyel işlemini rekürsif fonkdiyon ile gerçekleştiren program */
    
    public static int faktoriyel(int k){
        if(k<=1) return 1;
        else return k*faktoriyel(k-1);
        
        
    }
    public static void main(String[] args) {
      
        Scanner input =new Scanner (System.in);
        System.out.println(" lütfen pozitif bir tam sayı giriniz:");
        int a =input.nextInt();
        System.out.println(" girilen sayının faktöriyeli:" + faktoriyel(a));
        
        
        
    }
    
}
