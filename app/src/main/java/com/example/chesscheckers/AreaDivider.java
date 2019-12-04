package com.example.chesscheckers;

public final class AreaDivider {
    private double xDP;
    private double yDP;

    private double xCellSize = 47.625;
    private double yCellSize = 63.5;
    public AreaDivider(double setxDP, double setyDP) {
        xDP = setxDP;
        yDP = setyDP;
    }
    public int getXCoordinateFromBoard() {
        return (int) Math.floor(xDP / 47.625);
    }
    public int getYCoordinateFromBoard() {
        return (int) Math.floor(yDP / 63.5);
    }

}


