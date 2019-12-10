package com.example.chesscheckers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckersBoard extends Board {
    private int numPieces0 = Constants.Checkers.numStartPieces;
    private int numPieces1 = Constants.Checkers.numStartPieces;
    public int lastX, lastY;
    public static boolean whiteTurn = false;
    /**
     * starts from top to bottom
     */
    public CheckersPiece[][] boardPositions = new CheckersPiece[Constants.Board.numSquares][Constants.Board.numSquares];
    public CheckersBoard() {
        /**
         * black piece setup
         */
        boardPositions[0][1] = new CheckersPiece(0, 1, 0);
        boardPositions[0][3] = new CheckersPiece(0, 3 , 0);
        boardPositions[0][5] = new CheckersPiece(0, 5 , 0);
        boardPositions[0][7] = new CheckersPiece(0, 7 , 0);
        boardPositions[2][1] = new CheckersPiece(0, 2, 1);
        boardPositions[2][3] = new CheckersPiece(0, 2, 3);
        boardPositions[2][5] = new CheckersPiece(0, 2, 5);
        boardPositions[2][7] = new CheckersPiece(0, 2, 7);
        boardPositions[1][0] = new CheckersPiece(0, 1, 0);
        boardPositions[1][2] = new CheckersPiece(0, 1, 2);
        boardPositions[1][4] = new CheckersPiece(0, 1, 4);
        boardPositions[1][6] = new CheckersPiece(0, 1, 6);
        /**
         * white piece setup
         */
        boardPositions[0][5] = new CheckersPiece(1, 0, 5);
        boardPositions[2][5] = new CheckersPiece(1, 2, 5);
        boardPositions[4][5] = new CheckersPiece(1, 4, 5);
        boardPositions[6][5] = new CheckersPiece(1, 6, 5);
        boardPositions[1][6] = new CheckersPiece(1, 1, 6);
        boardPositions[3][6] = new CheckersPiece(1, 3, 6);
        boardPositions[5][6] = new CheckersPiece(1, 5, 6);
        boardPositions[7][6] = new CheckersPiece(1, 7, 6);
        boardPositions[0][7] = new CheckersPiece(1, 0, 7);
        boardPositions[2][7] = new CheckersPiece(1, 2, 7);
        boardPositions[4][7] = new CheckersPiece(1, 4, 7);
        boardPositions[6][7] = new CheckersPiece(1, 6, 7);
        /**
         * board positions array set up for initial part of the game
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
    public static void crown(CheckersPiece piece) {
        /**
         * somehow designates piece to be special so that it can go backwards maybe two different
         * arrays or a instance variable boolean for checkers pieces
         * if crowned == true checker can move backward
         */
        piece.crowned = true;
    }
    public void pieceTaken(int teamId) {
        if (teamId == Constants.TeamId.team1Id) {
            numPieces0--;
        } else {
            numPieces1--;
        }
    }
}
