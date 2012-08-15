package com.cloudbees.model;

public class Move {
	protected long id;
	protected long move;
	protected String game;
	protected String white;
	protected String black;

	public Move() {
		this.id = 0;
		this.move = 0;
		this.game = "";
		this.white = "";
		this.black = "";
	}
	
	public Move(String white, String black, long move, String game){
		this.id = 0;
		this.move = move;
		this.game = game;
		this.white = white;
		this.black = black;
	}

	public long getMove() {
		return move;
	}

	public void setMove(long move) {
		this.move = move;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getWhite() {
		return white;
	}

	public void setWhite(String white) {
		this.white = white;
	}

	public String getBlack() {
		return black;
	}

	public void setBlack(String black) {
		this.black = black;
	}

	public long getId() {
		return id;
	}

	public boolean isLegal(String move) {
		// if move [1] == a-h
		// and move [2] == 1-8
		// and move [3] == - or x
		// and move [4] == a-h
		// and move [5] == 1-8
		return true;
	}
}
