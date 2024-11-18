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
public class DiziArama {

    /**
     * @param args the command line arguments
     */
    //Bu Java programı, kullanıcıdan bir sayı girmesini isteyen ve ardından 
    //bu sayının rastgele oluşturulan bir dizi içinde bulunup bulunmadığını kontrol eden basit bi uygulama
    
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner scn=new Scanner(System.in);
        int[] rastgele_sayilar = new int[20];
        int bulundu=0; // aranan sayı  bulunmadı olarak işaretlendi.
        int konum=0;

        for(int i=0; i<20; i++) {
            rastgele_sayilar[i]=(int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(rastgele_sayilar));
        Arrays.sort(rastgele_sayilar);
        System.out.println(Arrays.toString(rastgele_sayilar));

        System.out.print("Lütfen aranacak sayıyı giriniz(0-100) :");
        int aranan_sayi= scn.nextInt();

        int sayac=0;
        for(int eleman : rastgele_sayilar) {
            if(eleman==aranan_sayi) {
                bulundu=1;
                konum=sayac;

            }
            sayac++;
        }

        if(bulundu==1) {
            System.out.println("Bulundu. Konumu :" + konum );
        }else {
            System.out.println("Bulunamadı");
        }



    }}
    
    

