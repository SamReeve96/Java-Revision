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
public class PipeTypeOne extends Pipe {
    //set variables that are unique to type one pipes
    private int[] validGrades = {1,2,3};
    private boolean innerInsulation = false;
    private boolean outerReinforcement = false;
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean chemicalResistance;
    private double length, diameter, radius, volume, costPerInchCubed, pipeCost;

    //Basic constructor
    public PipeTypeOne(){
    }
    
    /* REDUNDANT CONSTRUCTOR
    //Complex constructor
    public PipeTypeOne(int pG, int qOP, boolean cR, double Length, double Diameter){
        plasticGrade = pG;
        colourPrint = 0;
        quantityOfPipes = qOP;
        innerInsulation = false;
        outerReinforcement = false;
        chemicalResistance = cR;
        length = Length;
        diameter = Diameter;
    }
    */
    
    //Constructor using super class constructor (0 is a fixed value for colour print, and false's for Inner insulation and outer reinforcement)
    public PipeTypeOne(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, 0, qOP, false, false, cR, Length, Diameter);
    }
    //Type one can only add chem Resist to a pipe
    public void calcAdditonalCost(double baseCost){
        //Intialise additonal cost variables
        double chemAdd = 0;
        
        //Calc extras cost if applicable
        if (this.chemicalResistance == true){
            chemAdd = baseCost * 0.14;
        }
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd;
        
        super.setPipeCost(pipeCost);
        System.out.println(this.pipeCost);
    }
}
