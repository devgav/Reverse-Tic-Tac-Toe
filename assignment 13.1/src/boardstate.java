import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class boardstate {
	int n = 3; //amount of rows and columns
	int [][] board = new int [n][n]; //array of the rows and columns
	int playerTurn = 1;
	int max = 2;
	int min = 0;  
	int randomInt = 0; 
	int moves = 0; 
	boolean win = false;
	boolean gameOn = false;
	public boardstate() {

	}
	public int randomInt() {
		int cpuPos = (int) Math.floor(Math.random() * 3);
		return cpuPos;
	}
	public void playermove(int x, int y) {
		if(board[x][y] ==  0) { //this is for if the cell is empty
			this.board[x][y] = playerTurn; //player turn on the current board
			if(playerTurn == 1) { //this is for player1's turn
				playerTurn = 2;
				moves++;
			}
			else { //this is player 2's turn
				playerTurn = 1;
			}
		}
	}
	public void checkWin() { //checks for win
		//loop through rows to check for win conditon
		for(int x = 0; x < n; x++) { 
			if(win == false) { //check for a win
				if(board[x][0] == board[x][1] && board[x][1] == board[x][2] && board[x][0] != 0) { //check the positions on the board for a win
					win = true;
					if(playerTurn == 2) { //check which player's turn it currently is 
						JOptionPane.showMessageDialog(null, "you lose");
						break;
					} else {
						JOptionPane.showMessageDialog(null, "you win");
						break;
					}
				}
			} 
		}
		//loop through cols to check for win condition
		for(int y = 0; y < n; y++) {
			if(win == false) { //check's if you get 3 in a row first 
				if(board[0][y] == board[1][y] && board[1][y] == board[2][y] && board[0][y] != 0) {
					win = true;
					if(playerTurn == 2) {
						JOptionPane.showMessageDialog(null, "you lose");
						break;
					} else{
						JOptionPane.showMessageDialog(null, "you win");
						break;
					}
				}
			} 
		}
		//check diag's for win condition		
		if(win == false) {
			if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0 && board[1][1] != 0 && board[2][2] != 0) {
				win = true;
				if(playerTurn == 2) {
					JOptionPane.showMessageDialog(null, "you lose");
				} else {
					JOptionPane.showMessageDialog(null, "you win");
				}
			} 
		} 
		if(win == false) {
			if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0 && board[1][1] != 0 && board[2][0] != 0) {
				win = true; //a winner has been detected 
				if(playerTurn == 2) { //check who's turn it is 
					JOptionPane.showMessageDialog(null, "you lose");
				} else {
					JOptionPane.showMessageDialog(null, "you win");
				}
			}
		}
	}

	//randomly place a diamond on the board when player 2's turn
	int randomNumber = randomInt();
	int randomInt1 = randomInt();
	public void CPU() {
		checkWin();
		while(win == false && playerTurn == 2 && moves < 9) {
		//if it is the CPU's turn and a random spot on the board is empty
			if(board[randomNumber][randomInt1] == 0) {
				board[randomNumber][randomInt1] = 2;
				moves++;
				playerTurn = 1;
				break;
			//pick a new random number for the x and y coords
			} else {
				randomNumber = randomInt();
				randomInt1 = randomInt();
			}
		}
	}
	public void checkTie() {
		if(win == false && moves == 9) {
			JOptionPane.showMessageDialog(null, "tie");
		}
	}
}