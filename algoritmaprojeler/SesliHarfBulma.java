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
public class SesliHarfBulma {

    /**
     * @param args the command line arguments
     */
    // string içerisinde kaç tane sesli harf olduğunu bulan program
    //nextLine() girilen stringin boslugunu da okuyor 
    public static void main(String[] args) {
        
       Scanner input= new Scanner(System.in);
        System.out.println(" isminizi giriniz ");
        String isim=input.nextLine();
        
        int sesli=0;
        for(int i=0 ; i<isim.length(); i++){
            char c= isim.charAt(i);
            if( c== 'a'|| c=='e'||c=='ı'||c=='i'||c=='o'||c=='ö'||c=='u'||c=='ü'){
                sesli++;
            }    
        }
        System.out.println(" sesli harf sayısı =" +sesli );
        System.out.println(" sessiz harf sayısı=" + (isim.length()-sesli));
        
            
                    
        }
       
        
        
    }
    

