/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class UnluBul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             char[] unluler={'a','e','u','ü','ı','i','o','ö'};
        int sayisi=0;
        Scanner s1=new Scanner(System.in);

        System.out.println("Küçük harflerle bir kelime girin:");
        String kelime=s1.nextLine();

        for (int i=0; i<kelime.length(); i++ ) {

            for (char unlu: unluler) {
                if(unlu==kelime.charAt(i)) {
                    sayisi++;
                }
            }

        }
        System.out.println(sayisi);
    }
    
}
