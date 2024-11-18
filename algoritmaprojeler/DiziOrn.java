/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class DiziOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String[] ulkeler;

        String[] arabalar={"Porche", "Ford", "Volvo","Mercedes","Şahin"};

        arabalar[1]="Tesla"; // indis 1deki değeri teslayla değiştir.
        arabalar[4]="TOGG";

        System.out.println(arabalar[0]);
        System.out.println(arabalar[3]);
        //System.out.println(arabalar[4]);
        System.out.println("-------------------");
        int boyut=arabalar.length;
        for(int i=0; i<boyut; i++) {
            System.out.println(arabalar[i]);
        }
        System.out.println("-------Foreach------------");

        for(String araba: arabalar) {
            System.out.println(araba);
        }

        int[] sayilar = new int[100];

        sayilar[40]=90;
        sayilar[2]=5559;

        for (int i: sayilar) {
            System.out.println(i);
        }






    }
    }
    

