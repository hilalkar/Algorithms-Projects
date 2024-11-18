/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class RandomDizi {

    /**
     * @param args the command line arguments
     */
    
    /*program, 1 ile 100 arasında rastgele 20 sayı içeren bir dizi oluşturur,
    diziyi ekrana yazdırır ve ardından kullanıcıdan bir sayı ister.
    Kullanıcının girdiği sayıyı doğrusal arama ile
    dizide arar ve sonucu ekrana yazdırır.*/
    
    public static void main(String[] args) {
        
        int[] dizi=new int[20];
        Random random =new Random();
        
        for(int i=0 ; i<dizi.length ; i++){
            dizi[i]=random.nextInt(100)+1;   //(100)olduğunda 0-99 arasında dolduruyor o yüzden bir ekliyoruz
        }
        System.out.println(" dizinin elemanları: ");
        for(int sayi : dizi ){
            System.out.print(sayi+ " ");
        }
        System.out.println();
        
        
        Scanner input =new Scanner(System.in);
        System.out.print(" aranan sayıyı giriniz:");
        int aranansayi =input.nextInt();
        
        //doğrusal arama 
        
        int bulunanindex= -1;
        for(int i=0 ; i<dizi.length ; i++ ){
            if(dizi[i]==aranansayi){
                bulunanindex=i;
                break;
            }
        }
        
        if(bulunanindex!=-1){
            System.out.println(" aranan sayının konumu(indexi) "+ bulunanindex);
            
        }else{
            System.out.println(" aranan sayı dizi içinde yok");
        }
        
        
        
        
        
    }
    
}
