package com.example.chesscheckers;

public class Location {
    int x;
    int y;
    Piece piece = null;
    public Location(int setX, int setY, Piece setPiece) {
        x = setX;
        y = setY;
        piece = setPiece;
    }


}
