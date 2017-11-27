package com.example.quizapp.marc.oliva.quizapp;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayResultFragment extends DialogFragment {


    public DisplayResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_display_result, container, false);
        setCancelable(false);

        ImageView stateImageView = rootView.findViewById(R.id.state_image_result);
        TextView stateTextView = rootView.findViewById(R.id.state_text);
        TextView correctAnswersTextView = rootView.findViewById(R.id.quantity_answers_correct_text);

        int quantity_answers_correct = MainActivity.quantity_answers_correct;

        correctAnswersTextView.setText("Respuestas Correctas : " + String.valueOf(quantity_answers_correct));

        if (quantity_answers_correct >= 6) {
            stateImageView.setImageResource(R.mipmap.happy_emoticon);
            stateTextView.setText(getString(R.string.state_happy));
        }
        if (quantity_answers_correct >= 3 && quantity_answers_correct < 6) {
            stateImageView.setImageResource(R.mipmap.sad_emoticon);
            stateTextView.setText(getString(R.string.state_sad));

        }
        if (quantity_answers_correct <= 2) {
            stateImageView.setImageResource(R.mipmap.cry_emoticon);
            stateTextView.setText(getString(R.string.state_cry));
        }

        FrameLayout okButton = rootView.findViewById(R.id.ok_button);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return rootView;

    }

}
