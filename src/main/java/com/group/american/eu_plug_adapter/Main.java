/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group.american.eu_plug_adapter;

/**
 *
 * @author George
 */
public class Main {
    public static void main(String[] args) {
        PlugTypeReporter plug = new PlugTypeReporter();
        
        plug.setVoltageInUS(120);
        System.out.println("Voltage in EU: " + plug.getVoltageInEU());
        System.out.println("Voltage in US: " + plug.getVoltageInUS());
    }
}
