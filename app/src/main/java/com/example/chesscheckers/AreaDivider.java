package com.example.chesscheckers;

import android.util.DisplayMetrics;
import android.widget.ImageView;

import androidx.constraintlayout.widget.ConstraintLayout;

public final class AreaDivider {
    private double xDP;
    private double yDP;
    private CheckersBoard board;
    /**
     * grab the imageView of the board
     */
    //private ImageView imageBoard =
    private double xCellSize = 47.625;
    private double yCellSize = 63.5;
    public AreaDivider(double setxDP, double setyDP, CheckersBoard b) {
        xDP = setxDP;
        yDP = setyDP;
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
    public int getXCoordinateFromBoard() {
        return (int) Math.floor(xDP / 47.625);
    }
    public int getYCoordinateFromBoard() {
        return (int) Math.floor(yDP / 63.5);
    }

}


