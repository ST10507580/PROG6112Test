/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */

public class ConsoleSales extends Consoles{    //Sub Class

    //Constructure Method
    public ConsoleSales(String consoleDeviceType, String storeName, int totalSales) {
        super(consoleDeviceType, storeName, totalSales); //Super class that gets information from Consoles
    }
    public void printAccidentReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("***************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("***************************");
    }

    
}
