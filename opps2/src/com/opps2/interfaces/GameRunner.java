package com.opps2.interfaces;

public class GameRunner {
	public static void main(String[]args) {
		//GamingConsole game = new MarioGame();
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		
		
	}

}
