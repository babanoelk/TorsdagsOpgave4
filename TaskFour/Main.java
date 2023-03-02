//TaskFour - Textbased menu for a game

/* In this program the user is presented with a list of actions. There will be two classes. One, GameMenu represents the menu and the other, Main, instantiates and uses the menu. */

/* The point of this excersise is
	learning how to separate the code into client class and entity class.
	learning how to work with ArrayLists. */

/* 4.e Create a client class, Main with a main method. 
(You will use this class to test the GameMenu class) after the next step.*/

import java.util.ArrayList;

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
	}
}