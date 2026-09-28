/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles{
     private String consoleDeviceType;
    private String storeName;
    private int totalSales;

    //Constructure Method
    public Consoles(String consoleDeviceType, String storeName, int totalSales) {
        this.consoleDeviceType = consoleDeviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    //Getter method

    public String getConsoleType() {
        return consoleDeviceType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    
    
}
