package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv, buttonMul,
            buttonC, buttonEqual, buttonCE, buttonSign, buttonDecimal, buttonDelete;
    TextView answerView, equationView;
    float num1, num2, numAns;
    boolean funcAdd, funcSub, funcMul, funcDiv;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonSign = (Button) findViewById(R.id.buttonSign);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);

        answerView = (TextView) findViewById(R.id.answerView);
        equationView = (TextView) findViewById(R.id.equationView);

        button1.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("1");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "1");
            }
        });
        button2.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("2");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "2");
            }
        });
        button3.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("3");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "3");
            }
        });
        button4.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("4");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "4");
            }
        });
        button5.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("5");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "5");
            }
        });
        button6.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("6");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "6");
            }
        });
        button7.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("7");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "7");
            }
        });
        button8.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("8");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "8");
            }
        });
        button9.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("9");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "9");
            }
        });
        button0.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("0");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "0");
            }
        });
        buttonDecimal.setOnClickListener(v -> answerView.setText(answerView.getText() + "."));

        buttonAdd.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcAdd = true;
                equationView.setText(answerView.getText() + "+");
            }
            answerView.setText("");
        });

        buttonSub.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcSub = true;
                equationView.setText(answerView.getText() + "-");
            }
            answerView.setText("");
        });

        buttonMul.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcMul = true;
                equationView.setText(answerView.getText() + "*");
            }
            answerView.setText("");
        });

        buttonDiv.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcDiv = true;
                equationView.setText(answerView.getText() + "/");
            }
            answerView.setText("");
        });

        buttonEqual.setOnClickListener(v -> {
            num2 = Float.parseFloat(answerView.getText() + "");

            if (funcAdd) {
                numAns = num1 + num2;
                answerView.setText(numAns + "");
                equationView.setText(equationView.getText() + Float.toString(num2) + "=");
                funcAdd = false;
            }
            if (funcSub) {
                numAns = num1 - num2;
                answerView.setText(numAns + "");
                equationView.setText(equationView.getText() + Float.toString(num2) + "=");
                funcSub = false;
            }
            if (funcMul) {
                numAns = num1 * num2;
                answerView.setText(numAns + "");
                equationView.setText(equationView.getText() + Float.toString(num2) + "=");
                funcMul = false;
            }
            if (funcDiv) {
                numAns = num1 / num2;
                answerView.setText(numAns + "");
                equationView.setText(equationView.getText() + Float.toString(num2) + "=");
                funcDiv = false;
            }
        });

        buttonC.setOnClickListener(v -> answerView.setText(""));

        buttonCE.setOnClickListener(v -> {
            answerView.setText("");
            equationView.setText("");
            numAns = 0;
        });

        buttonDelete.setOnClickListener(v -> {
            String s = answerView.getText().toString();
            s = s.substring(0, s.length() - 1);
            answerView.setText(s);
        });
    }
}