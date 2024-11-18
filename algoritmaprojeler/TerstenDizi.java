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

public class TerstenDizi {

    /**
     * @param args the command line arguments
     */
    /*klavyeden girilen n elemanlı a dizisinin elamanlarını ters sırada b dizisine 
    yazdıran program*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" dizilerin boyutunu girin ");
        int n = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("dizinin elamanlarını girin ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        
        //diziyi ters sırada başka diziye kopyalama 
        for(int i=0; i<n ; i++){
            b[i]=a[n-i-1];
            
        }
        System.out.println(" ters sıradaki dizi:");
        for(int i=0 ; i<n ; i++){
            System.out.println(b[i] + " ");
        }
        
        

       

    }

}
