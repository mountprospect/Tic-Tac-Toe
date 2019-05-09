import java.util.*;

/**
 * 
 * @author Maalv date: 5-8-19 at 6:32 pm
 */

public class Board {

	private String playerOne;
	private String playerTwo;
	private String[][] board = { { " ", "1", "2", "3" }, 
								 { "1", "-", "-", "-" }, 
								 { "2", "-", "-", "-" },
								 { "3", "-", "-", "-" } };
	private int turn = 1;
//	public Board(String playerOneName, String playerTwoName) {
//		this.playerOne = playerOneName;
//		this.playerTwo = playerTwoName;
//	}

	public String[][] editBoardPlayerOne(int indexOne, int indexTwo) {
		if (board[indexOne][indexTwo].equals("-")) {
			board[indexOne][indexTwo] = "X";
		} else {
			System.out.println("Position already filled, please re-enter position: ");
			editBoardPlayerOne(this.indexOne(), this.indexTwo());
		}
		return board;
	}

	public String[][] editBoardPlayerTwo(int indexOne, int indexTwo) {
		if (board[indexOne][indexTwo].equals("-")) {
			board[indexOne][indexTwo] = "O";
		} else {
			System.out.println("Position already filled, please re-enter position: ");
			editBoardPlayerTwo(this.indexOne(), this.indexTwo());
		}
		return board;
	}

	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
				if (j == board[0].length - 1)
					System.out.println();
			}
		}
	}

	public int indexOne() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter row for input(1 - 3): ");
		int index;
		while (true) {
			index = in.nextInt();
			if (index > 3 || index < 1)
				System.out.println("Invalid Position: Please renter values: ");
			else
				return index;
		}
	}

	public int indexTwo() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter column for input(1 - 3): ");
		int index;
		while (true) {
			index = in.nextInt();
			if (index > 3 || index < 1)
				System.out.print("Invalid Position. Please renter values: ");
			else
				return index;
		}
	}

	public String takeTurn() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Enter 'X' or 'O': ");
			String val = in.nextLine();
			if (!(val.equalsIgnoreCase("x") || val.equalsIgnoreCase("o")))
				System.out.print("Invalid Input");
			else
				return val;
		}
	}

	public String setPlayerOneName(String name) {
		playerOne = name;
		return playerOne;
	}

	public String setPlayerTwoName(String name) {
		playerTwo = name;
		return playerTwo;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String getPlayerOne() {
		return playerOne;
	}

	public String getPlayerTwo() {
		return playerTwo;
	}
}
