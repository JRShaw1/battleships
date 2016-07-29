public class Board {

	public int[][] grid;
	
	public Board() {

		int[][] g = new int[3][3];
		this.grid = g;
	}
		public void drawGrid() {
			System.out.println("");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					System.out.print(grid[i][j]);
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
		
		public void ShipPlacement(int a, int b, int c, int d) {
		
		//	Ship Patrol = new Ship();                               // direction, size, x-corad, y-coard
			int X = a;                                             //
			int Y = b;                                            //
			int direction = c;                                   //
			int size = d;                                       // how long after the inital point,
										                       // I.E. a patrol boat is two long so
										                      // it's size is 1 as the initial
										                     // point is already plotted.
			
			
			if (direction == 0 && grid[Y][X] == 0 
					&& grid[Y - size][X] <= 0) {
				grid[Y - size][X] = 1;
				grid[Y][X] = 1;
				drawGrid();
			}

			else if (direction == 1 && grid[Y][X] == 0
					&& grid[Y + size][X] <= 0) {
				grid[Y + size][X] = 1;
				grid[Y][X] = 1;
				drawGrid();
			}

			else if (direction == 2 && grid[Y][X] == 0
					&& grid[Y][X - size] <= 0) {
				grid[Y][X - size] = 1;
				grid[Y][X] = 1;
				drawGrid();
			}

			else if (direction == 3 && grid[Y][X] == 0
					&& grid[Y][X + size] <= 0) {
				grid[Y][X + size] = 1;
				grid[Y][X] = 1;
				drawGrid();
			} else {
				System.out.println("Can't put a ship there");
				drawGrid();
			}
		}
}