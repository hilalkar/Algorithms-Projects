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
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    /*kendisi hariç tüm tam sayı carpanları toplamı yine 
    kendisine eşit olan sayılara mükemmel sayı denir 
    örneğin 6=1+2+3 bir mükemmel sayıdır .klavyedengirilen bir tam sayının 
    mükemmel bir sayı olup olmadığını kontrol eden program */
    
    
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
        System.out.println(" \n bir sayı girin: ");
        int n =input.nextInt();
        int toplam=0;
        for(int i=1; i<=n/2 ; i++){
            if(n%i==0){
                toplam+=i;
            }
        } 
        if(toplam==n){
            System.out.println(" mükemmel sayıdır");
            
        }else{
            System.out.println(" mükemmel sayı değildir ");
        }
        
    }
    
}
