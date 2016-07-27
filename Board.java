
public class Board {
		
	public int X;
	public int Y;
	
	public Board(int a, int b) {
	
		X = a;
		Y = b;
		
		int[][] grid = new int[3][3];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				
				if(j == Y && i == X){
					grid[i][j] = 1;
				}
				else{
					grid[i][j] = 0;
				}
			}
		}
	}
}


