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
public class typeTwo extends Pipe {
    //set variables that are unique to type two pipes
    private int[] validGrades = {2,3,4};
    private int validColours = 1 ;
    private boolean innerInsulation = false;
    private boolean outerReinforcment = false;
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean chemicalResistance;
    private double length, diameter, volume, costPerInch;

    //Basic constructor
    public typeTwo()
    {
    }
    
    //Complex constructor
    public typeTwo(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter)
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