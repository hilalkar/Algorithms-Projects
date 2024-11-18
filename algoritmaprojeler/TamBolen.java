/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class TamBolen {

    /**
     * @param args the command line arguments
     */
    /*Klavyeden girilen pozitif bir a tam sayısının
tam bölenlerini hesaplayıp listeleyen programın java kodunu yazınız.
(Örneğin a 15 girilirse çıktı. 1 2 3 5 15 olur.
Javada mod alma % simgesiyle elde edilir. Örneğin 15%3 // sonuç sıfır olur)*/
    
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println(" lütfen bir sayı giriniz ");
        int a =input.nextInt();
        System.out.println("a sayısının tam bölenleri");
        for(int i=1 ; i<=a ;i++){
           
         if( a%i==0){
             System.out.println(i);
         }
            
        }
    }
    
}
