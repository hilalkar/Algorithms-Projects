/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
//tersten yazıldığında yine aynı olan sayılara denir
// 1000 ile 10.000 sayıları arasındaki palindrom sayıları bulan program
public class PalindromSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1000 ; i<10000 ; i++){
            String duz= Integer.toString(i);
            String ters=" ";
            for(int j=duz.length()-1 ; j>=0 ; j--){
                ters +=duz.charAt(j);    //ters düzdeki rakamların ters cevrilmesyle baslıyor 
            }
        
        if(duz.equals(ters)) System.out.println(i+" - ");
    }
    
}}
