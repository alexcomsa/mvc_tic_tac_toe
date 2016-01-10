package ro.alex.view;

import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ro.alex.model.Model;

public class GameBoard extends JFrame {
	private Model model;
	private JButton[][] boardView;
	private JPanel buttonContainer;

	public GameBoard(Model model) {
		super("Tic Tac Toe Game");
		setSize(400, 400);
		boardView = new JButton[3][3];
		buttonContainer = new JPanel();
		buttonContainer.setSize(600, 600);
		this.model = model;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.buttonContainer.setLayout(new GridBagLayout());
		addPiecesToTheBoard();
		this.add(buttonContainer);
		setVisible(true);

	}

	private void addPiecesToTheBoard() {
		buttonContainer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		int k = 1;
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {

				JButton button = new JButton();
				button.setSize(1000, 1000);
				button.setText("click to pick " + k);
				System.out.println("row " + row + "column " + column + "value " + k);
				boardView[row][column] = button;
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = column;
				gbc.gridy = row;
				gbc.weightx = 300;
				gbc.weighty = 300;
				gbc.ipady = 500;
				gbc.ipadx = 500;
				k++;
				buttonContainer.add(button, gbc);
			}
		}

	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	private static final long serialVersionUID = 1L;

	public JButton[][] getBoardView() {
		return boardView;
	}

	public void setBoardView(JButton[][] boardView) {
		this.boardView = boardView;
	}

	public String getBoardPieceValue(int row, int column) {

		return boardView[row][column].getText();
	}

	public void setBoardPieceValue(int row, int column, String value) {
		JButton button = boardView[row][column];
		button.setText(value);
	}
}
