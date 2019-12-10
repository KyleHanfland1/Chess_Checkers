package com.example.chesscheckers;

import android.widget.ImageView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static com.example.chesscheckers.CheckersActivity.gameBoard;

public class CheckersPiece extends Piece {
    public boolean crowned = false;
    public ImageView imageView;
    public CheckersPiece(int teamId, int x, int y, ImageView i) {
        team = teamId;
        this.setX(x);
        this.setY(y);
        imageView = i;
    }
    @Override
    public List<int[]> getAllMoves() {
        List<int[]> possibleMoves = new ArrayList<>();
        if (crowned) {
            if(team == Constants.TeamId.team1Id) {
                if (!((getX()-1 < 0) && (getY()-1 < 0)) && gameBoard.boardPositions[getX()-1][getY()-1] == null) {
                    possibleMoves.add(new int[]{getX()-1, getY()-1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()-1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()-2][getY()-2]) == null) {
                        possibleMoves.add(new int[]{getX()-2, getY()-2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (!((getX()+1 > 7) && (getY()-1 < 0)) && gameBoard.boardPositions[getX()+1][getY()-1] == null) {
                    possibleMoves.add(new int[]{getX()+1, getY()-1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()+1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()+2][getY()-2]) == null) {
                        possibleMoves.add(new int[]{getX()+2, getY()-2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                if (!((getY()+1 > 7) && (getX()-1 < 0)) && gameBoard.boardPositions[getX()-1][getY()+1] == null) {
                    possibleMoves.add(new int[]{getX()-1, getY()+1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()-1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()-2][getY()+2]) == null) {
                        possibleMoves.add(new int[]{getX()-2, getY()+2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (!((getY()+1 > 7) && (getX()+1 > 7)) && gameBoard.boardPositions[getX()+1][getY()+1] == null) {
                    possibleMoves.add(new int[]{getX()+1, getY()+1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()+1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()+2][getY()+2]) == null) {
                        possibleMoves.add(new int[]{getX()+2, getY()+2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if(team == Constants.TeamId.team2Id) {
            if (!((getX()-1 < 0) && (getY()-1 < 0)) && gameBoard.boardPositions[getX()-1][getY()-1] == null) {
                possibleMoves.add(new int[]{getX()-1, getY()-1});
            }
            try {
                if ((gameBoard.boardPositions[getX()-1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()-2][getY()-2]) == null) {
                    possibleMoves.add(new int[]{getX()-2, getY()-2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (!((getX()+1 > 7) && (getY()-1 < 0)) && gameBoard.boardPositions[getX()+1][getY()-1] == null) {
                possibleMoves.add(new int[]{getX()+1, getY()-1});
            }
            try {
                if ((gameBoard.boardPositions[getX()+1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()+2][getY()-2]) == null) {
                    possibleMoves.add(new int[]{getX()+2, getY()-2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            if (!((getY()+1 > 7) && (getX()-1 < 0)) && gameBoard.boardPositions[getX()-1][getY()+1] == null) {
                possibleMoves.add(new int[]{getX()-1, getY()+1});
            }
            try {
                if ((gameBoard.boardPositions[getX()-1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()-2][getY()+2]) == null) {
                    possibleMoves.add(new int[]{getX()-2, getY()+2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (!((getY()+1 > 7) && (getX()+1 > 7)) && gameBoard.boardPositions[getX()+1][getY()+1] == null) {
                possibleMoves.add(new int[]{getX()+1, getY()+1});
            }
            try {
                if ((gameBoard.boardPositions[getX()+1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()+2][getY()+2]) == null) {
                    possibleMoves.add(new int[]{getX()+2, getY()+2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(possibleMoves.toString());
        return possibleMoves;

    }
}
