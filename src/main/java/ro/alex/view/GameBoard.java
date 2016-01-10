package ro.alex.view;

import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ro.alex.controller.Controller;
import ro.alex.model.GameFunctions;
import ro.alex.model.Model;

public class GameBoard extends JFrame {
	private Model model;
	private BoardPiece[][] boardView;
	private JPanel buttonContainer;
	private GameFunctions controller;

	public GameBoard(Model model) {
		super("Tic Tac Toe Game");
		setSize(400, 400);
		boardView = new BoardPiece[3][3];
		buttonContainer = new JPanel();
		buttonContainer.setSize(600, 600);
		this.model = model;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.buttonContainer.setLayout(new GridBagLayout());
		addPiecesToTheBoard();
		this.add(buttonContainer);
		setVisible(true);

	}

	public GameFunctions getController() {
		return controller;
	}

	public void setController(GameFunctions controller) {
		this.controller = controller;
	}

	private void addPiecesToTheBoard() {
		buttonContainer
				.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		int modelRowCount = model.getNumberOfRows();
		int modelColumnCount = model.getNumberOfColumns();
		for (int row = 0; row < modelRowCount; row++) {
			for (int column = 0; column < modelColumnCount; column++) {

				BoardPiece button = new BoardPiece(row, column);
				button.setSize(1000, 1000);
				
				button.addActionListener(new ClickEventListener());
				boardView[row][column] = button;

				// Set pieces position
				GridBagConstraints gbc = new GridBagConstraints();
				gbc.gridx = column;
				gbc.gridy = row;
				gbc.weightx = 300;
				gbc.weighty = 300;
				gbc.ipady = 500;
				gbc.ipadx = 500;

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

	public void setBoardView(BoardPiece[][] boardView) {
		this.boardView = boardView;
	}

	public String getBoardPieceValue(int row, int column) {

		return boardView[row][column].getText();
	}

	public void setBoardPieceValue(int row, int column, String value) {
		JButton button = boardView[row][column];
		button.setText(value);
	}

	public void setBoardListener(GameFunctions controller) {
		this.setController(controller);

	}

	private class ClickEventListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			BoardPiece clickedBoardPiece = (BoardPiece) event.getSource();
			controller.clickBoardPiece(clickedBoardPiece.getRow(),
					clickedBoardPiece.getColumn());
			clickedBoardPiece.setText(model.getPlayerTurn());
			clickedBoardPiece.removeActionListener(this);

		}

	}
}
