public class Board {

	public int[][] Board() {

		int[][] grid = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				grid[i][j] = 0;
				//System.out.print(grid[i][j]);
			}
			//System.out.print("\n");
		}

		return grid;
	}

	public Board() {
	}
}
