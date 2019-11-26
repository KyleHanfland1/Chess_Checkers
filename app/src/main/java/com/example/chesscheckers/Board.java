package com.example.chesscheckers;

/**
 * generalized game board object for our games.
 * abstract so that ChessBoard and CheckersBoard can have more specificity
 * with checkWinCondition and so on.
 */
public abstract class Board {
    public void highlightPiece(Piece a) {
        /**
         * passed an object or piece (preferably the latter)
         * and fills that square another color to indicate selection
         * then highlights all moves in the getAllMoves() function of the piece
         * subclasses
         */
    }
    public void setUpUI() {
        /**
         * called when UI initially needs to be setup onCreate.
         */

    }

    /**
     *
     * @return true if game is over.
     */
    public abstract boolean checkWinCondition(int teamId);
}
