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

public class UnluUnsuzDesen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] unluler = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        int durum = 0;
        int sayisi = 0;
        int hata = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" küçük harflerle bir kelime giriniz:");
        String kelime = input.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
            sayisi = 0;
            for (char unlu : unluler) {
                if (unlu == kelime.charAt(i)) {
                    sayisi = 1;
                }
            }
            if (sayisi == 0) {
                if (durum == 1) {
                    hata = 1;
                    break;
                } else {
                    durum = 1;
                }
            }else {
                if (durum == 2) {
                    hata = 1;
                    break;
                } else {
                    durum = 2;
                }
            }
        }
        if(hata==1){
            System.out.println(" uygun değildir !!");
            
        }else{
            System.out.println(" uygun ");
        }
   

    }

}
