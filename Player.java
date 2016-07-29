import java.util.Scanner;


	public class Player {
		
		private int X, Y, direction;
		
		public Player(){
			
		}
		
		public Player(int X, int Y, int direction){

		this.X = X;
		this.Y = Y;
		this.direction = direction;

	}

		public int getX() {
			return X;
		}

		public void setX(int x) {
			X = x;
		}

		public int getY() {
			return Y;
		}

		public void setY(int y) {
			Y = y;
		}

		public int getDirection() {
			return direction;
		}

		public void setDirection(int direction) {
			this.direction = direction;
		}
		
	}
