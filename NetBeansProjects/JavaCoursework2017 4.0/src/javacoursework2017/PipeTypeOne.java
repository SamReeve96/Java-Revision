/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

import java.text.DecimalFormat;

/**
 *
 * @author Samuel
 */
public class PipeTypeOne extends Pipe {
    
    private boolean innerInsulation = false;
    private boolean outerReinforcement = false;  
    private int colourPrint = 0;

    //Basic constructor
    public PipeTypeOne(){
    }
    
    //Constructor using super class constructor (0 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeOne(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
    //Type one can only add chem Resist to a pipe
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        
        //Calc extras cost if applicable - Note, best way to access chem add seen as made in 
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd;
        pipeCost *= getQuantityOfPipes();
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
