/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework2017;

import java.util.*;
        
/**
 *
 * @author Samuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        testAllPipeTypes();
    }  
    
    public static void addToBasket(Pipe newPipe){
        ArrayList<Pipe> basket = new ArrayList<>();
        basket.add(newPipe);
    }
    
    public static void totalCostOfOrder(ArrayList basket){
        
    }
    
    public static void PipeType(int pGrade, int colourPrint, int quantOfPipe, boolean innerInsul, boolean outerRein, boolean chemResist, double Length, double Diameter) {
        
        if (pGrade <= 3 && colourPrint == 0 && innerInsul == false && outerRein == false){
            //Its pipe one!
            PipeTypeOne pipeOrderType1 = new PipeTypeOne(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe one created");
            pipeOrderType1.calcFullCost();
            addToBasket(pipeOrderType1);
        }
        else if (2 <= pGrade && pGrade <= 4 && colourPrint == 1 && innerInsul == false && outerRein == false) {
            //its pipe two!
            PipeTypeTwo pipeOrderType2 = new PipeTypeTwo(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe two created");
            pipeOrderType2.calcFullCost();
            addToBasket(pipeOrderType2);
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == false && outerRein == false) {
            //its pipe three!
            PipeTypeThree pipeOrderType3 = new PipeTypeThree(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe three created");
            pipeOrderType3.calcFullCost();
            addToBasket(pipeOrderType3);
        }
        else if (2 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == true && outerRein == false) {
            //its pipe four!
            PipeTypeFour pipeOrderType4 = new PipeTypeFour(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe four created");
            pipeOrderType4.calcFullCost();
            addToBasket(pipeOrderType4);
        }
        else if (3 <= pGrade && pGrade <= 5 && colourPrint == 2 && innerInsul == true && outerRein == true) {
            //its pipe five!
            PipeTypeFive pipeOrderType5 = new PipeTypeFive(pGrade, quantOfPipe, chemResist, Length, Diameter);
            System.out.println("Pipe five created");
            pipeOrderType5.calcFullCost();
            addToBasket(pipeOrderType5);
        }
        else{
            //Not valid
            System.out.println("Pipe details invalid, please refer to the table for valid pipe attributes");
        }
        
    }
    
    public static void testAllPipeTypes(){  
        //test creation of a pipe
        Pipe pipeOrder0 = new Pipe(3, 0, 10, false, false, true, 10.00, 5.00);
        System.out.println("Pipe created");
        
        //test pipeType (valid)
        PipeType(3, 0, 10, false, false, true, 10.00, 5.00);
        PipeType(3, 1, 10, false, false, true, 10.00, 5.00);
        PipeType(3, 2, 10, false, false, true, 10.00, 5.00);
        PipeType(3, 2, 10, true, false, true, 10.00, 5.00);
        PipeType(3, 2, 10, true, true, true, 10.00, 5.00);
        
        //Invalid pipe
        PipeType(3, 2, 10, false, true, true, 10.00, 5.00);
    }
}
