/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class DizideArama {

    /**
     * @param args the command line arguments
     */
   
      public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int [] rastgele_sayilar= new int[20];
        int bulundu=0;

        for (int i=0; i<20; i++) {
            rastgele_sayilar[i]= (int) (Math.random()*101);
        }

        System.out.println(Arrays.toString(rastgele_sayilar));

        System.out.print("Dizi içinde aranacak sayıyı giriniz :");
        int aranacak_sayi=scn.nextInt();

        for(int eleman : rastgele_sayilar) {
            if(aranacak_sayi==eleman) {

                bulundu++;
            }
        }

        if(bulundu!=0) {
            System.out.println("Bulundu:" + bulundu +" kez");
        }else {
            System.out.println("Üzgünüm sayı dizide bulunamadı");
        }


    }}
      

    

