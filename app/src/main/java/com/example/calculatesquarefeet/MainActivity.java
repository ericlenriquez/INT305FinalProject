package com.example.calculatesquarefeet;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText mNumAttendEditText;
    private EditText mNumAttendEditText2;
    private TextView mNumSquareFeetTextView;
    private TextView mNumSquareFeetPlusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the widgets to fields
        mNumAttendEditText = findViewById(R.id.attendEditText);
        mNumAttendEditText2 = findViewById(R.id.attendEditText2);
        mNumSquareFeetTextView = findViewById(R.id.answerTextView);
        mNumSquareFeetPlusTextView = findViewById(R.id.answerTextViewPlus);
        }

    public void calculateClick(View view) {

        // Get the text that was typed into the EditText
        String numAttendStr = mNumAttendEditText.getText().toString();
        String numAttendStr2 = mNumAttendEditText2.getText().toString();

        // Convert the text into an integer
        int numAttend = Integer.parseInt(numAttendStr);
        int numAttend2 = Integer.parseInt(numAttendStr2);

        // Calculate and show the number of square feet
        double totalSquareFeet = ((double) numAttend *  (double) numAttend2 / 144);
        mNumSquareFeetTextView.setText("Square Feet: " + totalSquareFeet);

        // Calculate and show the number of material square feet
        double materialSquareFeet = (((double) numAttend *  (double) numAttend2 / 144) * 1.10);
        mNumSquareFeetPlusTextView.setText("Material Square Feet: " + materialSquareFeet);
    }
}