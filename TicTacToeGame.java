import java.util.*;
public class TicTacToeGame {

public static void main(String[] args) {
	char [] board= createBoard();
	Scanner userInput=new Scanner(System.in);
	char userLetter=chooseUserLetter(userInput);
	char computerLetter = (userLetter =='X')?'0':'X'; 
	}

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
}
