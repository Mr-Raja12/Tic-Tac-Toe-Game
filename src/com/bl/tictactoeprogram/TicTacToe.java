package com.bl.tictactoeprogram;
import java.util.Scanner;
/**
 * 
 * @author Raja
 *Starting is to show a Welcome message to this game.
 *Create the Tic Tac Toe board.
 */
public class TicTacToe {
	/**
	 * Created a default constructor
	 */
	
    public TicTacToe() {
        System.out.println("Welcome to Tic Tac Toe Game !!!");
    }
    static char[] board = new char[10];
    static char player, computer;
    Scanner scanner = new Scanner(System.in);
    public void initialize() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }
    public static void main(String[] args) {
        /**
         * Initialize the object
         */
        TicTacToe obj = new TicTacToe();
        /**
         * Creating the board
         */
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
}


