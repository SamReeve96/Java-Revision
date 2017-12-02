/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

import java.text.NumberFormat;

/**
 *
 * @author Samuel
 */
public class PipeTypeTwo extends Pipe {

    private int colourPrint = 1;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    //Basic constructor
    public PipeTypeTwo(){
    }
    
    //Constructor using super class constructor (1 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeTwo(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
        
    public int getColourPrint(){
        return colourPrint;
    }
    
    public void setColourPrint(int cp){
        colourPrint = cp;
    }
    
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        
        //Calc extras cost if applicable
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        //Type two can only 1 colour, not 0 or 2
        colourAdd = baseCost * 0.12;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd;
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);

    }
}
