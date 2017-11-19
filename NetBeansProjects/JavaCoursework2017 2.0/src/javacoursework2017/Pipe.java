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
    //private int[] validGrades = {1,2,3,4,5};
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
        //Pipe thickness is 10% of the radius
        double thickness = radius * 0.1;
        // pi r^2 * length
        volume = (Math.PI * (thickness * thickness) * metresToInches(length));
        return volume;
    }
    
    public double calcBaseCost(){
        //calc radius and volume

        this.radius = calculateRadius(diameter);
        this.volume = calculateVolume(length, radius);
        
        System.out.println("Grade is: " + this.plasticGrade);
        
        //calc base cost
        double baseCost = (this.volume * gradeCosts[this.plasticGrade - 1]);
        return baseCost;
    }
   
    public void calcFullCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        double InsulationAdd = 0;
        double ReinforcementAdd = 0;
        
        //Calc extras cost if applicable
        if (chemicalResistance == true){
            chemAdd = baseCost * 0.14;
        }
        if (colourPrint == 1){
            colourAdd = baseCost * 0.12;
        }
        if (colourPrint == 2){
            colourAdd = baseCost * 0.16;
        }
        if (innerInsulation == true){
            InsulationAdd = baseCost * 0.13;
        }
        if (outerReinforcement == true){
             ReinforcementAdd = baseCost * 0.17;
        }
        
        //Add up all additonal costs
        pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd + ReinforcementAdd; 
        pipeCost = Double.parseDouble(String.format ("%.2f", pipeCost));

        setPipeCost(pipeCost);
        System.out.println(pipeCost);
        
    }
    
}
