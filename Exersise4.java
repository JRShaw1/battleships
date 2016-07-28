import java.util.Scanner;

public class Exersise4 {

	public static void main(String[] args) {

		Board board = new Board();

		int[][] grid1 = board.Board();
		int[][] grid2 = board.Board();
		
		for (int k = 0; k < 2; k++) {

			if (k % 2 <= 0) {                                             // even i = player 1
                                                                         // odd i = player 2

				Ship Patrol = new Ship();                           // direction, size, x-corad, y-coard
				int X = Patrol.X(1);                               //
				int Y = Patrol.Y(1);                              //
				int direction = Patrol.Direction(0);             //
				int size = Patrol.Size(1);                      // how long after the inital point,
											                   // I.E. a patrol boat is two long so
											                  // it's size is 1 as the initial
											                 // point is already plotted.

				if (direction == 0 && grid1[Y][X] == 0 
						&& grid1[Y - size][X] <= 0) {
					grid1[Y - size][X] = 1;
					grid1[Y][X] = 1;
				}

				else if (direction == 1 && grid1[Y][X] == 0
						&& grid1[Y + size][X] <= 0) {
					grid1[Y + size][X] = 1;
					grid1[Y][X] = 1;
				}

				else if (direction == 2 && grid1[Y][X] == 0
						&& grid1[Y][X - size] <= 0) {
					grid1[Y][X - size] = 1;
					grid1[Y][X] = 1;
				}

				else if (direction == 3 && grid1[Y][X] == 0
						&& grid1[Y][X + size] <= 0) {
					grid1[Y][X + size] = 1;
					grid1[Y][X] = 1;
				} else {
					System.out.println("Can't put a ship there");
				}

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						System.out.print(grid1[i][j]);
						System.out.print(" ");
					}
					System.out.print("\n");

				}
				System.out.print("\n");
			} else {


				Ship Patrol = new Ship();
				int X = Patrol.X(2);
				int Y = Patrol.Y(2);
				int direction = Patrol.Direction(2);
				int size = Patrol.Size(1);                         // how long after the inital point,
											                      // I.E. a patrol boat is two long so
											                     // it's size is 1 as the initial
											                    // point is already plotted.

				if (direction == 0 && grid2[Y][X] == 0 
						&& grid2[Y - size][X] <= 0) {
					grid2[Y - size][X] = 1;
					grid2[Y][X] = 1;
				}

				else if (direction == 1 && grid2[Y][X] == 0
						&& grid2[Y + size][X] <= 0) {
					grid2[Y + size][X] = 1;
					grid2[Y][X] = 1;
				}

				else if (direction == 2 && grid2[Y][X] == 0
						&& grid2[Y][X - size] <= 0) {
					grid2[Y][X - size] = 1;
					grid2[Y][X] = 1;
				}

				else if (direction == 3 && grid2[Y][X] == 0
						&& grid2[Y][X + size] <= 0) {
					grid2[Y][X + size] = 1;
					grid2[Y][X] = 1;
				} else {
					System.out.println("Can't put a ship there");
				}

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						System.out.print(grid2[i][j]);
						System.out.print(" ");
					}
					System.out.print("\n");
				}
			}

		}

	}

}
