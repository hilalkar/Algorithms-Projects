/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritmaprojeler;

/**
 *
 * @author Hilal
 */
public class SagdaDikUcgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 5; i++) {
            // Boşlukları ekleyerek sağa dayanmış görüntü elde et
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            
            // Yıldızları ekleyerek üçgeni çiz
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Bir satırı bitir ve alt satıra geç
        }
        }
    }
       

