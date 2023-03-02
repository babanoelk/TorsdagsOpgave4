import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object  
    Scanner scan = new Scanner(System.in);

    String input;
        
        //use hasNextDouble to check if input is numeric, 
    if(!scan.hasNextDouble()){
        input = scan.nextLine();
        // Read user input

        // if input was not numeric show an error message and call this method recursively
        System.out.println("Error! Thats not a number! Try again");
        makeAGuess();
    }
    else if(scan.hasNextDouble()){
        input = scan.nextLine();
        // if so...
        //   Compare it with the random number
        double d = Double.parseDouble(input);


        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number

        if (d < rnd_number){
            System.out.println("Higher!");
        makeAGuess();
        }
        else if(d > rnd_number){
            System.out.println("Lower!");
        makeAGuess();
        }
        else {
            System.out.println("Correct! The number was: "+d);
        }


       

    }
    }
   

}