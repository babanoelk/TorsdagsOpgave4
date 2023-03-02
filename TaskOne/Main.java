//TaskOne


//1.a - Create a class Main with a main method.
class Main{


	public static void main(String[] args){

	/* 1.g From the main method in the Main class, create an instance of the Team class 
	(instantiate the Team class). */
	Team team1 = new Team("TeamA");

	team1.setRank(100);

	//1.k From the main method, create 5 more Team instances and print them.
	Team team2 = new Team("TeamB");
	Team team3 = new Team("TeamC");
	Team team4 = new Team("TeamD");
	Team team5 = new Team("TeamE");
	Team team6 = new Team("TeamF");

	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);
	System.out.println(team5);
	System.out.println(team6);



	}
}