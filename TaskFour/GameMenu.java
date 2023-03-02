// 4.a - Create an entity class, GameMenu.
import java.util.ArrayList;

class GameMenu{

	// 4.b - Add a private instance variable, actions of type ArrayList<String> to the class.
	private ArrayList<String> actions = new ArrayList<>();

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
}
