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
public class SayiSiralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input =new Scanner(System.in); 
        System.out.println(" lütfen birinci sayıyı girin ");
        int sayi1=input.nextInt();
        System.out.println(" lütfen ikinci sayıyı giriniz ");
        int sayi2=input.nextInt();
        System.out.println(" lütfen üçüncü sayıyı giriniz ");
        int sayi3=input.nextInt();
        
        if(sayi1<=sayi2 && sayi2<=sayi3){
            System.out.println(sayi1 +" "+sayi2+" "+sayi3);
        }else if(sayi1<=sayi3 && sayi3<=sayi2){
            System.out.println(sayi1 +" "+sayi2+" "+sayi3);
        }else if(sayi2<=sayi1 && sayi1<=sayi3){
            System.out.println(sayi2+" "+sayi1+" "+sayi3);
        }else if(sayi2<=sayi3 && sayi3<=sayi1){
            System.out.println(sayi2+" "+sayi3+" "+sayi1);  
        }else if(sayi3<=sayi1 && sayi1<=sayi2){
            System.out.println(sayi3+" "+sayi1+" "+sayi2);
        }else if(sayi3<=sayi2 && sayi2<=sayi1){
            System.out.println(sayi3+" "+sayi2+" "+sayi1);
        }
        
        
    }
    
}
