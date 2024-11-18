/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Arrays;

/**
 *
 * @author Hilal
 */
public class Dikdörtgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        dikdortgen_yap(3,5);
        String[][]dizi=dikdortgen_dizi(3,5);
        System.out.println( Arrays.toString(dizi[3])); //iki boyutlu dizinin 4. satırını ifade eder
        
        
        
    }
    static void dikdortgen_yap(int a ,int b ){  //a satır sayısı b sütun sayısı alınarak bir dikdörtgen elde edilmiş
        for(int i=0 ; i<a ;i++){
            for(int j=0 ; j<b ; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    static String[][] dikdortgen_dizi(int a ,int b){
        String[][] dik_dizi=new String[a][b]; // a satır b sütunluk bir string dizisi olusuyor 
        for(int i=0 ; i<a ; i++){
            for(int j=0 ; j<b ; j++){ 
                 dik_dizi[i][j] = "#";
            }
        }
        return dik_dizi;
                }
    
}
