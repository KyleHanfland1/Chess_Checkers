package com.example.chesscheckers;

import java.util.ArrayList;
import java.util.List;

public class CheckersPiece extends Piece {
    public boolean crowned = false;
    public int team;
    public CheckersPiece(int teamId, int x, int y) {
        team = teamId;
    }
    @Override
    public List<int[]> getAllMoves() {
        List<int[]> possibleMoves = new ArrayList<>();
        if (crowned) {
            if(team == Constants.TeamId.team1Id) {
                if (!((getX()-1 < 0) && (getY()-1 < 0))) {
                    possibleMoves.add(new int[]{getX()-1, getY()-1});
                }
                if (!((getX()+1 > 7) && (getY()-1 < 0))) {
                    possibleMoves.add(new int[]{getX()+1, getY()-1});
                }
            } else {
                if (!((getY()+1 > 7) && (getX()-1 < 0))) {
                    possibleMoves.add(new int[]{getX()-1, getY()+1});
                }
                if (!((getY()+1 > 7) && (getX()+1 > 7))) {
                    possibleMoves.add(new int[]{getX()+1, getY()+1});
                }
            }
        }
        if(team == Constants.TeamId.team2Id) {
            if (!((getX()-1 < 0) && (getY()-1 < 0))) {
                possibleMoves.add(new int[]{getX()-1, getY()-1});
            }
            if (!((getX()+1 > 7) && (getY()-1 < 0))) {
                possibleMoves.add(new int[]{getX()+1, getY()-1});
            }
        } else {
            if (!((getY()+1 > 7) && (getX()-1 < 0))) {
                possibleMoves.add(new int[]{getX()-1, getY()+1});
            }
            if (!((getY()+1 > 7) && (getX()+1 > 7))) {
                possibleMoves.add(new int[]{getX()+1, getY()+1});
            }
        }
        System.out.println(possibleMoves.toString());
        return possibleMoves;

    }
}
