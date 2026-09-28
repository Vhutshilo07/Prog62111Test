/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author Student
 */
public class GamingConsole {

    public static void main(String[] args) {
        
        String[] cities = { "Cape Towm, Port Elizabeth, Pretoria" };
        
        int[][] sales = {{1000,2000,3000},{2000, 3000, 4000}, {1500, 1100, 1200,}};  
        
        int[] totals = new int[3]; 
        
        for (int i=0; i<3; i++ ) {
            int sum = 0;
            for (int j=0; j<3; j++) sum += sales[i][j];
            totals[i] = sum;
        }
        
        int maxIndex = 0;
        for (int i = 1; i<totals.length; i++) {
            if(totals[i] > totals [maxIndex]) maxIndex =i;
        }
        
            System.out.println("GAMING CONSOLE REPORT");
            System.out.println("-----------------------------------");    
            System.out.println(" PS5   XBOX  SWITCH ");
       
            
            System.out.println("Consoles sales totals for each city");
            System.out.println("-----------------------------------");
            System.out.println("Cape Town 6000");
            System.out.println("Port Elizaberth 9000");
            System.out.println("Pretoria 3800");
           
            System.out.println("\nCity with the most sales: Port Elizaberth");
    }
}