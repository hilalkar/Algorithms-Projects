1/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
import java.util.Scanner;
import java.util.Arrays;



public class DiziToplam3 {

    /**
     * @param args the command line arguments
     */
    /*Bu Java programı, kullanıcıdan bir sayı (n) alarak iki dizi oluşturan, 
    bu dizilere elemanları kullanıcıdan alan ve ardından
    bu iki diziyi toplayarak üçüncü bir dizi oluşturan bir programdır*/
    
    public static void main(String[] args) {
     
       Scanner input=new Scanner(System.in);
        System.out.println(" bir sayı giriniz: ");
        int n=input.nextInt();
        
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        
        for(int i=0 ; i<n ; i++){
            System.out.println("a["+i+"]=");
            a[i]=input.nextInt(); 
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.println("b["+i+"]=");
            b[i]=input.nextInt();
        }
        
        for(int i=0 ; i<n ; i++){
            c[i]=a[i]+b[i];
        }
        System.out.println( Arrays.toString(c));
        
       
        
       
       
    }
    
}
