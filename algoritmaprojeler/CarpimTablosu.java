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
public class CarpimTablosu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        carpimTablosuYazdir(sayi);
    }

    static void carpimTablosuYazdir(int n) {
        for (int i = 1; i <= 10; i++) {
            int carpim = n * i;
            System.out.println(n + " x " + i + " = " + carpim);
        }
    }
}


