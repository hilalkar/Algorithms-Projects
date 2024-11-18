/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */import java.util.Scanner;
public class TerstenIsim {

    /**
     * @param args the command line arguments
     */ 
    //kullanıcının gridiği ismi tersten yazdıran program 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println(" bir isim giriniz: ");
        String isim=input.nextLine();
        
        String tersIsim=" ";
        for (int i=isim.length()-1 ; i>=0 ; i--){
            tersIsim +=isim.charAt(i);
        }
        System.out.println(" tersten yazılan isim " + tersIsim);
    }
    
}
