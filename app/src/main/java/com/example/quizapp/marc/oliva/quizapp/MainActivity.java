package com.example.quizapp.marc.oliva.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public static int quantity_answers_correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton answerOneRb = findViewById(R.id.answer_one_rb);
        final EditText answerTwoEt = findViewById(R.id.answer_two_et);
        final EditText answerThreeEt = findViewById(R.id.answer_three_et);
        final RadioButton answerFourRb = findViewById(R.id.answer_four_rb);
        final EditText answerFiveEt = findViewById(R.id.answer_five_et);
        final RadioButton answerSixRb = findViewById(R.id.answer_six_rb);
        final RadioButton answerSevenRb = findViewById(R.id.answer_seven_rb);
        final RadioButton answerEightRb = findViewById(R.id.answer_eight_rb);

        FrameLayout resulButton = findViewById(R.id.display_result_bt);
        resulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity_answers_correct = 0;
                if (answerOneRb.isChecked()) {
                    quantity_answers_correct++;
                }
                if (answerTwoEt.getText().toString().isEmpty()) {
                } else {
                    if (answerTwoEt.getText().toString().toLowerCase().equals("grecia")) {
                        quantity_answers_correct++;
                    }
                }
                if (answerThreeEt.getText().toString().isEmpty()) {
                } else {
                    if (answerThreeEt.getText().toString().toLowerCase().equals("italia")) {
                        quantity_answers_correct++;
                    }
                }
                if (answerFourRb.isChecked()) {
                    quantity_answers_correct++;
                }
                if (answerFiveEt.getText().toString().isEmpty()) {
                } else {
                    if (Integer.valueOf(answerFiveEt.getText().toString()) == 1492) {
                        quantity_answers_correct++;
                    }
                }
                if (answerSixRb.isChecked()) {
                    quantity_answers_correct++;
                }
                if (answerSevenRb.isChecked()) {
                    quantity_answers_correct++;
                }
                if (answerEightRb.isChecked()) {
                    quantity_answers_correct++;
                }
                //show dialog fragment
                DisplayResultFragment displayResultFragment = new DisplayResultFragment();
                displayResultFragment.show(getSupportFragmentManager(), "display_result");

            }
        });


    }

}
