package com.example.tinku.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button equ;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button clr;
    TextView control;
    TextView result;
    final char ADDITION = '+';
    final char SUBTRACTION = '-';
    final char MULTIPLICATION = '*';
    final char DIVISION = '/';
    final char EQU = '=';

    char ACTION;
    double  val1 = Double.NaN;
    double val2 = Double.NaN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIView();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                control.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1)+"-");
                control.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1)+"*");
                control.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1)+"/");
                control.setText(null);
            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION=EQU;
                result.setText(result.getText().toString()+String.valueOf(val2)+" = "+ String.valueOf(val1));
                control.setText(null);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(control.getText().length() > 0){
                    CharSequence name = control.getText().toString();
                    control.setText(name.subSequence(0,name.length()-1));

                }else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    control.setText(null);
                    result.setText(null);
                }
            }
        });

    }
    private void setupUIView(){
        one = findViewById(R.id.btn1);
        two = findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five = findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        zero = findViewById(R.id.btn0);
        equ = findViewById(R.id.btnequ);
        clr = findViewById(R.id.btnclr);
        add = findViewById(R.id.btnadd);
        sub = findViewById(R.id.btnsub);
        mul = findViewById(R.id.btnmul);
        div = findViewById(R.id.btndiv);
        control = findViewById(R.id.control);
        result = findViewById(R.id.result);



    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(control.getText().toString());
            switch(ACTION){
                case ADDITION:
                    val1= val1+val2;
                    break;
                case SUBTRACTION:
                    val1 = val1-val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1*val2;
                    break;
                case DIVISION:
                    val1 = val1/val2;
                    break;
                case EQU:
                    break;
            }
        }else{
            val1=Double.parseDouble(control.getText().toString());
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case (R.id.btn0):
        }

    }
}
