package com.example.chesscheckers;

import java.util.List;

import static com.example.chesscheckers.CheckersBoard.whiteTurn;


/**
 * abstract class to store what each pieces methods should be.
 */
public abstract class Piece {
    /**
     * stores x and y coordinates for piece which are translated in board.
     * Almost all translation between x - y coords to squares on the board should be internal to
     * the board class ! ! ! ! ! ! ! ! ! ! ! ! !
     */
    public int team;
    public int x;
    public int y;
    public abstract List<int[]> getAllMoves();
        /**
         * returns a list of all possible moves so that board class can highlight blocks so
         * that user can see possible moves
         */

    public int getX() {
        return this.x;
    }
    public int getY() {
        return y;
    }
    public int setX(int a) {
        x = a;
        return x;
    }
    public int setY(int b) {
        y = b;
        return y;
    }

}
