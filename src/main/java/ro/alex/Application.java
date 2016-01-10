package ro.alex;

import ro.alex.controller.Controller;
import ro.alex.model.Model;
import ro.alex.view.GameBoard;

public class Application {

	

	public static void runApplication() {
		Model model = new Model();
		GameBoard gameBoard = new GameBoard(model);
		Controller controller = new Controller(model, gameBoard);
		System.out.println("Git test");

	}

	public static void main(String[] args) {
		runApplication();

	}

	

}
