package com.example.iphonecalculatorreplica;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    float num1, num2;
    boolean plus = false, minus = false, multiply = false, divide = false, percent = false;

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Intent intent = new Intent(this, Landscape.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        EditText et;
        Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnpoint,
                btnplus, btnminus, btnmultiply, btndivide, btnequal, btnac, btnpercent,
                btnplusminus;

        et = findViewById(R.id.et);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnpoint = findViewById(R.id.btnpoint);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivide = findViewById(R.id.btndivide);
        btnequal = findViewById(R.id.btnequal);
        btnac = findViewById(R.id.btnac);
        btnpercent = findViewById(R.id.btnpercent);
        btnplusminus = findViewById(R.id.btnplusminus);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText() + "9");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prev = et.getText().toString();
                if (prev.isEmpty()) {
                    et.setText("0.");
                    return;
                }
                if (prev.endsWith(".") || prev.contains(".")) {
                    return;
                }
                et.setText(et.getText() + ".");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().equals("-")) {
                    et.setText("");
                    return;
                }
                if (et.getText().toString().isEmpty()) {
                    return;
                }
                num1 = Float.parseFloat(et.getText() + "");
                plus = true;
                et.setText("");
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty()) {
                    et.setText("-");
                    return;
                }
                if (et.getText().toString().equals("-")) {
                    return;
                }
                num1 = Float.parseFloat(et.getText() + "");
                minus = true;
                et.setText("");
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty() || et.getText().toString().equals("-")) {
                    return;
                }
                num1 = Float.parseFloat(et.getText() + "");
                multiply = true;
                et.setText("");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty() || et.getText().toString().equals("-")) {
                    return;
                }
                num1 = Float.parseFloat(et.getText() + "");
                divide = true;
                et.setText("");
            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().isEmpty() || et.getText().toString().equals("-")) {
                    return;
                }
                num1 = Float.parseFloat(et.getText() + "");
                percent = true;
                et.setText("");
            }
        });
        btnplusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String prev = et.getText() + "";
                if (prev.startsWith("-")) {
                    et.setText(prev.substring(1));
                } else {
                    et.setText("-" + prev);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et.getText().toString().equals("") && percent) {
                    et.setText(num1 / 100 + "");
                    percent = false;
                }
                num2 = Float.parseFloat(et.getText() + "");

                if (plus) {
                    et.setText(num1 + num2 + "");
                    plus = false;
                } else if (minus) {
                    et.setText(num1 - num2 + "");
                    minus = false;
                } else if (multiply) {
                    et.setText(num1 * num2 + "");
                    multiply = false;
                } else if (divide) {
                    if (num2 == 0) {
                        et.setText("Error");
                        return;
                    }
                    et.setText(num1 / num2 + "");
                    divide = false;
                } else if (percent) {
                    et.setText(num1 / num2 * 100 + "");
                    percent = false;
                } else {
                    return;
                }
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
                plus = false;
                minus = false;
                multiply = false;
                divide = false;
                percent = false;
            }
        });
    }
}