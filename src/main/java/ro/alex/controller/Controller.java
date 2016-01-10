package ro.alex.controller;

import ro.alex.model.Model;
import ro.alex.view.GameBoard;

public class Controller {

	private Model model;
	private GameBoard gameBoard;
	public Controller(Model model, GameBoard gameBoard) {
		this.model=model;
		this.gameBoard=gameBoard;
	}
	public GameBoard getGameBoard() {
		return gameBoard;
	}
	public void setGameBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}

}
