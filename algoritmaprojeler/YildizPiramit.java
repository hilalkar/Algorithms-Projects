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
public class YildizPiramit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Piramidin yuksekligini girin: ");
        int yukseklik = scanner.nextInt();
     
        //bosluk ekleme 
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < yukseklik - i - 1; j++) {
                System.out.print(" ");
            } 
            for (int k = 0; k < 2 * i + 1; k++) {  //yıldız ekleme 
                System.out.print("*");
            }
            System.out.println();
        }
    
}}
