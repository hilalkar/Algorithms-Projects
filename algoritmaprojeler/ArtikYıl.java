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
public class ArtikYıl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("Yılı giriniz");
        int yil=okuyucu.nextInt();

        if(((yil%4==0) && !(yil%100==0)) || (yil%400==0)) {
            System.out.println("artık yıldır ");
        }else {
            System.out.println("artık yıl değildir ");
        }

    }
    }
    

