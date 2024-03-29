package com.example.chesscheckers;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

//public void highlightPiece(Piece a) {
/**
 * passed an object or piece (preferably the latter)
 * and fills that square another color to indicate selection
 * then highlights all moves in the getAllMoves() function of the piece
 * subclasses
 */

//}
public class CheckersActivity extends AppCompatActivity {

    public static CheckersBoard gameBoard;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board);
        gameBoard = new CheckersBoard(this);
        try {
            setUpUI(gameBoard);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw(e);
        }
    }

    public void setUpUI(CheckersBoard checkersBoard) {
        ConstraintLayout gridLayout = findViewById(R.id.gridLayout);
        ImageView board = gridLayout.findViewById(R.id.checkerBoard);
        board.setX(board.getWidth());
        board.setY(board.getHeight());
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
    public void updateUI() {
        //draw all pieces on board that are being moved and such
        // use checkerpiece array to
        // use for loop to go through array and draw out each piece. use area divider to place each piece in x and y coordinates and convert back into pixels
        /**
         * updates every time move made, instead of restarting whole board with setUpUI.
         */

    }
    public void boardClicked(ImageView v) {
        v.layout((int) v.getX(),(int) v.getY(),(int) v.getX() + v.getWidth(),(int) v.getY() + v.getHeight());
    }

}