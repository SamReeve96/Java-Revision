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
public class PipeTypeThree extends Pipe {
    
    private int colourPrint = 2;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
    //Basic constructor
    public PipeTypeThree(){
    }
    
    //Constructor for pipe
    public PipeTypeThree(int pG, int qOP, boolean cR, double Length, double Diameter){
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
        //Type three can only 2 colour, not 0 or 1
        colourAdd = baseCost * 0.16;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd;
        
        setPipeCost(pipeCost);
        System.out.println(pipeCost);
    }
}
