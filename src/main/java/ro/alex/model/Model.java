package ro.alex.model;

public class Model {
	
	private int[][] board;
	public Model(){
		setBoard(new int[3][3]);
		
	}
	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public void printBoard(){
		for(int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(board[i][j]);
			}
		}
	}
	
	public void setValue(int row, int column, int value){
		
		board[row][column]=value;
	}
	
}
