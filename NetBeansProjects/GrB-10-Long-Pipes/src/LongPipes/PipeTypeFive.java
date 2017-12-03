package LongPipes;

/**
 * PipeTypeFive is a class which has access methods (Getters and Setter) plus
 * A method to calculate the additional costs of a pipe based on its unique attributes
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public class PipeTypeFive extends PipeTypeFour {

    //Class attributes, Unique combination for type 5
    private boolean innerInsulation = true;
    private boolean outerReinforcement = true;
    private int colourPrint = 2;
    
    /**
     * Basic constructor
     */
    public PipeTypeFive(){
    }
    
    /**
     * Complex constructor - calls super constructor method (Currently PipeTypeFour
     * Until it reaches the Pipe Class where its constructed)
     * @param pG Plastic Grade
     * @param qOP Quantity of Pipes
     * @param cR Chemical resistance
     * @param Length Length
     * @param Diameter Diameter
     */
    public PipeTypeFive(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
    /**
     * Override of Pipe class method
     * @return colourPrint
     */
    @Override
    public int getColourPrint(){
        return colourPrint;
    }
    
    /**
     * Override of Pipe class method
     * @return innerInsulation
     */
    @Override
    public boolean getInnerInsulation(){
        return innerInsulation;
    }
    
    /**
     * Override of Pipe class method
     * @return OuterReinforcement
     */
    @Override
    public boolean getOuterReinforcement(){
        return outerReinforcement;
    } 
    
    /**
     * Override of Pipe class method
     * @param cp new colourPrint value
     */
    @Override
    public void setColourPrint(int cp){
        colourPrint = cp;
    }
    
    /**
     * Override of Pipe class method
     * @param iI new InnerInsulation value
     */
    @Override
    public void setInnerInsulation(boolean iI){
        innerInsulation = iI;
    }
    
    /**
     * Override of Pipe class method
     * @param oR new outerReinforcement value
     */
    @Override
    public void setOuterReinforcement(boolean oR){
        innerInsulation = oR;
    } 
    
    /**
     * Override of Abstract Pipe class method
     * calculates the additional cost for the pipe and sets that price
     * based on the Chemical Resistance, Colour Print, Inner Insulation and 
     * outer Reinforcement values.
     */
    @Override
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double colourAdd = 0;
        double InsulationAdd = 0;
        double ReinforcementAdd = 0;
        double chemAdd = 0;
        
        //All pipes may or may not have chemical resistance. 0.14 the additional cost of Chemical Resistance
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        
        //Type five can only 2 colour print, not 0 or 1. 0.16 the additional cost of 2 Colour print
        colourAdd = baseCost * 0.16;
        
        //Type five has innerIsulation. 0.13 the additional cost of Inner Insulation
        InsulationAdd = baseCost * 0.13;
        
        //Type five has outerReinforcement. 0.17 the additional cost of Outer Reinforcement
        ReinforcementAdd = baseCost * 0.17;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd + InsulationAdd + ReinforcementAdd;    
        setPipeCost(pipeCost);
    }
}
