/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class TersUcgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
         Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 0; i < satirSayisi; i++) {
            // Boşlukları ekle
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 0; k < 2 * (satirSayisi - i) - 1; k++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }

        scanner.close();
    }
    
}
