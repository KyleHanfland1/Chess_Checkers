package com.example.chesscheckers;

import java.util.ArrayList;
import java.util.List;

public class CheckersPiece extends Piece {
    public boolean crowned = false;
    public int team;
    public CheckersPiece(int teamId) {
        team = teamId;
    }
    @Override
    public List<int[]> getAllMoves() {
        List<int[]> possibleMoves = new ArrayList<>();
        if (crowned) {
            possibleMoves.add(new int[]{getX()-1, getY()-1});
            possibleMoves.add(new int[]{getX()+1, getY()-1});
        }
    }
}
