package snakeladderprogramme;

public class snakeladdercomputation {
	//variables
	static int position = 0;

	public static void main(String[] args) {
	System.out.println("The player postion is " + position);
	double dicenbr = Math.floor(((Math.random() * 10) % 6) +1);
	System.out.println("The dice nbr is " + dicenbr);

	}

}
