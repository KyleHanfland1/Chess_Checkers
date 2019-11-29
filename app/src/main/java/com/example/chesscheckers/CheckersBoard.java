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
        boardPositions[0][6] = 1;
        boardPositions[1][5] = 1;
        boardPositions[1][7] = 1;
        boardPositions[2][6] = 1;
        boardPositions[3][5] = 1;
        boardPositions[3][7] = 1;
        boardPositions[4][6] = 1;
        boardPositions[5][5] = 1;
        boardPositions[5][7] = 1;
        boardPositions[6][6] = 1;
        boardPositions[7][5] = 1;
        boardPositions[7][7] = 1;




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
    public void isCrowned(CheckersPiece piece) {
        // if (piece Constants.TeamId.team1Id)
        // for (int i = 0; i < boardPositions.length; i++) {
        // if (boardPositions[i].length == 7) {
        // piece.crowned == true;
            }
        }
        /**
         * somehow designates piece to be special so that it can go backwards maybe two different
         * arrays or a instance variable boolean for checkers pieces
         * if crowned == true checker can move backward
         */
        piece.crowned = true;
    }
}
