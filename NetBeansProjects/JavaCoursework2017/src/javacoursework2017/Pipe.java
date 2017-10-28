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
public class Pipe {
    private int[] validGrades;
    private int plasticGrade, validColours, colourPrint, quantityOfPipes;
    private boolean innerInsulation, outerReinforcment, chemicalResistance;
    private double length, diameter, volume, costPerInch;
    private double[] gradeCosts = {0.4,0.6,0.75,0.8,0.95};

    //Basic constructor
    public Pipe()
    {
    }
    
    //Complex constructor
    public Pipe(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter)
    {
        plasticGrade = pG;
        colourPrint = cP;
        quantityOfPipes = qOP;
        innerInsulation = iI;
        outerReinforcment = oR;
        length = Length;
        diameter = Diameter;
    }
    
    //SETTERS
    
    //GETTERS
    
    public double calculateRadius(double diameter)
    {
        double radius = diameter/2;
        return radius;
    }
    
    public double metresToInches(double metres)
    {
        double inches = 39.3701 * metres;
        return inches;
    }
    
    public double calculateVolume(double length, double radius)
    {
        double thickness = radius - (radius * 0.9);
        volume = (thickness * metresToInches(length));
        return volume;
    }
    
    //TODO - CalcCost w/ additonal note: when an order of type pipes is complete add it to an array of pipes called basket
    
}
