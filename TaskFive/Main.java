//TaskFour - Textbased menu for a game

/* In this program the user is presented with a list of actions. There will be two classes. One, GameMenu represents the menu and the other, Main, instantiates and uses the menu. */

/* The point of this excersise is
	learning how to separate the code into client class and entity class.
	learning how to work with ArrayLists. */

/* 4.e Create a client class, Main with a main method. 
(You will use this class to test the GameMenu class) after the next step.*/

import java.util.ArrayList;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args){

	/* 4.f In the main method create an ArrayList of type String called actions. 
	Don't forget to import the ArrayList class. Add the following String values to the actions ArrayList: */
	ArrayList<String> actions = new ArrayList<>();

	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");

	/* 4.g Still in the main method, instantiate the GameMenu class with the actions 
	reference as an argument to the constructor.*/
	GameMenu game1 = new GameMenu(actions);

	/* 4.i From the main method in Main, test the displayMenu method by 
	calling it on the GameMenu instance created in step 4.g. */
	game1.displayMenu();

	/* 5.d In the main method of Main, call the getAction method on the Menu instance, 
	saving the return value (the user response) in a variable.*/
	String output = game1.getActions();
	int outputInInt = Integer.parseInt(output);

	/* 5.g In step 5.d you created a variable called userChoicecode> of type String. 
	Convert the value to an int before using it as an argument in a call to the doAction method.*/

	doAction(outputInInt);


	}

	/*5.d Create a new method in the Main class, for printing the message that corresponds to 
	the action the user has chosen. The method should have this signature: public static void 
	doAction(int action). */
	public static void doAction(int action){

	/* 5.f In the body of the doAction method, write a switch-case with a case for each of the 
	4 options added in step 4.f. In each case block you will print a message that corresponds to 
	the user's choice: */

	switch(action){
		case 1:
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saved game data");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break;
	}

	}

	


}