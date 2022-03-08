package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, divide, modulus, equals, multiply, clear, dot;
    EditText display;

    double valueOne = 0, valueTwo = 0;

    boolean addition, subtraction, division, multiplication, mod, equation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.b1);
        two = (Button) findViewById(R.id.b2);
        three = (Button) findViewById(R.id.b3);
        four = (Button) findViewById(R.id.b4);
        five = (Button) findViewById(R.id.b5);
        six = (Button) findViewById(R.id.b6);
        seven = (Button) findViewById(R.id.b7);
        eight = (Button) findViewById(R.id.b8);
        nine = (Button) findViewById(R.id.b9);
        zero = (Button) findViewById(R.id.b0);
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bsub);
        multiply = (Button) findViewById(R.id.bmul);
        divide = (Button) findViewById(R.id.div);
        modulus = (Button) findViewById(R.id.BRemain);
        clear = (Button) findViewById(R.id.clear);
        equals = (Button) findViewById(R.id.buttoneql);
        dot = (Button) findViewById(R.id.bDot);
        display = (EditText) findViewById(R.id.display);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + ".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                //parseDouble returns e double value represented by string argument
                valueOne = Double.parseDouble(display.getText() + " ");
                addition = true;
                display.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                subtraction = true;
                display.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                equation = true;
                display.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                division = true;
                display.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                multiplication = true;
                display.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                equation = true;
                display.setText(null);
            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (display == null) {
                    display.setText("");
                }
                valueOne = Double.parseDouble(display.getText() + " ");
                mod = true;
                display.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueTwo = Double.parseDouble(display.getText() + "");

                if (addition == true) {
                    display.setText(valueOne + valueTwo + "");
                    addition = false;
                }

                if (subtraction == true) {
                    display.setText(valueOne - valueTwo + "");
                    subtraction = false;
                }
                if (multiplication == true) {
                    display.setText(valueOne * valueTwo + "");
                    subtraction = false;
                }
                if (division == true) {
                    display.setText(valueOne / valueTwo + "");
                    subtraction = false;
                }
                if (mod == true) {
                    display.setText(valueOne % valueTwo + "");
                    subtraction = false;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });

    }
}