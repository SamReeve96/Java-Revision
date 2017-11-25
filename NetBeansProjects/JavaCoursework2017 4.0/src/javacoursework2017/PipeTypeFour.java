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
public class PipeTypeFour extends PipeTypeThree {
    //set variables that are unique to type one pipes
    //private int[] validGrades = {2,3,4,5};
    //private boolean innerInsulation = true;
    //private boolean outerReinforcement = false;
    
    //private int plasticGrade, colourPrint, quantityOfPipes;
    //private boolean chemicalResistance;
    private double pipeCost;
    //private double length, diameter, radius, volume, costPerInchCubed, ;

    //Basic constructor
    public PipeTypeFour(){
    }
    
    //Constructor using super class constructor (1 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeFour(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, 2, qOP, true, false, cR, Length, Diameter);
    }
    
    //Constructor for pipe type 5
    public PipeTypeFour(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter){
        super(pG, cP, qOP, iI, oR, cR, Length, Diameter);
    }
    
    public void calcFullCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        double InsulationAdd = 0;
        
        //Calc extras cost if applicable
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        //Type two can only 1 colour, not 0 or 2
        colourAdd = baseCost * 0.16;
        
        //Type four has innerIsulation
        InsulationAdd = baseCost * 0.13;
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd;
        pipeCost *= getQuantityOfPipes();
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
