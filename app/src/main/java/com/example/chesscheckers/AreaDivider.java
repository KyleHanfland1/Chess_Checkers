package com.example.chesscheckers;

import android.util.DisplayMetrics;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public final class AreaDivider {
    private CheckersBoard board;
    /**
     * grab the imageView of the board
     */
    private ImageView imageBoard = MainActivity.checkersboard;
    private int height = imageBoard.getHeight();
    private int width = imageBoard.getWidth();
    private int xCellSize = width/8;
    private int yCellSize = height/8;
    public AreaDivider(CheckersBoard b) {
        CheckersBoard board = b;
    }

    /**
     *  px = dp * (dpi / 160)
     *  dp = px / (dpi / 160)
     *  densityFactor = dpi/160
     *  xcellsize = board.getWidth() will return pixels (i believe then use conversion above)
     *  y cell size = ImageView board.getHieght() (Once again in pixels)
     *  Important because this allows for no magic numbers aka accounts for different screen sizes
     *  on launch
     * @return
     */
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


