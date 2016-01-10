package ro.alex.model;

public class Model {

	private int[][] board;
	private String playerTurn;
	private static final String PLAYER_X = "X";
	private static final String PLAYER_O = "O";

	public Model() {
		setBoard(new int[3][3]);
		setPlayerTurn(PLAYER_X);
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(board[i][j]);
			}
		}
	}

	public void setValue(int row, int column, int value) {

		board[row][column] = value;
		System.out.println(board[row][column]);
		setPlayerTurn(getPlayerTurn().equals(PLAYER_X) ? PLAYER_O : PLAYER_X);

	}

	public int getNumberOfRows() {
		return board[0].length;
	}

	public int getNumberOfColumns() {
		return board[1].length;
	}

	public String getPlayerTurn() {
		return playerTurn;
	}

	public void setPlayerTurn(String playerTurn) {
		this.playerTurn = playerTurn;
	}

}
