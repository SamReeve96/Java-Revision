/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

/**
 *
 * @author Samuel
 */
public class PipeTypeFive extends Pipe {
    //set variables that are unique to type Five pipes

    private boolean innerInsulation = true;
    private boolean outerReinforcement = true;
    private int colourPrint = 2;

    //Basic constructor
    public PipeTypeFive(){
    }
    
    //Constructor using super class constructor (1 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeFive(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }

    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        double InsulationAdd = 0;
        double ReinforcementAdd = 0;
        
        //Calc extras cost if applicable
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        //Type five can only 1 colour, not 0 or 2
        colourAdd = baseCost * 0.16;
        
        //Type five has innerIsulation
        InsulationAdd = baseCost * 0.13;
        
        //Type five has outerReinforcement
        ReinforcementAdd = baseCost * 0.17;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd + ReinforcementAdd;
        pipeCost *= getQuantityOfPipes();
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
