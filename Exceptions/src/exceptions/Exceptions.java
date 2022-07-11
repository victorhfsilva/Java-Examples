/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Exceptions {
    
    static double divide(double dividend, double divisor) throws Exception {
        if (divisor == 0) throw new ArithmeticException();
        if (divisor > dividend) throw new Exception();
        return dividend/divisor;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double dividend = null;
        Double divisor = null;
        Double division;
        boolean isDouble = false;
        boolean hasError = true;
                
        Scanner input = new Scanner(System.in);
        while(hasError){
            try {
                System.out.println("Type the dividend.");
                dividend = input.nextDouble();

                System.out.println("Type the divisor.");
                divisor = input.nextDouble();

                isDouble = true;
            }
            catch(InputMismatchException ex){
                System.err.println("The input is not a number.");
                input.nextLine();
            }

            if (isDouble){
                try{
                    division = divide(dividend,divisor);
                    System.out.println("The division is " + division);
                    hasError = true;
                }
                catch(ArithmeticException ex){
                    System.err.println("Division by zero.");
                }
                catch(Exception ex){
                    System.err.println("The division is a proper fraction.");
                }
                finally{
                    division = null;
                }
            }
        }
    }
    
}
