package com.example.chesscheckers;

import java.util.List;

/**
 * abstract class to store what each pieces methods should be.
 */
public abstract class Piece {
    /**
     * stores x and y coordinates for piece which are translated in board.
     * Almost all translation between x - y coords to squares on the board should be internal to
     * the board class ! ! ! ! ! ! ! ! ! ! ! ! !
     */
    private int x;
    private int y;
    public abstract List<int[]> getAllMoves();
        /**
         * returns a list of all possible moves so that board class can highlight blocks so
         * that user can see possible moves
         */

    public int getX() {
        return x;
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
    public int[] move(int[] a) {
        /**
         * passed the x - y coords of a click/tap
         * first make sure move is in the list of possible moves
         * then change the x - y coords of the piece
         * update the UI to remove the highlighted squares then move the piece
         * if chess and shared square you take a piece
         * if checkers you jumped them you take the piece
         * return new x - y components
         *
         * if this is too high up in the tree you can override this implementation or update it
         * to fit specific pieces if its not working for some reason
         */
        return null;
    }

}
