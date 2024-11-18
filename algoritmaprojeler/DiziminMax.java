/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
import java.util.Random;
import java.util.Scanner;
public class DiziminMax {

    /**
     * @param args the command line arguments
     */
    /*kullanıcıdan eleman sayısı alınarak 0-50 arasındaki random sayılarla
    olusturulan dizinin max ve min değerlerini bulduran program*/
    
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print(" dizi boyutunu giriniz:");
        int n =input.nextInt();
        
        int[]dizi=new int[n];
        Random random =new Random();
        
        for(int i=0 ; i<dizi.length ; i++){
            dizi[i]=random.nextInt(50)+1;
        }
     
        System.out.println();
        
       int maxdeger=maxbul(dizi);
       int mindeger=minbul(dizi);
        System.out.println(" dizinin max değeri:" + maxdeger);
        System.out.println("dizinin min değeri:" + mindeger);
  
        
    }
    public static int maxbul(int[]dizi){
        int max= dizi[0];
        
        for(int i=0 ; i<dizi.length ; i++){
            if(dizi[i]>max){
                max=dizi[i];
            }
        }
        return max;
    }
    public static int minbul(int[]dizi){
        int min=dizi[0];
        
        for(int i=0 ; i<dizi.length ; i++){
            if(dizi[i]<min){
                min=dizi[i];
            }
        }
        return min;
    }
    
}
