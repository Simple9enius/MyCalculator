package com.example.android.calculatorpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    TextView text, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.input_text_view);
        result = findViewById(R.id.result_text_view);

    }

    public void result(View view) {
        Expression e = new ExpressionBuilder(text.getText().toString()).build();
        result.setText(String.valueOf(e.evaluate()));
    }

    public void clear(View view) {
        text.setText("");
        result.setText("0");
    }

    public void divide(View view) {
        text.setText(text.getText() + "/");
    }

    public void multiply(View view) {
        text.setText(text.getText().toString() + "*");
    }

    public void minus(View view) {
        text.setText(text.getText().toString() + "-");
    }

    public void plus(View view) {
        text.setText(text.getText().toString() + "+");
    }

    public void zero(View view) {
        text.setText(text.getText().toString() + "0");
    }

    public void one(View view) {
        text.setText(text.getText().toString() + "1");
    }

    public void two(View view) {
        text.setText(text.getText().toString() + "2");
    }

    public void three(View view) {
        text.setText(text.getText().toString() + "3");
    }

    public void four(View view) {
        text.setText(text.getText().toString() + "4");
    }

    public void five(View view) {
        text.setText(text.getText().toString() + "5");
    }

    public void six(View view) {
        text.setText(text.getText().toString() + "6");
    }

    public void seven(View view) {
        text.setText(text.getText().toString() + "7");
    }

    public void eight(View view) {
        text.setText(text.getText().toString() + "8");
    }

    public void nine(View view) {
        text.setText(text.getText().toString() + "9");
    }

    public void dot(View view) {
        text.setText(text.getText().toString() + ".");
    }

    public void backspace(View view) {
        text.setText(text.getText().toString().substring(0, text.getText().toString().length() - 1));
    }

    public void openBrackets(View view) {
        text.setText(text.getText().toString() + "(");
    }

    public void closeBrackets(View view) {
        text.setText(text.getText().toString() + ")");
    }

    public void sqrt(View view) {
        text.setText(text.getText().toString() + "SQRT(");
    }

    public void sin(View view) {
        text.setText(text.getText().toString() + "sin(");
    }

    public void cos(View view) {
        text.setText(text.getText().toString() + "cos(");
    }

    public void ln(View view) {
        text.setText(text.getText().toString() + "log(");
    }

    public void pow(View view) {
        text.setText(text.getText().toString() + "^");
    }

    public void coma(View view) {
        text.setText(text.getText().toString() + ",");
    }
}
