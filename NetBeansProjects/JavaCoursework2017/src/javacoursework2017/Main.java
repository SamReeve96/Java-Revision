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
    ArrayList<Pipe> basket = new ArrayList<>(); 
    
    public static void main(String[] args) {
        
        //test creation of each pipe type
      Pipe pipeOrder0 = new Pipe(3, 0, 10, false, false, true, 10.00, 5.00);
      pipeOrder0.calcBaseCost();
      pipeOrder0.calcAdditonalCost();
      System.out.println("\n");
      
      PipeTypeOne pipeOrder1 = new PipeTypeOne(3, 10, true, 10.00, 5.00);
      pipeOrder1.calcBaseCost();
      pipeOrder1.calcAdditonalCost();
      System.out.println("\n");
      
      PipeTypeTwo pipeOrder2 = new PipeTypeTwo(3, 10, true, 10.00, 5.00);
      pipeOrder2.calcBaseCost();
      pipeOrder2.calcAdditonalCost();
      System.out.println("\n");
      
      PipeTypeThree pipeOrder3 = new PipeTypeThree(3, 10, true, 10.00, 5.00);
      pipeOrder3.calcBaseCost();
      pipeOrder3.calcAdditonalCost();
      System.out.println("\n");
      
      PipeTypeFour pipeOrder4 = new PipeTypeFour(3, 10, true, 10.00, 5.00);
      pipeOrder4.calcBaseCost();
      pipeOrder4.calcAdditonalCost();
      System.out.println("\n");
      
      PipeTypeFive pipeOrder5 = new PipeTypeFive(3, 10, true, 10.00, 5.00);
      pipeOrder5.calcBaseCost();
      pipeOrder5.calcAdditonalCost();
      System.out.println("\n");
    }  
    
    public void addToBasket(Pipe newPipe){
    basket.add(newPipe);
    }
}
