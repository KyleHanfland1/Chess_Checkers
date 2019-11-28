package com.example.chesscheckers;

import java.util.List;

public class Rook extends Piece {
    String team;
    String PieceStartingSide;

    public Rook(String setTeam, String setPieceStartingSide) {
        team = setTeam;
        PieceStartingSide = setPieceStartingSide;
    }
    /**
     * only can move straight forward, sideways, and backwards
     */
    @Override
    public List<int[]> getAllMoves() {
        return null;
    }
}
