package com.example.chesscheckers;

public class ChessBoard extends Board {
    private Piece[][] boardPositions = new Piece[Constants.Board.numSquares][Constants.Board.numSquares];
    public ChessBoard() {
        /** first bracket means lettered column, second bracket means row
         * search up alphanumeric array for reference
         * 0 denotes A, 1 denotes B
         * for rows one denotes 1 just to keep more uniform with alphuanmueric board
         * assuming black pieces on top of board from aerial view and white pieces
         *on bottom
         */

        /**
         * following are white pieces
         */
        //boardPositions[0][1] = new Rook();
        //boardPositions[0][2] = 2;
       // boardPositions[1][1] = 2;
        //boardPositions[1][2] = 2;
        //boardPositions[2][1] = 2;
        //boardPositions[2][2] = 2;
        //boardPositions[3][1] = 2;
        //boardPositions[3][2] = 2;
        //boardPositions[4][1] = 2;
        //boardPositions[4][2] = 2;
        //boardPositions[5][1] = 2;
        //boardPositions[5][2] = 2;
        //boardPositions[6][1] = 2;
        //boardPositions[6][2] = 2;
        //boardPositions[7][1] = 2;
        //boardPositions[7][2] = 2;


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