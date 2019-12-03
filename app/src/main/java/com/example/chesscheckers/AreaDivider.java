package com.example.chesscheckers;
public final class AreaDivider {
    /**
     * northern boundary.
     */
    private double north;
    /**
     * eastern boundary.
     */
    private double east;
    /**
     * southern boundary.
     */
    private double south;
    /**
     * western boundary.
     */
    private double west;
    /**
     * what we are given.
     */
    private double cellSize;
    /**
     * vertical distance.
     */
    private double northSouth;
    /**
     * horizontal distance.
     */
    private double eastWest;
    /**
     * y size of y cell.
     */
    private double actualYCellSize;
    /**
     * x size of z cell.
     */
    private double actualXCellSize;

    // areaDivider; they give us a whole box and we split it into a grid

    /**
     *
     * @param setNorth latitude of the north boundary
     * @param setEast longitude of the east boundary
     * @param setSouth latitude of the south boundary
     * @param setWest longitude of the west boundary
     * @param setCellSize the requested side length of each cell, in meters
     */
    public AreaDivider(final double setNorth, final double setEast,
                       final double setSouth, final double setWest,
                       final double setCellSize) {
//north and south not in meters, in lat and long so theyre double
        north = setNorth;
        east = setEast;
        south = setSouth;
        west = setWest;
        cellSize = setCellSize;
        northSouth =