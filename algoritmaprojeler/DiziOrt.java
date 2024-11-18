/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class DiziOrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numbers={12,24,6,-8,30,15};
        int sum=0;
        for(int i=0 ;i<numbers.length; i++){
            sum=sum+numbers[i];
            
        }
        double ort=sum/numbers.length;
        System.out.println(" dizinin ortalaması:" +ort);
        
    }
    
}
