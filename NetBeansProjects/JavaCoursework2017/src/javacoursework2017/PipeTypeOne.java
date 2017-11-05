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
    
    //Constructor using super class constructor
    public PipeTypeOne(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
    
    //Type one can only add chem Resist to a pipe
    public void calcAdditonalCost(double baseCost){
        //Calc extras cost if applicable
        if (this.chemicalResistance == true){
            pipeCost = baseCost * 1.14;
        }
        
        super.setPipeCost(pipeCost);
        System.out.println(this.pipeCost);
    }
}
