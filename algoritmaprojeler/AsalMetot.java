/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */


public class AsalMetot {

    /**
     * @param args the command line arguments
     */
 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üst sınıra kadar olan asal sayıları bulmak için bir üst sınır giriniz: ");
        int ustSinir = scanner.nextInt();

        System.out.println("Üst sınıra kadar olan asal sayılar:");

        for (int i = 2; i <= ustSinir; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean isAsal(int sayi) {
        if (sayi < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}


