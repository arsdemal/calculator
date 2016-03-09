package com.calculator.arseniy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textViewResult;
    private Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text1);
        textViewResult = (TextView) findViewById(R.id.text2);
        result = new Double(0);
    }

    public void onButtonClick(View view){

        String subText = null;
        subText = (String) textView.getText();

        switch (view.getId()) {
            case R.id.button1:
                textView.setText(subText.concat("1"));
                break;
            case R.id.button2:
                textView.setText(subText.concat("2"));
                break;
            case R.id.button3:
                textView.setText(subText.concat("3"));
                break;
            case R.id.button4:
                textView.setText(subText.concat("4"));
                break;
            case R.id.button5:
                textView.setText(subText.concat("5"));
                break;
            case R.id.button6:
                textView.setText(subText.concat("6"));
                break;
            case R.id.button7:
                textView.setText(subText.concat("7"));
                break;
            case R.id.button8:
                textView.setText(subText.concat("8"));
                break;
            case R.id.button9:
                textView.setText(subText.concat("9"));
                break;
            case R.id.button0:
                textView.setText(subText.concat("0"));
                break;
            case R.id.buttonC:
                textView.setText("");
                textViewResult.setText("");
                break;
            case R.id.buttonBracketLeft:
                textView.setText(subText.concat("("));
                break;
            case R.id.buttonBracketRight:
                textView.setText(subText.concat(")"));
                break;
            case R.id.buttonPlus:
                textView.setText(subText.concat("+"));
                break;
        }
    }
}
