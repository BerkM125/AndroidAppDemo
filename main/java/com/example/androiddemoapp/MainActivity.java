package com.example.androiddemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.androiddemoapp.MESSAGE";
    public static boolean fontOption1Checked;
    public static boolean fontOption2Checked;
    public static boolean fontOption3Checked;
    public static boolean otherOption;
    public static String otherFontSize;
    public static float letterSpacing;
    public static int textColor = Color.BLACK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void QuitApp(View view) {
        MainActivity.this.finish();
        System.exit(0);
    }
    public static float getOtherFontSize() {
        return Float.parseFloat(otherFontSize);
    }
    public static boolean getOption1Checked () {
        return fontOption1Checked;
    }
    public static boolean getOption2Checked () {
        return fontOption2Checked;
    }
    public static boolean getOption3Checked () {
        return fontOption3Checked;
    }
    public void useOtherFontSize(View view) {
        RadioButton fontOption1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fontOption2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton fontOption3 = (RadioButton) findViewById(R.id.radioButton3);
        fontOption1.setChecked(false);
        fontOption2.setChecked(false);
        fontOption3.setChecked(false);
        otherOption = true;
    }
    public void checkFont1(View view) {
        RadioButton fontOption1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fontOption2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton fontOption3 = (RadioButton) findViewById(R.id.radioButton3);
        fontOption2.setChecked(false);
        fontOption3.setChecked(false);
        otherOption = false;
    }
    public void checkFont2(View view) {
        RadioButton fontOption1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fontOption2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton fontOption3 = (RadioButton) findViewById(R.id.radioButton3);
        fontOption1.setChecked(false);
        fontOption3.setChecked(false);
        otherOption = false;
    }
    public void checkFont3(View view) {
        RadioButton fontOption1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fontOption2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton fontOption3 = (RadioButton) findViewById(R.id.radioButton3);
        fontOption2.setChecked(false);
        fontOption1.setChecked(false);
        otherOption = false;
    }
    public void checkTurquoiseColor(View view) {
        RadioButton colorOption2 = (RadioButton) findViewById(R.id.radioButton6);
        RadioButton colorOption3 = (RadioButton) findViewById(R.id.radioButton7);
        colorOption2.setChecked(false);
        colorOption3.setChecked(false);
        textColor = Color.rgb(3, 218, 197);
    }
    public void checkBlueColor(View view) {
        RadioButton colorOption1 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton colorOption3 = (RadioButton) findViewById(R.id.radioButton7);
        colorOption1.setChecked(false);
        colorOption3.setChecked(false);
        textColor = Color.rgb(0,0,255);
    }
    public void checkOrangeColor(View view) {
        RadioButton colorOption1 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton colorOption2 = (RadioButton) findViewById(R.id.radioButton6);
        colorOption2.setChecked(false);
        colorOption1.setChecked(false);
        textColor = Color.rgb(241, 122, 10);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Spinner letterSpacingSpinner = (Spinner) findViewById(R.id.spinner);
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText otherFontSizeText = (EditText) findViewById(R.id.editText2);
        RadioButton fontOption1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fontOption2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton fontOption3 = (RadioButton) findViewById(R.id.radioButton3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        fontOption1Checked = fontOption1.isChecked();
        fontOption2Checked = fontOption2.isChecked();
        fontOption3Checked = fontOption3.isChecked();
        otherFontSize = otherFontSizeText.getText().toString();
        letterSpacing = Float.parseFloat(String.valueOf(letterSpacingSpinner.getSelectedItem()));
        startActivity(intent);
    }
}

