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
      typeOne pipeOrder1 = new typeOne(1, 0, 10, false, false, false, 10.00, 5.00);
    }
        
    public void addToBasket(Pipe newPipe) {
        basket.add(newPipe);
    }
    
    public void fakeOrder()
    {
        typeOne pipeOrder1 = new typeOne(1, 0, 10, false, false, false, 10.00, 5.00);
        addToBasket(pipeOrder1);
        
    }
}
