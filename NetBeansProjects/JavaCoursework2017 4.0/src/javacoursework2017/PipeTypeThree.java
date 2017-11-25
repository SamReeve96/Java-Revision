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
public class PipeTypeThree extends Pipe {
    //set variables that are unique to type one pipes
    //private int[] validGrades = {2,3,4,5};
    private boolean innerInsulation = false;
    private boolean outerReinforcement = false;
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean chemicalResistance;
    private double length, diameter, radius, volume, costPerInchCubed, pipeCost;

    //Basic constructor
    public PipeTypeThree(){
    }
    
    //Constructor using super class constructor (1 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeThree(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, 2, qOP, false, false, cR, Length, Diameter);
    }
    
    //Constructor for pipe type type 4 and 5
    public PipeTypeThree(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter){
        super(pG, cP, qOP, iI, oR, cR, Length, Diameter);
    }
    
    public void calcFullCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        
        //Calc extras cost if applicable
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        //Type three can only 2 colour, not 0 or 1
        colourAdd = baseCost * 0.16;
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd + colourAdd;
        pipeCost *= getQuantityOfPipes();
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
