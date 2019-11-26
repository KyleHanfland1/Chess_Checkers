package com.example.chesscheckers;

public class CheckersBoard extends Board {
    private int numPieces0 = Constants.Checkers.numStartPieces;
    private int numPieces1 = Constants.Checkers.numStartPieces;
    /**
     * board positions stores black team as a 1 in the array
     * stores white team as 2
     * empty squares == 0
     * starts from top to bottom
     */
    private int[][] boardPositions = new int[Constants.Board.numSquares][Constants.Board.numSquares];
    public CheckersBoard() {
        /**
         * black piece setup
         */
        boardPositions[0][1] = 2;
        boardPositions[0][3] = 2;
        boardPositions[0][5] = 2;
        boardPositions[0][7] = 2;
        boardPositions[2][1] = 2;
        boardPositions[2][3] = 2;
        boardPositions[2][5] = 2;
        boardPositions[2][7] = 2;
        boardPositions[1][0] = 2;
        boardPositions[1][2] = 2;
        boardPositions[1][4] = 2;
        boardPositions[1][6] = 2;
        /**
         * white piece setup
         */
    }
    @Override
    public boolean checkWinCondition(int teamId) {
        /**
         * if num other pieces == 0 return true
         * called should be called after every move
         * should be all the code needed
         */
        if (numPieces0 == 0 && teamId == Constants.TeamId.team1Id) {
            return true;
        } else if (numPieces1 == 0 && teamId == Constants.TeamId.team2Id) {
            return true;
        }
        return false;
    }
    public void crown(CheckersPiece piece) {
        /**
         * somehow designates piece to be special so that it can go backwards maybe two different
         * arrays or a instance variable boolean for checkers pieces
         * if crowned == true checker can move backward
         */
        piece.crowned = true;
    }
}
