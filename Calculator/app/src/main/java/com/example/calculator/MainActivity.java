package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int Num1=0;int Num2=0;int Result=0;

        final EditText Num1ET=findViewById(R.id.Num1ET);Num1ET.requestFocus();Num1ET.setTextIsSelectable(true);
        final EditText Num2ET=findViewById(R.id.Num2ET);Num2ET.setTextIsSelectable(true);

        final TextView ResultTV=findViewById(R.id.ResultTV);
        Button OneB=findViewById(R.id.OneB);
        Button TwoB=findViewById(R.id.TwoB);
        Button ThreeB=findViewById(R.id.ThreeB);
        Button FourB=findViewById(R.id.FourB);
        Button FiveB=findViewById(R.id.FiveB);
        Button SixB=findViewById(R.id.SixB);
        Button SevenB=findViewById(R.id.SevenB);
        Button EightB=findViewById(R.id.EightB);
        Button NineB=findViewById(R.id.NineB);
        Button ZeroB=findViewById(R.id.ZeroB);
        Button PlusB=findViewById(R.id.PlusB);
        Button MinusB=findViewById(R.id.MinusB);
        Button MultiB=findViewById(R.id.MultiB);
        Button ClearB=findViewById(R.id.ClearB);
        Button DivB=findViewById(R.id.DivB);
        OneB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(Num1ET.hasFocus()) {
                  Num1ET.setText(Num1ET.getText().toString()+"1");
                  Num1ET.setSelection(Num1ET.length() );
              }
              else if(Num2ET.hasFocus())
              {
                  Num2ET.setText(Num2ET.getText().toString()+"1");
                  Num2ET.setSelection(Num2ET.length() );
              }



            }
        });
        TwoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"2");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"2");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
ThreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"3");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"3");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
FourB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"4");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"4");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
FiveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"5");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"5");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
SixB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"6");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"6");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
SevenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"7");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"7");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
EightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"8");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"8");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
NineB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    Num1ET.setText(Num1ET.getText().toString()+"9");
                    Num1ET.setSelection(Num1ET.length() );
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.setText(Num2ET.getText().toString()+"9");
                    Num2ET.setSelection(Num2ET.length() );
                }



            }
        });
ZeroB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Num1ET.hasFocus()) {
                    if(Num1ET.getText().length()==0)
                        Toast.makeText(MainActivity.this,"First Digit Zero Not Allowed",Toast.LENGTH_SHORT).show();
                    else {
                        Num1ET.setText(Num1ET.getText().toString() + "0");
                        Num1ET.setSelection(Num1ET.length());
                    }
                }
                else if(Num2ET.hasFocus())
                {
                    if(Num1ET.getText().length()==0)
                        Toast.makeText(MainActivity.this,"First Digit Zero Not Allowed",Toast.LENGTH_SHORT).show();
                    else {
                        Num2ET.setText(Num2ET.getText().toString() + "0");
                        Num2ET.setSelection(Num2ET.length());
                    }
                }



            }
        });
        PlusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Num1ET.getText().length()==0 || Num2ET.getText().length()==0 )
                    Toast.makeText(MainActivity.this,"Enter both number in correct form",Toast.LENGTH_SHORT).show();
                else {
                    int num1 = Integer.parseInt(Num1ET.getText().toString());
                    int num2 = Integer.parseInt(Num2ET.getText().toString());
                    ResultTV.setText(Integer.toString(num1 + num2));
                }


            }
        });
MinusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Num1ET.getText().length()==0 || Num2ET.getText().length()==0 )
                    Toast.makeText(MainActivity.this,"Enter both number in correct form",Toast.LENGTH_SHORT).show();
                else {
                    int num1 = Integer.parseInt(Num1ET.getText().toString());
                    int num2 = Integer.parseInt(Num2ET.getText().toString());
                    if(num1<num2)
                        Toast.makeText(MainActivity.this,"Number 1 should be greater than Number 2",Toast.LENGTH_SHORT).show();
                    else
                    ResultTV.setText(Integer.toString(num1 - num2));
                }


            }
        });
MultiB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Num1ET.getText().length()==0 || Num2ET.getText().length()==0 )
                    Toast.makeText(MainActivity.this,"Enter both number in correct form",Toast.LENGTH_SHORT).show();
                else {
                    int num1 = Integer.parseInt(Num1ET.getText().toString());
                    int num2 = Integer.parseInt(Num2ET.getText().toString());
                    ResultTV.setText(Integer.toString(num1 * num2));
                }


            }
        });
DivB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Num1ET.getText().length()==0 || Num2ET.getText().length()==0 )
                    Toast.makeText(MainActivity.this,"Enter both number in correct form",Toast.LENGTH_SHORT).show();
                else {
                    int num1 = Integer.parseInt(Num1ET.getText().toString());
                    int num2 = Integer.parseInt(Num2ET.getText().toString());
                    if(num2==0)
                        Toast.makeText(MainActivity.this,"Cant divided by zero",Toast.LENGTH_SHORT).show();
                    else {

                        double n1=Double.parseDouble(Num1ET.getText().toString());
                        double n2=Double.parseDouble(Num2ET.getText().toString());
                        double d= n1/n2;
                        ResultTV.setText(String.format("%.5f", d));
                    }
                }


            }



        });
ClearB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Num1ET.hasFocus()) {
                   Num1ET.getText().clear();
                }
                else if(Num2ET.hasFocus())
                {
                    Num2ET.getText().clear();
                }


            }



        });

    }
}
