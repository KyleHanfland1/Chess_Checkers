package com.example.chesscheckers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Camera;
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
        densityFactor = getResources().getDisplayMetrics().density;
        checkersboard = findViewById(R.id.checkerBoard);
        final Button timerbutton = findViewById(R.id.timeButton);
        checkersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * start checkers game
                 */
                Intent intent = new Intent(MainActivity.this, CheckersActivity.class);
                intent.putExtra("timer", false);
                MainActivity.this.startActivity(intent);



            }
        });
        timerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.board);
                /**
                 * start checkers game
                 */
                Intent intent = new Intent(MainActivity.this, CheckersActivity.class);
                intent.putExtra("timer", true);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}