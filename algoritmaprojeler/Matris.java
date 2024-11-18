/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Random;
/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class Matris {

    /**
     * @param args the command line arguments
     */
    //kullanıcının girdiği mxn boyutunda bir matris olusturup bu matrisi rastgele sayılarla doldurun
    //bu matrisin transpozesini olusturun (satır ile sutunun yer değiştirmis hali
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(" satır sayısı giriniz");
        int satir=input.nextInt();
        System.out.println(" sutun sayısı giriniz");
        int sütun=input.nextInt();
        int[][] m= new int[satir][sütun];
        
        Random random =new Random();
        for(int i=0; i<satir ;i++){
            for(int j=0 ; j<sütun ; j++){
               m[i][j]=random.nextInt(5);
                System.out.print(m[i][j] +" ");
                
            }
            System.out.println();
        }
        
       
        System.out.println(" matrisin transpozesi:");
        int[][] k=new int[sütun][satir];
        for(int i=0 ; i<sütun ; i++){
            for(int j=0 ; j<satir ; j++){
                k[i][j]=m[i][j];
                
                System.out.print(k[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
