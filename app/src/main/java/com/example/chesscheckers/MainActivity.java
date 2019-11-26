package com.example.chesscheckers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button chessButton = findViewById(R.id.chessButton);
        Button checkersButton = findViewById(R.id.checkersButton);
        chessButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.board);
                /**
                 * start chess game
                 */

            }
        });
        checkersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.board);
                /**
                 * start checkers game
                 */
                CheckersBoard board = new CheckersBoard();
            }
        });
    }
}
