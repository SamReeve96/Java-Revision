package LongPipes;

/**
 * PipeTypeTwo is a class which has access methods (Getters and Setter) plus
 * A method to calculate the additional costs of a pipe based on its unique attributes
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public class PipeTypeTwo extends Pipe {

    //Class attributes, Unique combination for type 2
    private int colourPrint = 1;

    /**
     * Basic constructor
     */
    public PipeTypeTwo(){
    }
    
    /**
     * Complex constructor - calls super constructor method (Currently Pipe)
     * @param pG Plastic Grade
     * @param qOP Quantity of Pipes
     * @param cR Chemical resistance
     * @param Length Length
     * @param Diameter Diameter
     */
    public PipeTypeTwo(int pG, int qOP, boolean cR, double Length, double Diameter){
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
     * based on the Chemical Resistance value.
     */
    @Override
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        //Intialise additonal cost variables
        double chemAdd = 0;
        double colourAdd = 0;
        
        //All pipes may or may not have chemical resistance. 0.14 the additional cost of Chemical Resistance
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        
        //Type three can only 1 colour print, not 0 or 2. 0.12 the additional cost of 1 Colour print
        colourAdd = baseCost * 0.12;
        
        //Add up all additonal costs
        double pipeCost = baseCost + chemAdd + colourAdd;
        setPipeCost(pipeCost);
    }
}
