package com.example.chesscheckers;

import android.view.View;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

import static com.example.chesscheckers.CheckersActivity.gameBoard;
import static com.example.chesscheckers.CheckersBoard.whiteTurn;

public class CheckersPiece extends Piece {
    public boolean crowned = false;
    public View imageView;
    public CheckersPiece(int teamId, int x, int y, View i) {
        team = teamId;
        this.setX(x);
        this.setY(y);
        imageView = i;
        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                gameBoard.selectedPiece = gameBoard.boardPositions[getX()][getY()];
            }
        });
    }
    @Override
    public List<int[]> getAllMoves() {
        List<int[]> possibleMoves = new ArrayList<>();
        if (crowned) {
            if(team == Constants.TeamId.team1Id) {
                if (!((getX()-1 > 0) && (getY()-1 > 0)) && gameBoard.boardPositions[getX()-1][getY()-1] == null) {
                    possibleMoves.add(new int[]{getX()-1, getY()-1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()-1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()-2][getY()-2]) == null) {
                        possibleMoves.add(new int[]{getX()-2, getY()-2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (!((getX()+1 < 8) && (getY()-1 > 0)) && gameBoard.boardPositions[getX()+1][getY()-1] == null) {
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
                if (!((getY()+1 < 8) && (getX()-1 > 0)) && gameBoard.boardPositions[getX()-1][getY()+1] == null) {
                    possibleMoves.add(new int[]{getX()-1, getY()+1});
                }
                try {
                    if ((gameBoard.boardPositions[getX()-1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()-2][getY()+2]) == null) {
                        possibleMoves.add(new int[]{getX()-2, getY()+2});
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (!((getY()+1 < 8) && (getX()+1 < 8)) && gameBoard.boardPositions[getX()+1][getY()+1] == null) {
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
            if (!((getX()-1 > 0) && (getY()-1 > 0)) && gameBoard.boardPositions[getX()-1][getY()-1] == null) {
                possibleMoves.add(new int[]{getX()-1, getY()-1});
            }
            try {
                if ((gameBoard.boardPositions[getX()-1][getY()-1].team == Constants.TeamId.team2Id) && (gameBoard.boardPositions[getX()-2][getY()-2]) == null) {
                    possibleMoves.add(new int[]{getX()-2, getY()-2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (!((getX()+1 < 8) && (getY()-1 > 0)) && gameBoard.boardPositions[getX()+1][getY()-1] == null) {
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
            if (!((getY()+1 < 8) && (getX()-1 > 0)) && gameBoard.boardPositions[getX()-1][getY()+1] == null) {
                possibleMoves.add(new int[]{getX()-1, getY()+1});
            }
            try {
                if ((gameBoard.boardPositions[getX()-1][getY()+1].team == Constants.TeamId.team1Id) && (gameBoard.boardPositions[getX()-2][getY()+2]) == null) {
                    possibleMoves.add(new int[]{getX()-2, getY()+2});
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (!((getY()+1 < 8) && (getX()+1 < 8)) && gameBoard.boardPositions[getX()+1][getY()+1] == null) {
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

    public boolean possible(int x, int y, CheckersBoard board) {
        if (crowned) {
            if (board.boardPositions[x][y] == null && Math.abs(getY()-y) == 1 && Math.abs(getX()-x) == 1) {
                return true;
            }
            if (board.boardPositions[x][y].team == this.team) {
                return false;
            }
            if (Math.abs(this.getX()-x) == 2 && gameBoard.boardPositions[this.getX() * (2* (this.getX()-x))][this.getY() * (2 * (this.getY() - y))].team != this.team) {
                return true;
            }
        } else {
            if (team == Constants.TeamId.team1Id) {
                if ((getY() - y) > 0) {
                    if (board.boardPositions[x][y] == null && Math.abs(getY()-y) == 1 && Math.abs(getX()-x) == 1) {
                        return true;
                    }
                    if (board.boardPositions[x][y].team == this.team) {
                        return false;
                    }
                    if (Math.abs(this.getX()-x) == 2 && gameBoard.boardPositions[this.getX() * (2* (this.getX()-x))][this.getY() * (2 * (this.getY() - y))].team != this.team) {
                        return true;
                    }
                }
            } else {
                if ((getY() - y) < 0) {
                    if (board.boardPositions[x][y] == null && Math.abs(getY()-y) == 1 && Math.abs(getX()-x) == 1) {
                        return true;
                    }
                    if (board.boardPositions[x][y].team == this.team) {
                        return false;
                    }
                    if (Math.abs(this.getX()-x) == 2 && gameBoard.boardPositions[this.getX() * (2* (this.getX()-x))][this.getY() * (2 * (this.getY() - y))].team != this.team) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean move(int x, int y, CheckersBoard board) {
        /**
         * passed the x - y coords of a click/tap
         * first make sure move is in the list of possible moves
         */
        if (whiteTurn == true && team == Constants.TeamId.team1Id) {
            return false;
        }
        if (whiteTurn == false && team == Constants.TeamId.team2Id) {
            return false;
        }
        /**
         * then change the x - y coords of the piece
         * update the UI to remove the highlighted squares then move the piece
         * if chess and shared square you take a piece
         * if checkers you jumped them you take the piece
         * return new x - y components
         *
         * if this is too high up in the tree you can override this implementation or update it
         * to fit specific pieces if its not working for some reason
         */
        if (possible(x, y, gameBoard)) {
            int changex = this.getX()-x;
            int changey = this.getY()-y;
            CheckersPiece temp = gameBoard.boardPositions[getX()][getY()];
            gameBoard.boardPositions[getX()][getY()] = null;
            gameBoard.boardPositions[x][y] = temp;
            if (gameBoard.boardPositions[(this.getX() + x)/2][(this.getY() + y)/2] != null) {
                System.out.println("Here");
                if (gameBoard.boardPositions[(this.getX() + x)/2][(this.getY() + y)/2].team != this.team) {
                    gameBoard.boardPositions[(this.getX() + x)/2][(this.getY() + y)/2].imageView.setVisibility(View.GONE);
                    gameBoard.boardPositions[(this.getX() + x)/2][(this.getY() + y)/2] = null;
                }
            }
            this.setX(x);
            this.setY(y);/*
            if (Math.abs(changex) == 2) {
                gameBoard.boardPositions[x + (changex/2)][y + (changey/2)] = null;
                if (team == Constants.TeamId.team1Id) {
                    board.numPieces1--;
                } else if (team == Constants.TeamId.team2Id) {
                    board.numPieces0--;
                }
            }*/

            gameBoard.boardPositions[x][y].imageView.setX(142*x);
            gameBoard.boardPositions[x][y].imageView.setY(142*y);
            // flips after move is
            whiteTurn = !whiteTurn;
            gameBoard.startTimer();
        }
        //setUpUI(gameBoard);
        return possible(x, y, gameBoard);
    }
    public void setUpUI(CheckersBoard checkersBoard) {
        ConstraintLayout gridLayout = gameBoard.activity.findViewById(R.id.gridLayout);
        ImageView board = gridLayout.findViewById(R.id.checkerBoard);
        board.setX(0);
        board.setY(0);
        for (int i = 0; i < checkersBoard.boardPositions.length; i++) {
            for (int j = 0; j < checkersBoard.boardPositions[i].length; j++){
                if (checkersBoard.boardPositions[i][j] != null){
                    checkersBoard.boardPositions[i][j].imageView.setX((float) 142*i + checkersBoard.boardPositions[i][j].imageView.getWidth());
                    checkersBoard.boardPositions[i][j].imageView.setY((float) 142*j + checkersBoard.boardPositions[i][j].imageView.getHeight());
                    System.out.println("X: " + checkersBoard.boardPositions[i][j].imageView.getX()  + " Y: " + checkersBoard.boardPositions[i][j].imageView.getY());
                }
                //make the image, pick its team, add to constraint layout, clone constraint layout into constraint set, do constraint stuff
                // go on stack:how to set layout constraint right to right of parent
                // point of doing this: even after first moving pieces will be constrained to image of board, otherwise theyll all stick to top left corner of board
                // create on click listener on each image view, so when u click it, so u can then find out where u can move that piece

            }
        }

        // not need since board is already created in ui designer
        /**
         * called when UI initially needs to be setup onCreate.
         */

    }
}