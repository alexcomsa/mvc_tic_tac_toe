package ro.alex;

import javax.swing.JButton;

import ro.alex.controller.Controller;
import ro.alex.model.Model;
import ro.alex.view.GameBoard;

public class Application {

	

	public static void runApplication() {
		Model model = new Model();
		GameBoard gameBoard = new GameBoard(model);
		Controller controller = new Controller(model, gameBoard);

	}

	public static void main(String[] args) {
		runApplication();

	}

	

}
