package com.example.chesscheckers;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public final class AreaDivider {
    private CheckersBoard board;
    /**
     * grab the imageView of the board
     */
    private ImageView imageBoard;
    private int height;
    private int width;
    private int xCellSize;
    private int yCellSize;
    public AreaDivider(CheckersBoard b, Activity a) {
        CheckersBoard board = b;
        imageBoard = a.findViewById(R.id.checkerBoard);
        height = imageBoard.getHeight();
        width = imageBoard.getWidth();
        xCellSize = 1080/8;
        yCellSize = 1080/8;
    }

    /**
     *  px = dp * (dpi / 160)
     *  dp = px / (dpi / 160)
     *  densityFactor = dpi/160
     *  xcellsize = board.getWidth() will return pixels (i believe then use conversion above)
     *  y cell size = ImageView board.getHeight() (Once again in pixels)
     *  Important because this allows for no magic numbers aka accounts for different screen sizes
     *  on launch
     * @return
     */
    public int xcoordToBoard(int x) {
        return x*xCellSize;
    }
    public int ycoordToBoard(int y) {
        return y*yCellSize;
    }
    public int getXCoordinateFromBoard(int pixel) {
        return (int) Math.floor(pixel/xCellSize);
    }
    public int getYCoordinateFromBoard(int pixel) {
        return (int) Math.floor(pixel / yCellSize);
    }
    public int getXCellMiddle(int x) {
        return ((x * xCellSize) + (int) (.5 * xCellSize));
    }

}