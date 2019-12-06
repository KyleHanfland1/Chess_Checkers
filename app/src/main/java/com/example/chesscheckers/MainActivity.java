package com.example.chesscheckers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public float densityFactor;
    public static ImageView checkersboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button checkersButton = findViewById(R.id.checkersButton);
        CheckersPiece piece = new CheckersPiece(1, 4, 4);
        piece.getAllMoves();
        checkersboard = findViewById(R.id.checkerboard);
        densityFactor = getResources().getDisplayMetrics().density;

        checkersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.board);
                /**
                 * start checkers game
                 */
                CheckersBoard board = new CheckersBoard();
                Intent intent = new Intent(MainActivity.this, Board.class);
                MainActivity.this.startActivity(intent);



            }
        });
    }
}
