package com.example.chesscheckers;

public class ChessBoard extends Board {
    private Piece[][] boardPositions = new Piece[Constants.Board.numSquares][Constants.Board.numSquares];
    public ChessBoard() {
        /**
         * add the pieces to the right locations in the gameboard, but
         * be careful to add the same piece as the one we use in the game
         * because otherwise the piece class located at the location
         * won't give the right information when we reference boardPositions
         */
    }
    @Override
    public boolean checkWinCondition(int teamId) {
        return false;
    }
}