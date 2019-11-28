package com.example.chesscheckers;

import java.util.List;

public class Knight extends Piece {
    String team;
    String PieceStartingSide;

    public Knight(String setTeam, String setPieceStartingSide) {
        team = setTeam;
        PieceStartingSide = setPieceStartingSide;
    }
    /**
     * can move in an L shape
     * looking at photos of possible moves I think will make this problem easier
     * bc photos on google make it easy to visualize
     */
    @Override
    public List<int[]> getAllMoves() {
        return null;
    }
}
