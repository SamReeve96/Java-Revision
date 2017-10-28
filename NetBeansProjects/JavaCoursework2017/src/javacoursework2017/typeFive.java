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
public class typeFive extends Pipe {
    //set variables that are unique to type five pipes
    private int[] validGrades = {3,4,5};
    private int validColours = 2 ;
    private boolean innerInsulation = true;
    private boolean outerReinforcment = true;
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean chemicalResistance;
    private double length, diameter, volume, costPerInch;

    //Basic constructor
    public typeFive()
    {
    }
    
    //Complex constructor
    public typeFive(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter)
    {
        plasticGrade = pG;
        colourPrint = cP;
        quantityOfPipes = qOP;
        innerInsulation = iI;
        outerReinforcment = oR;
        length = Length;
        diameter = Diameter;
    }
}
