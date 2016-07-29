import java.util.Scanner;



public class Exersise4 {

	public static void main(String[] args) {

		
		Scanner user_input = new Scanner(System.in);
		Board b1 = new Board();
		Board b2 = new Board();
		Player P1 = new Player();
		Player P2 = new Player();
		b1.drawGrid();
		b2.drawGrid();
		
		for (int k = 2; k < 6; k++) {

			if (k % 2 <= 0) {                                              // even i = player 1
                                                                          // odd i = player 2	
				
				System.out.println("please enter the X-coardinate of your ship");
				
				int X = user_input.nextInt();
				
				System.out.println("please enter the Y-coardinate of your ship");
				
				int Y = user_input.nextInt();
				
				System.out.println("please enter the direction your ship is traveling. ( the coardinates you entered are the front of the ship, 0 = North, 1 = South, 2 = East and 3 = West");
				
				int direction = user_input.nextInt();
				
				P1 = new Player(X, Y, direction);
				
				b1.ShipPlacement(X, Y, direction, 1);                                      
			}
			else {
				
				System.out.println("please enter the X-coardinate of your ship");
				
				int X = user_input.nextInt();
				
				System.out.println("please enter the Y-coardinate of your ship");
				
				int Y = user_input.nextInt();
				
				System.out.println("please enter the direction your ship is traveling. ( the coardinates you entered are the front of the ship, 0 = North, 1 = South, 2 = East and 3 = West");
				
				int direction = user_input.nextInt();
				
				P2 = new Player(X, Y, direction);
				
				b2.ShipPlacement(X, Y, direction, 1);
			}
	}
		user_input.close();
}
}
