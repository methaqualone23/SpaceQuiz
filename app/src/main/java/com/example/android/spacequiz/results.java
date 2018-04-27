package com.example.android.spacequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.spacequiz.R.drawable;
import static com.example.android.spacequiz.R.id;
import static com.example.android.spacequiz.R.layout;
import static com.example.android.spacequiz.R.string;

public class results extends AppCompatActivity {
    public int totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_results);

        Intent thirdIntent = getIntent();
        thirdIntent.getIntExtra("TOTAL_SCORE", totalScore);

        TextView scoreTextView = findViewById(id.score);
        ImageView imageView = findViewById(id.drawable);
        TextView messageTextView = findViewById(id.message);


        if (totalScore >= 12) {
            scoreTextView.setText("Your score is: " + totalScore);
            messageTextView.getResources().getString(string.message_one);
            imageView.setBackgroundResource(drawable.first_rank);

        } else if (totalScore >= 6) {
            scoreTextView.setText("Your score is: " + totalScore);
            messageTextView.getResources().getString(string.message_two);
            imageView.setBackgroundResource(drawable.second_rank);

        } else if (totalScore >= 0) {
            scoreTextView.setText("Your score is: " + totalScore);
            messageTextView.getResources().getString(string.message_three);
            imageView.setBackgroundResource(drawable.third_rank);

        }

    }


    /*OnClick reset*/
    public void reset(View v) {
        Intent reset = new Intent(this, MainActivity.class);
        startActivity(reset);

    }

}



