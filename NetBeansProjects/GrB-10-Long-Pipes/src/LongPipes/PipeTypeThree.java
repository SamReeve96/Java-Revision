package LongPipes;

/**
 * PipeTypeThree is a class which has access methods (Getters and Setter) plus
 * A method to calculate the additional costs of a pipe based on its unique attributes
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public class PipeTypeThree extends Pipe {
    
    //Class attributes, Unique combination for type 3
    private int colourPrint = 2;
    
    /**
     * Basic constructor
     */
    public PipeTypeThree(){
    }
    
    /**
     * Complex constructor - calls super constructor method (Currently Pipe)
     * @param pG Plastic Grade
     * @param qOP Quantity of Pipes
     * @param cR Chemical resistance
     * @param Length Length
     * @param Diameter Diameter
     */
    public PipeTypeThree(int pG, int qOP, boolean cR, double Length, double Diameter){
        super(pG, qOP, cR, Length, Diameter);
    }
    
    /**
     * Override of Pipe class method
     * @return ColourPrint
     */
    @Override
    public int getColourPrint(){
        return colourPrint;
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
     * Override of Abstract Pipe class method
     * calculates the additional cost for the pipe and sets that price
     * based on the Chemical Resistance, Colour Print values.
     */
    @Override
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double colourAdd = 0;
        double chemAdd = 0;
        
        //All pipes may or may not have chemical resistance. 0.14 the additional cost of Chemical Resistance
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }

        //Type three can only 2 colour print, not 0 or 1. 0.16 the additional cost of 2 Colour print
        colourAdd = baseCost * 0.16;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd;
        setPipeCost(pipeCost);
    }
}
