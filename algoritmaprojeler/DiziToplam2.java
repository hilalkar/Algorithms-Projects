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

public class DiziToplam2 {

    /**
     * @param args the command line arguments
     */
    
    /*klavyeden girilen n elemanlı a ve b dizilerini toplayarak c dizisini 
    olusturan ve yazdıran program 
     */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" dizilerin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        //kullanıcıdan a dizisinin elemanlarını al 
        System.out.println("a dizisinin elemanlarını giriniz ");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]:");
            a[i] = input.nextInt();
        }

        //kullanıcıdan b dizisinin elemanlarını al
        System.out.println(" b dizisinin elemanlarını giriniz");
        for (int i = 0; i < n; i++) {
            System.out.println("b[" + i + "]");
            b[i] = input.nextInt();
        }

        //c dizisini oluşturve a+b işlemini yap
        int[] c=new int[n];
        for(int i=0 ; i<n ; i++){
            c[i] = a[i] + b[i];
        }
        
        //c dizisini yazdır
        System.out.println("c dizisi");
        for(int i=0; i<n ; i++){
            System.out.println(c[i]+ " ");
        }}}
        
        

