package LongPipes;
/**
 * Pipe is the abstract class which has access methods (Getters and Setter) plus
 * an abstract method to calculate the additional cost of a pie
 * Note: as the class is abstract a "Pipe" object cannot be made.
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public abstract class Pipe {
    
    //Class attributes
    private int plasticGrade, quantityOfPipes, colourPrint;
    private boolean chemicalResistance, innerInsulation, outerReinforcement;
    private double length, diameter, radius, volume, pipeCost;
    
    //Empty constructor
    public Pipe(){
    }
    
    //Complex constructor
    public Pipe(int pG, int qOP, boolean cR, double Length, double Diameter){
        plasticGrade = pG;
        quantityOfPipes = qOP;
        chemicalResistance = cR;
        length = Length;
        diameter = Diameter;
    }

    //Getter methods
    public int getPlasticGrade(){
        return plasticGrade;
    }
    
    public int getQuantityOfPipes(){
        return quantityOfPipes;
    }
    
    public int getColourPrint(){
        return colourPrint;
    }
    
    public boolean getChemicalResistance(){
        return chemicalResistance;
    }
    
    public boolean getInnerInsulation(){
        return innerInsulation;
    }

    public boolean getOuterReinforcement(){
        return outerReinforcement;
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
    
    public double getPipeCost(){
        return pipeCost;
    }
    
    //Setter methods
    public void setPlasticGrade(int pg){
        plasticGrade = pg;
    }
    
    public void setQuantityOfPipes(int QoP){
        quantityOfPipes = QoP;
    }
    
    public void setColourPrint(int cp){
        colourPrint = cp;
    }

    public void setChemicalResistance(boolean cR){
        chemicalResistance = cR;
    }
    
    public void setInnerInsulation(boolean iI){
        innerInsulation = iI;
    }
        
    public void setOuterReinforcement(boolean oR){
        outerReinforcement = oR;
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
    
    public void setPipeCost(double pC){
        pipeCost = pC;
    }
    
    /**
     * Converts passed argument metres to inches and returns inches
     * (1m ~ 39.37")
     * @param metres length in metres to be converted
     * @return inches
     */
    public double metresToInches(double metres){
        double inches = 39.37 * metres;
        return inches;
    }
    
    /**
     * Calculate radius from given diameter (r = d/2)
     * @param diameter value to be converted
     * @return converted value radius
     */
    public double calculateRadius(double diameter){
        radius = diameter/2;
        return radius;
    }
    
    /**
     * Calculates the volume of the pipe by calculating the area of the pipe 
     * cylinder and the cylinder of the air gap / hole inside the pipe and 
     * subtracting them, then multiplying by length (in inches) to get volume
     * constant 0.9 = the radius of the gap inside the pipe as per long-pipes spec
     * @param length in metres, the length of the pipe
     * @param radius in inches, the radius of the pipe
     * @return volume in inches cubed
     */
    public double calculateVolume(double length, double radius){
        //Pipe thickness is 10% of the radius
        double smallRad = radius * 0.9;
        // area = pi r^2
        double SmallArea = (Math.PI * (smallRad * smallRad));
        double FullArea = (Math.PI * (radius * radius));
        volume = (FullArea - SmallArea) * metresToInches(length);
        return volume;
    }
    
    /**
     * Calculate the cost of the pipe based on its core attributes:
     * (length, volume, plastic grade and quantity)
     * @return  baseCost of pipe
     */
    public double calcBaseCost(){
        radius = calculateRadius(diameter);
        volume = calculateVolume(length, radius); 
        
        double[] gradeCosts = {0.4,0.6,0.75,0.8,0.95};
        //lookup the corresponding grade cost in the grade costs array (-1 for array index)
        double baseCost = (volume * gradeCosts[plasticGrade - 1] * getQuantityOfPipes());
        return baseCost;
    }
    
    /**
     * ABSTRACT METHOD - overridden in subclasses, 
     * calculates the additional cost of a pipe
     */
    public abstract void calcAddCost();
}
