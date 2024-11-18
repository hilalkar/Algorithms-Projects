/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class BaklavaDeseni {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desenin boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        baklavaDeseniCiz(boyut);
    }
      static void baklavaDeseniCiz(int boyut) {
        // Üst kısım
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
// Alt kısım
        for (int i = boyut - 1; i >= 1; i--) {
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }}}
    


    
    

