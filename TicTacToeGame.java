import java.util.*;
public class TicTacToeGame {

public static void main(String[] args) {
	char [] board= createBoard();
	Scanner userInput=new Scanner(System.in);
	char userLetter=chooseUserLetter(userInput);
	char computerLetter = (userLetter =='X')?'0':'X'; 
	showBoard(board);
<<<<<<< HEAD
	}
=======
}
>>>>>>> UC3

private static char[] createBoard() {
	char[] board= new char[10];
	for(int i=0;i<board.length;i++) {
		board[i]=' ';
	}
	return board;
}
/* UC2 */

private static char[] chooseLetter(Scanner userInput) {
	System.out.println("Choose O or X: ");
	return userInput.next().toUpperCase().charAt(0);
}

/* UC3 */
public static void showBoard(char board[]) {
	System.out.println("\n " + board[1] + " | " + board[2] + " | "+board[3]);
	System.out.println("---------------------");
	System.out.println("\n " + board[4] + " | " + board[5] + " | "+board[3]);
	System.out.println("---------------------");
	System.out.println("\n " + board[7] + " | " + board[8] + " | "+board[3]);
	System.out.println("---------------------");

}
}
