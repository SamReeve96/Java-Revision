/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Win7-Pro-Sam
 */

import java.util.*;

public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number Do you wish to add to your list?");
        int listSize = sc.nextInt();
        for (int i=0; i < listSize; i++) {
            System.out.println("Enter value No. " + (i+1));
            int value = sc.nextInt();
            numberList.add(value);
            System.out.println("Value: " + value + " Added");
        }
        System.out.println("ArrayList contains: " + numberList);
        //System.out.println(FindMinValue(numberList));
        BinarySearch(numberList);
        
    }

    public static ArrayList<Integer> SelectionSort(ArrayList<Integer> unsortedList) {
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        int maxUnsortedSize = unsortedList.size();
        for (int x=0; x < maxUnsortedSize; x++){
            int minValue = unsortedList.get(0);
            int minLocation = 0;
            for (int i=0; (i < unsortedList.size()); i++){
                int compValue = unsortedList.get(i);
                if (compValue < minValue){
                    minValue = compValue;
                    minLocation = i;
                }
            }
            sortedList.add(minValue);
            unsortedList.remove(minLocation);
        }
        System.out.println("Ordered list is: " + sortedList);
        return sortedList;
    }
    
    public static void BinarySearch(ArrayList<Integer> unsortedList) {
    ArrayList<Integer> sortedList = SelectionSort(unsortedList);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer you wish to find");
    int searchValue = sc.nextInt();
    boolean valueFound = false;
    while (valueFound != true) {
        int arraySize = sortedList.size();
        int indexToCheck = (arraySize/2);
        int valueAtIndex = sortedList.get(indexToCheck);
        if (valueAtIndex == searchValue) {
            System.out.println("Value found! Located in the array @ index: " + indexToCheck);
            valueFound = true;
            }
        else if (arraySize == 1) {
            System.out.println("Value is not present in array");
            break;
            }
        else if (valueAtIndex > searchValue) {
            sortedList.subList(indexToCheck, (arraySize)).clear();
            System.out.println("Value not found! index:" + indexToCheck + " and indexes above have been discarded");
            }
        else if (valueAtIndex < searchValue) {
            sortedList.subList(0, indexToCheck).clear();
            System.out.println("Value not found! index:" + indexToCheck + " and indexes below have been discarded");
            }
        }
    }
        
    public static int FindMinValue(ArrayList<Integer> numberList) {
    int minValue = numberList.get(0);
    int minLocation = 0;
    for (int i=0; (i < numberList.size()); i++){
        int compValue = numberList.get(i);
        if (compValue < minValue){
            minValue = compValue;
            minLocation = i;
        }
    }
    System.out.println("Smallest Value is: " + minValue);
    return minValue;
    }
    
}