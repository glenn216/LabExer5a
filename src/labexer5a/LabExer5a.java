/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexer5a;
import java.util.Scanner;
/**
 *
 * @author glenn
 */
public class LabExer5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int attempt = 0;
        int answer = (int) (max + (Math.random() * (min - max)));
        boolean isCorrect = false;
        System.out.println("Guess a number from 1-50!");
        while(isCorrect == false){
            int input;    
            String input_tmp;
            
            try{
                input_tmp = scanner.nextLine();
                input = Integer.parseInt(input_tmp);
                attempt++;
                if(input < min || input > max){
                    throw new OutOfRangeException();    
                } 
                if (input == answer){
                    if (attempt > 1){
                     System.out.println("You got it in " + attempt + " attempts!");
                    }
                    else {
                     System.out.println("You got it in " + attempt + " attempt!");
                    }
                    isCorrect = true;
                } 
                else if (input > answer){
                    System.out.println("Too high. Try again.");
                } 
                else if (input < answer){
                    System.out.println("Too low. Try again");
                }
            }   
            catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                System.out.println("Guess a number from 1-50!");
            }
            catch (OutOfRangeException ex) {
                System.out.println("Out of range.");
                System.out.println("Guess a number from 1-50!");
            }     
        }
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException ()  
    {  
        super("The input is out of range.");  
    }  
}


            
   