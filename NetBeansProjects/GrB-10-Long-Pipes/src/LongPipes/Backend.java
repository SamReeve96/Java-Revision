/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongPipes;

import java.io.FileOutputStream;
import java.text.NumberFormat;
import java.util.*;
        
/**
 * Backend has methods which do not alter what is seen by the user 
 * (i.e. wont alter the label values) and do not apply to pipe objects specifically.
 * @author Samuel UP839743
 * @version 1.0
 * @since 02/12/17
 */
public class Backend {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
    }  
    
    /**
     * Backend constructor, creates and instance of a backend so that its 
     * methods can be accessed from Frontend
     */
    public Backend(){}
    
    /**
     * basket - ArrayList that holds all the pipes in an order
     */
    public static ArrayList<Pipe> basket = new ArrayList<>();
    
    //orderTotal - total of all the pipes in the order
    double orderTotal = 0;
    
    //NumberFormat - Formats strings of currency and adds £ to start of string
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    /* orderNo - Identifies the number of orders completed in the writeToFile() method
    Note: if the program is closed the value is reset to 0, thus file will be overwritten!*/
    int orderNo = 1;

    /**
     * set basket to contents of new basket
     * @param newBasket 
     */
    public void setBasket(ArrayList<Pipe> newBasket){
        basket = newBasket;
    }
    
    /**
     * returns basket and its contents
     * @return basket
     */
    public ArrayList<Pipe> getBasket() {
        return basket;
    }
    
    /**
     * Iterates through the basket to calc the total cost of the order
     * @return totalCost: the sum of all the pipes
     */
    public Double totalCostOfOrder(){
        orderTotal = 0;
        for (Pipe p : basket) {
            orderTotal += p.getPipeCost();
            }
        return orderTotal;
    }
    
    /**
     * Based on the attributes of the pipe the method determines if a pipe can
     * be produced by the company, and if so what type (So it can use the 
     * correct constructor)
     * @param pGrade Plastic grade of potential pipe
     * @param colourPrint Colour print of potential pipe
     * @param quantOfPipe Quantity of of potential pipe(s)
     * @param innerInsul inner insulation of potential pipe
     * @param outerRein outer reinforcement of potential pipe
     * @param chemResist chemical resistance of potential pipe
     * @param Length Length(m) of potential pipe
     * @param Diameter Diameter (in) of potential pipe
     * @return string pipeCreated - allows the Frontend to display the pipe type 
     *                              made
     * @throws Exception if no valid pipe can be made, throw an exception which 
     *          the Frontend will display
     */
    public String PipeTypeDetector(int pGrade, int colourPrint, int quantOfPipe, boolean innerInsul,
            boolean outerRein, boolean chemResist, double Length, double Diameter) throws Exception{
        
        String pipeCreated = "";
        if (pGrade <= 3 && colourPrint == 0 && !innerInsul && !outerRein){
            //Its pipe one!
            PipeTypeOne pipeOrderType1 = new PipeTypeOne(pGrade, quantOfPipe, chemResist, Length, Diameter);
            pipeOrderType1.calcAddCost();
            basket.add(pipeOrderType1);
            pipeCreated = "Type one";
        }
        else if (2 <= pGrade && pGrade <= 4 && colourPrint == 1 && !innerInsul && !outerRein) {
            //its pipe two!
            PipeTypeTwo pipeOrderType2 = new PipeTypeTwo(pGrade, quantOfPipe, chemResist, Length, Diameter);
            pipeOrderType2.calcAddCost();
            basket.add(pipeOrderType2);
            pipeCreated = "Type two";
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && !innerInsul && !outerRein) {
            //its pipe three!
            PipeTypeThree pipeOrderType3 = new PipeTypeThree(pGrade, quantOfPipe, chemResist, Length, Diameter);
            pipeOrderType3.calcAddCost();
            basket.add(pipeOrderType3);
            pipeCreated = "Type three";
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul && !outerRein) {
            //its pipe four!
            PipeTypeFour pipeOrderType4 = new PipeTypeFour(pGrade, quantOfPipe, chemResist, Length, Diameter);
            pipeOrderType4.calcAddCost();
            basket.add(pipeOrderType4);
            pipeCreated = "Type four";
        }
        else if (3 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul && outerRein) {
            //its pipe five!
            PipeTypeFive pipeOrderType5 = new PipeTypeFive(pGrade, quantOfPipe, chemResist, Length, Diameter);
            pipeOrderType5.calcAddCost();
            basket.add(pipeOrderType5);
            pipeCreated = "Type five";
        }
        else{
            //Not valid
             throw new Exception("Pipe details invalid, \n "
                + "This type of pipe cannot be made by the company");
        }
        return pipeCreated;
    }
    
    /**
     * writeToFile will output the contents of the order to a .txt file
     * Note: the orderNo which was initialised at the start of this file will reset 
     * if the program is closed, thus if orders are created with the same name 
     * e.g. newOrder0.txt then the new file will overwrite the old one
     * @throws Exception if the file encounters an error when being created
     */
    public void writeToFile() throws Exception {
        
        FileOutputStream out = new FileOutputStream("newOrder" + orderNo + ".txt");
        String orderBody = "Order Details: Plastic Grade, Colour Print, Inner Insulation, outer reinforcement," 
                            + " Chemical resistance, Length, Diameter, Quantity, Cost \r\n";
        for (Pipe p : basket){
            orderBody += Integer.toString(p.getPlasticGrade()) + ", "
            + Integer.toString(p.getColourPrint()) + ", "
            + Boolean.toString(p.getInnerInsulation()) + ", "
            + Boolean.toString(p.getOuterReinforcement()) + ", "
            + Boolean.toString(p.getChemicalResistance()) + ", "
            + Double.toString(p.getLength()) + ", "
            + Double.toString(p.getDiameter()) + ", "
            + Integer.toString(p.getQuantityOfPipes()) + ", "
            + formatter.format(p.getPipeCost()) + "\r\n";
        }
        orderBody += "Total Cost:" + formatter.format(totalCostOfOrder());
        byte buffer [] = orderBody.getBytes();
        out.write(buffer) ;
        orderNo += 1;
    }
}
