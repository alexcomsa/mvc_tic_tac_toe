package ro.alex.view;

import java.awt.Font;

import javax.swing.JButton;

public class BoardPiece  extends JButton{

	/**
	 * @author alex
	 */
	
	private int row;
	private int column;
	private static final long serialVersionUID = 1L;
	
	public BoardPiece(int row , int column){
		this.setRow(row);
		this.setColumn(column);
		this.setFont(new Font("Arial",Font.PLAIN,40));

	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	

}
