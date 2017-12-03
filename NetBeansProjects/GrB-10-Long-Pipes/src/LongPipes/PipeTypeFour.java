/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongPipes;

import java.text.NumberFormat;

/**
 *
 * @author Samuel
 */
public class PipeTypeFour extends PipeTypeThree {

    private boolean innerInsulation = true;
    private int colourPrint = 2;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
    //Basic constructor
    public PipeTypeFour(){
    }
    
    //Constructor for pipe
    public PipeTypeFour(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
    public int getColourPrint(){
        return colourPrint;
    }
    
    public boolean getInnerInsulation(){
        return innerInsulation;
    }
    
    public void setColourPrint(int cp){
        colourPrint = cp;
    }
    
    public void setInnerInsulation(boolean iI){
        innerInsulation = iI;
    }
    
    public void calcAddCost(){
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
        double pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd;
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
