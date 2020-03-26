package com.example.androiddemoapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class DisplayMessageActivity extends AppCompatActivity {
    public void evaluateFontSizes () {
        TextView textView = findViewById(R.id.textView);
        if(MainActivity.fontOption1Checked == true)
            textView.setTextSize(8);
        else if(MainActivity.fontOption2Checked == true)
            textView.setTextSize(16);
        else if(MainActivity.fontOption3Checked == true)
            textView.setTextSize(24);
        else if(MainActivity.otherOption == true)
            textView.setTextSize(MainActivity.getOtherFontSize());
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        evaluateFontSizes();
        textView.setLetterSpacing(MainActivity.letterSpacing);
        textView.setTextColor(MainActivity.textColor);
        textView.setText(message);
    }

}
