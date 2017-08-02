/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FizzBuzz;

/**
 *
 * @author Win7-Pro-Sam
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            String Output = "";
            if (Check(i, 3) == true) {
                Output += "Fizz";
                }
            if (Check(i, 5) == true) {
                Output += "Buzz";
                }
            if (Check(i, 3) != true && Check(i, 5) != true){
                Output = Integer.toString(i);
                }
            System.out.println(Output);
        }
    }
    
    public static boolean Check(int number, int div){
        boolean result = false;
        if (number%div == 0) {
            result = true;
            }
        return result;
    }
}
