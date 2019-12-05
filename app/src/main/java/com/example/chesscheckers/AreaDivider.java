package com.example.chesscheckers;

import android.util.DisplayMetrics;

public final class AreaDivider {
    private double xDP;
    private double yDP;
    private CheckersBoard board;
    private double xCellSize = 47.625;
    private double yCellSize = 63.5;
    public AreaDivider(double setxDP, double setyDP, CheckersBoard b) {
        xDP = setxDP;
        yDP = setyDP;
        CheckersBoard board = b;
        DisplayMetrics metrics = getResources().getDisplayMetrics();
    }

    /**
     *  px = dp * (dpi / 160)
     *  dp = px / (dpi / 160)
     * @return
     */
    public int getXCoordinateFromBoard() {
        return (int) Math.floor(xDP / 47.625);
    }
    public int getYCoordinateFromBoard() {
        return (int) Math.floor(yDP / 63.5);
    }

}


