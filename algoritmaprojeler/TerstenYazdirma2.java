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
public class TerstenYazdirma2 {

    /**
     * @param args the command line arguments
     */
    /*kullanıcıdan alınan bir karakter dizisini tersten yazdıran program*/
    
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println(" lütfen bir sayı giriniz:");
      String text=input.nextLine();
      for(int i=text.length()-1 ; i>=0 ;i--){
          System.out.print(text.charAt(i));
      }
      
        
        
    }
    
}
