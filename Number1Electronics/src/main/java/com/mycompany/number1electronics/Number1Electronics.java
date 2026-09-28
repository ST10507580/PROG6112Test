/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Number1Electronics {

    public static void main(String[] args) {
       String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
       String[] gamingconsoles = {"PS5", "XBOX", "SWITCH"};
       
       int[][] sales = { {1000, 2000, 3000}, {2000, 3000, 4000}, {1500, 1100, 1200} };
       
       
       System.out.println("--------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------------------");
   
          System.out.println("\t\t\tPS5\t\tXBOX\t\tSWITCH");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t\t" + sales[i][0] + "\t\t" + sales[i][1] + "\t\t" + sales[i][2]);

    }
         // Total — 1D array derived from the 2D array
        int[] citiesTotals = new int[cities.length];
        for (int i = 0; i < cities.length; i++) {
            int sum = 0;
            for (int j = 0; j < gamingconsoles.length; j++) sum += sales[i][j];
            citiesTotals[i] = sum;
        }
        
               System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------");
        int maxIndex = 0;
        for (int i = 0; i < citiesTotals.length; i++) {
            System.out.println(cities[i] + "\t" + citiesTotals[i]);
            if (citiesTotals[i] > citiesTotals[maxIndex]) maxIndex = i;
        }
        
           System.out.println();
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[maxIndex]);
        System.out.println("--------------------------------------------------------------");


}
}
