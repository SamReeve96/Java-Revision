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
    private int[] validGrades = {1,2,3,4,5};
    private double[] gradeCosts = {0.4,0.6,0.75,0.8,0.95};
    
    private int plasticGrade, colourPrint, quantityOfPipes;
    private boolean innerInsulation, outerReinforcement, chemicalResistance;
    private double length, diameter, radius, volume, costPerInchCubed, pipeCost;

    //Basic constructor
    public Pipe(){
    }
    
    //Complex constructor
    public Pipe(int pG, int cP, int qOP, boolean iI, boolean oR, boolean cR, double Length, double Diameter){
        plasticGrade = pG;
        colourPrint = cP;
        quantityOfPipes = qOP;
        innerInsulation = iI;
        outerReinforcement = oR;
        chemicalResistance = cR;
        length = Length;
        diameter = Diameter;
    }

    //GETTERS
    
    public int getPlasticGrade(){
        return plasticGrade;
    }
    
    public int getColourPrint(){
        return colourPrint;
    }
    
    public int getQuantityOfPipes(){
        return quantityOfPipes;
    }
    
    public boolean getInnerInsulation(){
        return innerInsulation;
    }
    
    public boolean getOuterReinforcement(){
        return outerReinforcement;
    }
    
    public boolean getChemicalResistance(){
        return chemicalResistance;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getDiameter(){
        return diameter;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getCostPerInchCubed(){
        return costPerInchCubed;
    }
    
    public double getPipeCost(){
        return pipeCost;
    }
    
    //SETTERS
        
    public void setPlasticGrade(int pg){
        plasticGrade = pg;
    }
    
    public void setColourPrint(int cp){
        colourPrint = cp;
    }
    
    public void setQuantityOfPipes(int QoP){
        quantityOfPipes = QoP;
    }
    
    public void setInnerInsulation(boolean iI){
        innerInsulation = iI;
    }
    
    public void setOuterReinforcement(boolean oR){
        outerReinforcement = oR;
    }
    
    public void setChemicalResistance(boolean cR){
        chemicalResistance = cR;
    }
    
    public void setLength(double Length){
        length = Length;
    }
    
    public void setDiameter(double Diameter){
        diameter = Diameter;
    }
    
    public void setRadius(double Radius){
        radius = Radius;
    }
    
    public void setVolume(double Volume){
        volume = Volume;
    }
    
    public void setCostPerInchCubed(double cPIC){
        costPerInchCubed = cPIC;
    }
    
    public void setPipeCost(double pC){
        pipeCost = pC;
    }
    
    //Misc Methods
    
    public double metresToInches(double metres){
        double inches = 39.3701 * metres;
        return inches;
    }
    
    public double calculateRadius(double diameter){
        double radius = diameter/2;
        return radius;
    }
    
    public double calculateVolume(double length, double radius){
        double thickness = radius - (radius * 0.9);
        volume = (thickness * metresToInches(length));
        return volume;
    }
    
    public void calcBaseCost(){
        //calc radius and volume

        this.radius = calculateRadius(diameter);
        this.volume = calculateVolume(length, radius);
        
        System.out.println("Grade is: " + this.plasticGrade);
        
        //calc base cost
        this.pipeCost = (this.volume * gradeCosts[this.plasticGrade - 1]);
        System.out.println("Base cost: " + pipeCost);
    }
   
    public void calcAdditonalCost(){
        //Calc extras cost if applicable
         if (this.colourPrint == 1){
            pipeCost *= 1.12;
        }
        else if (this.colourPrint == 2){
            pipeCost *= 1.16;
        }
        if (this.innerInsulation == true){
            pipeCost *= 1.13;
        }
        if (this.outerReinforcement == true){
            pipeCost *= 1.17;
        }
        if (this.chemicalResistance == true){
            pipeCost *= 1.14;
        }
        System.out.println("Total Cost:" + pipeCost);
    }
}
