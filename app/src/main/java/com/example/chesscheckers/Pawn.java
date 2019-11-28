package com.example.chesscheckers;

import java.util.List;

public class Pawn extends Piece {
    String team;
    String PieceStartingSide;

    public Pawn(String setTeam, String setPieceStartingSide) {
        team = setTeam;
        PieceStartingSide = setPieceStartingSide;
    }
    /**
     * moves forward or can take a piece at a diagonal
     */
    @Override
    public List<int[]> getAllMoves() {
        return null;
    }
}
