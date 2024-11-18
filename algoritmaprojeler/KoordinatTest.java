/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
import java.util.Scanner;
public class KoordinatTest {
     
    /*klavyeden sol alt ve sağ üst köşesinin koordinatları girilen dikdörtgene göre 
    verilen nokta koordinatlarının bunun içinde olup olmadığını test eden program 
    */
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        System.out.println(" lütfen dikdörtgenin birinci köşe koordinatlarını giriniz "  );
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        System.out.println(" lütfen dikdörtgenin üçüncü köşe koordinatlarını giriniz " );
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        System.out.println(" belirlenmiş bir nokta koordinatını girin  " );
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        
        while(x3>x1 && y3>y1 && x3<x2 && y3<y2){
            System.out.println(" nokta içindedir ");   
        }
        System.out.println(" nokta içinde değildir ");
        
        
        
        
        
        
        
    }
}
