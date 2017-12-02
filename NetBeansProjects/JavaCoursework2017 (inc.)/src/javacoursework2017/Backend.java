/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

import java.io.FileOutputStream;
import java.util.*;
        
/**
 *
 * @author Samuel
 */
public class Backend {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
    }  
    
        
    public static ArrayList<Pipe> basket = new ArrayList<>();
    double orderTotal = 0;
    
    //Frontend Frntnd = new Frontend();
    
    public void setBasket(ArrayList<Pipe> newBasket){
        basket = newBasket;
    }
    
    public ArrayList<Pipe> getBasket() {
        return basket;
    }
    
    public String totalCostOfOrder(){
        orderTotal = 0;
        for (Pipe p : basket) {
            orderTotal += p.getPipeCost();
            }
        return String.format("%.2f", orderTotal);
    }
    
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
    
    public void writeToFile() throws Exception {
        FileOutputStream out = new FileOutputStream("newOrder.txt");
        //String orderHeader = "";
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
            + Double.toString(p.getPipeCost()) + "\r\n";
        } 
        
        orderBody += "Total Cost:" + String.format("%.2f", orderTotal);
        
        //string orderFile = orderHeader+
        byte buffer [] = orderBody.getBytes();
        out.write(buffer) ;
    }
}
