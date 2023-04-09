/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.american.eu_plug_adapter;

/**
 *
 * @author main
 */
public class USPlugReporter {
    
    private int voltage;
    
    public USPlugReporter() {
        voltage = 0;
    }
    
    public USPlugReporter(int voltage) {
        this.voltage = voltage;
    }
    
    public int getVoltage() {
        return voltage;
    }
    
    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
    
}
