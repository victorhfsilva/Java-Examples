/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consoleinputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ConsoleInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInt = false;
        while (!isInt){
            try {
                System.out.println("Type a integer number.");
                int intNum = input.nextInt();
                isInt = true;
                System.out.println("You typed the number: " + intNum);
            }
            catch (InputMismatchException exception) {
                System.err.println("You did not type a integer.");
                input.nextLine(); //Discard input for new attempt
                System.out.println("Try again.");
            }
        }
        
    }
    
}
