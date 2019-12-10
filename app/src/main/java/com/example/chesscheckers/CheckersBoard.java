package com.example.chesscheckers;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CheckersBoard extends Board {
    private int numPieces0 = Constants.Checkers.numStartPieces;
    private int numPieces1 = Constants.Checkers.numStartPieces;
    public CheckersPiece selectedPiece;
    public Activity activity;
    public static boolean whiteTurn = false;
    /**
     * starts from top to bottom
     */
    public CheckersPiece[][] boardPositions = new CheckersPiece[Constants.Board.numSquares][Constants.Board.numSquares];
    public CheckersBoard(Activity a) {
        activity = a;
        /**
         * black piece setup
         */
        boardPositions[1][5] = new CheckersPiece(0, 1, 5, a.findViewById(R.id.bp5));
        boardPositions[3][5] = new CheckersPiece(0, 3 , 5, a.findViewById(R.id.bp3));
        boardPositions[5][5] = new CheckersPiece(0, 5 , 5, a.findViewById(R.id.bp2));
        boardPositions[7][5] = new CheckersPiece(0, 7 , 5, a.findViewById(R.id.bp9));
        boardPositions[0][6] = new CheckersPiece(0, 0, 6, a.findViewById(R.id.bp12));
        boardPositions[2][6] = new CheckersPiece(0, 2, 6, a.findViewById(R.id.bp8));
        boardPositions[4][6] = new CheckersPiece(0, 4, 6, a.findViewById(R.id.bp6));
        boardPositions[6][6] = new CheckersPiece(0, 6, 6, a.findViewById(R.id.bp));
        boardPositions[1][7] = new CheckersPiece(0, 1, 7, a.findViewById(R.id.bp7));
        boardPositions[3][7] = new CheckersPiece(0, 3, 7, a.findViewById(R.id.bp10));
        boardPositions[5][7] = new CheckersPiece(0, 5, 7, a.findViewById(R.id.bp4));
        boardPositions[7][7] = new CheckersPiece(0, 7, 7, a.findViewById(R.id.bp11));
        /**
         * white piece setup
         */
        boardPositions[0][0] = new CheckersPiece(1, 0, 0, a.findViewById(R.id.wp7));
        boardPositions[2][0] = new CheckersPiece(1, 2, 0, a.findViewById(R.id.wp9));
        boardPositions[4][0] = new CheckersPiece(1, 4, 0, a.findViewById(R.id.wp));
        boardPositions[6][0] = new CheckersPiece(1, 6, 0, a.findViewById(R.id.wp2));
        boardPositions[1][1] = new CheckersPiece(1, 1, 1, a.findViewById(R.id.wp10));
        boardPositions[3][1] = new CheckersPiece(1, 3, 1, a.findViewById(R.id.wp5));
        boardPositions[5][1] = new CheckersPiece(1, 5, 1, a.findViewById(R.id.wp6));
        boardPositions[7][1] = new CheckersPiece(1, 7, 1, a.findViewById(R.id.wp4));
        boardPositions[0][2] = new CheckersPiece(1, 0, 2, a.findViewById(R.id.wp11));
        boardPositions[2][2] = new CheckersPiece(1, 2, 2, a.findViewById(R.id.wp3));
        boardPositions[4][2] = new CheckersPiece(1, 4, 2, a.findViewById(R.id.wp12));
        boardPositions[6][2] = new CheckersPiece(1, 6, 2, a.findViewById(R.id.wp8));
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
