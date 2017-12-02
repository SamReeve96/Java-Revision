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
    //set variables that are unique to type 5 pipes
    //private int[] validGrades = {2,3,4,5};
    private boolean innerInsulation = true;
    private boolean outerReinforcement = true;
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean chemicalResistance;
    private double length, diameter, radius, volume, costPerInchCubed, pipeCost;

    //Basic constructor
    public PipeTypeFive(){
    }
    
    //Constructor using super class constructor (1 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeFive(int pG, int qOP, boolean cR, double Length, double Diameter){
        //(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter)
        super(pG, 2, qOP, true, true, cR, Length, Diameter);
    }

    public void calcFullCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        double InsulationAdd = 0;
        double ReinforcementAdd = 0;
        
        //Calc extras cost if applicable
        if (this.chemicalResistance == true){
            chemAdd = baseCost * 0.14;
        }
        //Type five can only 1 colour, not 0 or 2
        colourAdd = baseCost * 0.16;
        
        //Type five has innerIsulation
        InsulationAdd = baseCost * 0.13;
        
        //Type five has outerReinforcement
        ReinforcementAdd = baseCost * 0.17;
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd + ReinforcementAdd;
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));

        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
