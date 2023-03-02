/* We will continue with the code you produced in task 4. Now we want to make it possible for a user
to select an action in the menu. When he types a number associated with an action, the program will
print a message that corresponds to the chosen action. The point of this exercise is to work with the 
Scanner to create a dialog with the user. */

// 4.a - Create an entity class, GameMenu.
import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{

	// 4.b - Add a private instance variable, actions of type ArrayList<String> to the class.
	private ArrayList<String> actions;

	/* 4.c Add a constructor with a parameter of type ArrayList. 
	This is so that the GameMenu class can be instantiated with a list of actions.(shown in step 4.f) */
	GameMenu(ArrayList<String> actions){

	//4.d In the GameMenu contructor, assign the list received as an argument, to the instance variable actions.
		this.actions = actions;
	}

	// 4.h In the GameMenu class add a method displayMenu that prints out the elements of the actions attribute.
	public void displayMenu(){
	for(String s: this.actions){
		System.out.println(s);
	}
	}

	/* 5.a Create a method in the GameMenu class, getAction that prints the sentence 
	"Type a number to choose an action" and then prints each elements in the options attribute.*/

	public String getActions(){
		displayMenu();
		System.out.println("Type a number to choose an action");

	/* 5.b Next, in the getAction method, create a new Scanner object. 
	Declare a variable String choice and assign it the user's input. 
	(Similar to what you did in step 2.c and 2.d)*/
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();

	/* 5.c Let the getAction method return the user's choice. (If the method has void as return type, 
	change that to the return type of String). Then return the choice variable you declared in step 5.b. */	
		return choice;

	}
}
