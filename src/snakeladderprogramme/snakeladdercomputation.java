package snakeladderprogramme;

public class snakeladdercomputation {
	
	public static void main(String[] args) {
	int LADDER = 1;
	int SNAKE = 2;
	int NO_PLAY = 0;                                                              
	double Reachedposition = 0,Droppedposition = 0;
	int position = 0;
	{
	//for printing dice number
	double dicenbr = Math.floor(((Math.random() * 10) % 6) +1);
		System.out.println("The dice nbr is " + dicenbr);   
		
	//used randome function to get ladder , snake position
	double option = Math.floor(Math.random() * 10) % 3;
		System.out.println("The option is " + option);
	
	//if condtion for getting ladder and snake
		if ( option == LADDER ) {
			Reachedposition = +(dicenbr + position);
			System.out.println("The player will move postions: " +Reachedposition);
		}
		else if ( option == SNAKE ) {
			Droppedposition = (dicenbr - position);
			System.out.println("The player will drop postions: " +Droppedposition);
			}
		else
			System.out.println("The player stays at same position");
	}
}

}