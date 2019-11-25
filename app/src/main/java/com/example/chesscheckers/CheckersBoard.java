package com.example.chesscheckers;

public class CheckersBoard extends Board {
    @Override
    public boolean checkWinCondition(int teamId) {
        /**
         * if num other pieces == 0 return true
         * called should be called after every move
         */
        return false;
    }
    public void crown(Piece piece) {
        /**
         * somehow designates piece to be special so that it can go backwards maybe two different
         * arrays or a instance variable boolean for checkers pieces
         */
    }
}
