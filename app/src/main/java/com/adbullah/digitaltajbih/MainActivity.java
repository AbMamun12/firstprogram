package com.adbullah.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button add, sub, reset;
    int count =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView= findViewById(R.id.textView);
         add=findViewById(R.id.add);
         sub= findViewById(R.id.sub);
         reset=findViewById(R.id.reset);



         //................................................



         add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 count=count+1;
                 textView.setText(""+count);



             }
         });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (count==0 ){
                 count = 0;
                 textView.setText("" + count);
             }
             else
                count=count-1;
                textView.setText(""+count);


            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                textView.setText(""+count);


            }
        });


    }
}