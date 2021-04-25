import java.util.*;
public class TicTacToeGame {

public static void main(String[] args) {
	char [] board= createBoard();
	Scanner userInput=new Scanner(System.in);
	char userLetter=chooseUserLetter(userInput);
	char computerLetter = (userLetter =='X')?'0':'X'; 
	showBoard(board);
	int userMove = getUserMove(board,userInput);
	int move=input.nextInt();
		boolean result=isValidMove(move,board);
		while(!result){
		System.out.Println("Invalid move!");
		move=input.nextInt();
		result=isValidMove(move,board);
		}
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

/* UC4 */
private static int getUserMove(char[] board, Scanner userInput) {
	Integer [] validcells= {1,2,3,4,5,6,7,8,9};
	while(true) {
		System.out.println("What is your next move? (1-9): ");
		int index = userInput.nextInt();
		if(Arrays.asList(validcells).contains(index) && isSpaceFree(board,index))
		return index;
	}
}
public static boolean isSpaceFree(char[] board, int index) {
	return board[index]==' ' ;
}


/* UC5 */
public static boolean isValidMove(int move, char[] board){
switch (userInput){
	case 1:
			if(board[1]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 2:
			if(board[2]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 3:
			if(board[3]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 4:
			if(board[4]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 5:
			if(board[5]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 6:
			if(board[6]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 7:
			if(board[7]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 8:
			if(board[8]==' ' ){
			return true;
			}
			else{
			return false;
			}
			case 9:
			if(board[9]==' ' ){
			return true;
			}
			else{
			return false;
			}
			default:
			return false;
			}
}
/* UC6 */
private static String firstPlayCheck() {
			int toss = (int) (Math.random() * 10) % 2;
			return (toss == 1) ? (player) : (computer);
		}
}
