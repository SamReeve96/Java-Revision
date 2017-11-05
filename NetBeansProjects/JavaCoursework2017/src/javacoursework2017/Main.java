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
      Pipe pipeOrder1 = new Pipe(1, 0, 10, false, false, true, 10.00, 5.00);
      pipeOrder1.calcBaseCost();
      pipeOrder1.calcAdditonalCost();
      
      PipeTypeOne pipeOrder2 = new PipeTypeOne(1, 10, true, 10.00, 5.00);
    }  
    
    public void addTOBasket(){}
}
