package snakeladderprogramme;

public class snakeladdercomputation {
	
	public static void main(String[] args) {
		final int NOPLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int count = 0;
		
		int Position =0;
		//printing intial position of player
		System.out.println("The player Position is "+Position);
		
		//while loop for printing exact winning position of player
		while(Position != 100) {
			
			//rolling dice number to play player
			int dicenbr =(int) Math.floor(((Math.random() * 10) % 6) +1);
			System.out.println("The dice nbr is " + dicenbr);
			count++;
			System.out.println("dice rolled "+count+" times");
			
			//printing choice to get into positions
			int choice = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("The choice is " + choice);
						
		switch(choice)
		{
		case NOPLAY:
			System.out.println("player stays at same position = "+Position);
			
			break;
		case LADDER:
			Position = Position + dicenbr ;
			System.out.println("Player moves Ahead by Position is = "+Position);
			
			//if condition for to get exact position
						if(Position>=100) {
							if(Position > 100) {
					Position = Position - dicenbr;
				}
				else 
				{
					System.out.println("winning psition = " +Position);		
				}
				}
			
			break;
			
		case SNAKE:
			Position = Position - dicenbr;
			if(Position < 0) {
			Position=0;
			System.out.println("The player get zero position ,please restart the game");
			}
			System.out.println("Player dropped by Position is = "+Position);
			break;
		
		}
		}
		
		
	}
}
