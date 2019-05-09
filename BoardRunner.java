import java.util.Scanner;

public class BoardRunner {
//	static Board boardOne = new Board("P1", "P2");
	static Board boardOne = new Board();
	static Scanner inputNames = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Player One's Name: ");
		boardOne.setPlayerOneName(inputNames.nextLine());
		System.out.print("Enter Player Two's Name: ");
		boardOne.setPlayerTwoName(inputNames.nextLine());
		boardOne.printBoard();
		while (true) {
			if(boardOne.getTurn() % 2 == 1) {
				System.out.println(boardOne.getPlayerOne() + "'s turn: ");
				boardOne.editBoardPlayerOne(boardOne.indexOne(), boardOne.indexTwo());
				boardOne.printBoard();
				boardOne.setTurn(boardOne.getTurn() + 1);
				if (boardOne.checkBoard()) {
					System.out.println("Player One Wins!");
					boardOne.reset();
				}
			}
			else {
				System.out.println(boardOne.getPlayerTwo() + "'s turn: ");
				boardOne.editBoardPlayerTwo(boardOne.indexOne(), boardOne.indexTwo());
				boardOne.printBoard();
				boardOne.setTurn(boardOne.getTurn() + 1);
				if (boardOne.checkBoard()) {
					System.out.println("Player One Wins!");
					boardOne.reset();
				}
			}
		}
	}

}
