/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.american.eu_plug_adapter;

/**
 *
 * @author main
 */
public class PlugTypeReporter extends USPlugReporter implements USPlugInfo{

    @Override
    public int getVoltageInEU() {
        return USToEU(this.getVoltage());
    }

    @Override
    public void setVoltageInEU(int voltage) {
        this.setVoltage(EUToUS(voltage));
    }

    @Override
    public int getVoltageInUS() {
        return this.getVoltage();
    }

    @Override
    public void setVoltageInUS(int voltage) {
        this.setVoltage(voltage);
    }
    
    private int USToEU(int voltage) {
        return voltage + 100;
    }
    
    private int EUToUS(int voltage) {
        return voltage - 100;
    }
}
