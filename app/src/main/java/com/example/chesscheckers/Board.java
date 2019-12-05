package com.example.chesscheckers;

import android.widget.Button;

/**
 * generalized game board object for our games.
 * abstract so that ChessBoard and CheckersBoard can have more specificity
 * with checkWinCondition and so on.
 */
public abstract class Board {
    /** ta said to move all the logic here to checkersActivity
     *
     */

    /**
     *
     * @return true if game is over.
     */
    public abstract boolean checkWinCondition(int teamId);

}
