package com.example.android.spacequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


public class questions extends AppCompatActivity {

    public int Q1Score = 0;
    public int Q2Score = 0;
    public int Q3Score = 0;
    public int Q4Score = 0;
    public int Q5Score = 0;
    public int Q6Score = 0;
    public int Q7Score = 0;
    public int Q8Score = 0;
    public int Q9Score = 0;
    public int Q10Score = 0;
    public int totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Intent nextScreen = getIntent();

    }



    /* Check results after submission.*/

    public void submit() {

        /* Q1*/

        EditText userQ1A = findViewById(R.id.answer_one);
        String Q1A = userQ1A.getText().toString();
        if (Q1A.equalsIgnoreCase(getResources().getString(R.string.question_one_answer))) {
            Q1Score = 1;
        }

        /* Q2*/

        RadioButton q2A = this.findViewById(R.id.radio_pluto);
        boolean checkedQ2A = q2A.isChecked();
        if (checkedQ2A) {
            Q2Score = 1;
        }

        /* Q3*/

        CheckBox userQ3A4 = findViewById(R.id.checkbox_mercury);
        boolean checkedQ3A4 = userQ3A4.isChecked();

        CheckBox userQ3A7 = findViewById(R.id.checkbox_venus);
        boolean checkedQ3A7 = userQ3A7.isChecked();
        if (checkedQ3A4 && checkedQ3A7) {
            Q3Score = 1;
        }

        /* Q4*/

        RadioButton q4A = findViewById(R.id.radio_armstrong);
        boolean checkedQ4A = q4A.isChecked();
        if (checkedQ4A) {
            Q4Score = 1;
        }

        /* Q5*/

        RadioButton q5A = findViewById(R.id.radio_wormhole);
        boolean checkedQ5A = q5A.isChecked();
        if (checkedQ5A) {
            Q5Score = 1;
        }

        /* Q6*/

        RadioButton q6A = findViewById(R.id.radio_canis_majoris);
        boolean checkedQ6A = q6A.isChecked();
        if (checkedQ6A) {
            Q6Score = 2;
        }

        /* Q7*/

        RadioButton q7A = findViewById(R.id.radio_new_horizon);
        boolean checkedQ7A = q7A.isChecked();
        if (checkedQ7A) {
            Q7Score = 2;
        }

        /* Q8*/

        RadioButton q8A = findViewById(R.id.radio_yellow_dwarf);
        boolean checkedQ8A = q8A.isChecked();
        if (checkedQ8A) {
            Q8Score = 2;
        }

        /* Q9*/

        CheckBox userQ9A1 = findViewById(R.id.checkbox_parsec);
        boolean checkedQ9A1 = userQ9A1.isChecked();

        CheckBox userQ9A3 = findViewById(R.id.checkbox_light_year);
        boolean checkedQ9A3 = userQ9A3.isChecked();

        CheckBox userQ9A4 = findViewById(R.id.checkbox_lightspeed);
        boolean checkedQ9A4 = userQ9A4.isChecked();
        if (checkedQ9A1 && checkedQ9A3 && checkedQ9A4) {
            Q9Score = 3;
        }

        /* Q10*/

        RadioButton q10A = findViewById(R.id.radio_dark_energy);
        boolean checkedQ10A = q10A.isChecked();
        if (checkedQ10A) {
            Q10Score = 3;
        }

    }


    public void submit(View v) {
        totalScore = Q1Score + Q2Score + Q3Score + Q4Score + Q5Score + Q6Score + Q7Score + Q8Score + Q9Score + Q10Score;
        Log.v("SCORE", "score: " + totalScore);
        Intent resultsIntent = new Intent(this, results.class);
        resultsIntent.putExtra("TOTAL_SCORE", totalScore);
        startActivity(resultsIntent);
    }


}






