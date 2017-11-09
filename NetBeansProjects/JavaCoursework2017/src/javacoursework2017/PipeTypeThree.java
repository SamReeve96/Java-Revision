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
    private int[] validGrades = {2,3,4,5};
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
    //Type one can only add chem Resist to a pipe
    public void calcAdditonalCost(double baseCost){
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        
        //Calc extras cost if applicable
        if (this.chemicalResistance == true){
            chemAdd = baseCost * 0.14;
        }
        //Type two can only 1 colour, not 0 or 2
        colourAdd = baseCost * 0.16;
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd + colourAdd;
        
        super.setPipeCost(pipeCost);
        System.out.println(this.pipeCost);
    }
}
