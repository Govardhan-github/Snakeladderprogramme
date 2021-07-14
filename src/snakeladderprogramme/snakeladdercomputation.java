package snakeladderprogramme;

public class snakeladdercomputation {
	
	public static void main(String[] args) {
	int LADDER = 1;
	int SNAKE = 2;
	int NO_PLAY = 0;                                                              
	double position = 0;
	int winposition = 100;
	{
		
		//for loop for to print winning position
		for( position = 0; position < winposition; position++ ) {    
		
			//used random function to get ladder , snake position
			double option = Math.floor(Math.random() * 10) % 3;
				System.out.println("The option is " + option);
			//for printing dice number
			double dicenbr = Math.floor(((Math.random() * 10) % 6) +1);
				System.out.println("The dice nbr is " + dicenbr);
			//if condition for getting ladder and snake
				if ( option == LADDER ) {
					position = (dicenbr + position);
						System.out.println("The player will move postions: " +position);
						}
						
				else if ( option == SNAKE ) {
					position = (position - dicenbr);
						System.out.println("The player will drop postions: " +position);
									if( position == 0) {
										System.out.println("Restart the game");
									break;
									}
				}
				else
					System.out.println("The player stays at same position");
			}
	}

	}
	
	

}