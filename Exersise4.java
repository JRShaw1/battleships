//import java.util.Scanner;

public class Exersise4 {

	public static void main(String[] args) {


		Board board = new Board();

		int[][] grid = board.Board();
		
		Ship PatrolP1 = new Ship();    //direction, size, x-corad, y-coard
		int X = PatrolP1.X(1);
		int Y = PatrolP1.Y(1);
		int direction = PatrolP1.Direction(0);
		int size = PatrolP1.Size(1);             // how long after the inital point, I.E. a patrol boat is two long so it's size is 1 as the initial point is already plotted.
		
	/*	Ship PatrolP2 = new Ship();
		int X = PatrolP2.X(2);
		int Y = PatrolP2.Y(2);
		int direction = PatrolP2.Direction(2);
	*/	

		
		
		
		if(direction == 0){
		grid[Y-size][X] = 1;
		grid[Y][X] =1;
		}

		else if(direction == 1){
		grid[Y+size][X] = 1;
		grid[Y][X] =1;
		}

		else if(direction == 2){
		grid[Y][X-size] = 1;
		grid[Y][X] =1;
		}

		else{
		grid[Y][X+size] = 1;
		grid[Y][X] = 1;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(grid[i][j]);
			}
			System.out.print("\n");
		}
		
/*
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == X && j == Y || i == W && j == V) {
					grid[i][j] = 1;
				} else {
					grid[i][j] = 0;
				}
				System.out.print(grid[i][j]);
			}
			System.out.print("\n");
		}
*/
	}

}

