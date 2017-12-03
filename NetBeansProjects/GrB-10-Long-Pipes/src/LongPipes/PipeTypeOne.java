package LongPipes;

/**
 * PipeTypeOne is a class which has access methods (Getters and Setter) plus
 * A method to calculate the additional costs of a pipe based on its unique attributes
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public class PipeTypeOne extends Pipe {

    //Class attributes, Unique combination for type 1
    private int colourPrint = 0;
    
    /**
     * Basic constructor
     */
    public PipeTypeOne(){
    }
    
    /**
     * Complex constructor - calls super constructor method (Currently Pipe)
     * @param pG Plastic Grade
     * @param qOP Quantity of Pipes
     * @param cR Chemical resistance
     * @param Length Length
     * @param Diameter Diameter
     */
    public PipeTypeOne(int pG, int qOP, boolean cR, double Length, double Diameter){
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
    public void calcAddCost(){
        double baseCost = calcBaseCost();
        double chemAdd = 0;
        
        //All pipes may or may not have chemical resistance. 0.14 the additional cost of Chemical Resistance
        if (getChemicalResistance() == true){
            chemAdd = baseCost * 0.14;
        }
        setPipeCost(baseCost + chemAdd);
    }
}
