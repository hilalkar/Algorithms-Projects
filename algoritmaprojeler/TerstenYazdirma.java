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
public class TerstenYazdirma {

    /**
     * @param args the command line arguments
     */
    
    /*klavyeden girilen pozitif bir tam sayının tersten yazılmış
    sayısal değerini elde eden program
    */
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        System.out.println(" lütfen pozitif bir tam sayı girin: ");
        int sayi=input.nextInt();
        int terssayi=0;
        
        while(sayi !=0){
            int kalan=sayi%10;
            terssayi=terssayi*10 + kalan;
            sayi=sayi/10;
            
        }
        System.out.println("sayının ters çevrilmiş hali:" + terssayi);
         
    }
    
}
