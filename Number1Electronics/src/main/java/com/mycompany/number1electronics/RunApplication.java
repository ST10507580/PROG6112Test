/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class RunApplication {     //Driver
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Select the beverage type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter your choice: ");
                
        int choice = sc.nextInt();
        sc.nextLine();  //So that it can go to the next line

        String result;

        switch (choice) {   //Case Statement so that i can be able to select which one i waant
            case 1:
                result = "PS5";
                break;

            case 2:
                result = "XBOX";
                break;

            case 3:
                result = "SWITCH";
                break;

            default:
                result = "Invalid choice";

        }

      

         System.out.print("Enter the store: "); //Entering the store name
        String store = sc.nextLine();
        System.out.print("Enter the total sales of PS5 consoles for " + store + ": " );
        int totalSales = sc.nextInt();

    
        
        
          ConsoleSales report = new ConsoleSales( result, store, totalSales);
        report.printAccidentReport();
}
   
     
}
