package com.example.demoapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activityexample1 extends AppCompatActivity {
   private Button buttonClickMe;
   private Button buttonBack;
   private TextView textView;
   private TextView textView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityexample1);
        this.textView = (TextView) this.findViewById(R.id.textView);
        this.textView2 = (TextView) this.findViewById(R.id.textView2);
        this.buttonClickMe = (Button) this.findViewById(R.id.button01);
        this.buttonBack = (Button) this.findViewById(R.id.button02);
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("text1");
        String value2 = intent.getStringExtra("text2");
        this.textView.setText(value1);
        this.textView2.setText(value2);
         this.buttonClickMe.setOnClickListener(new Button.OnClickListener(){
             @Override
             public void onClick(View view) {
                 textView2.setText("You click button");
             }
         });
         this.buttonClickMe.setOnLongClickListener(new Button.OnLongClickListener(){
             @Override
             public boolean onLongClick(View view) {
                 textView2.setText("You long click button");
                 return true;
             }
         });
         this.buttonBack.setOnClickListener(new Button.OnClickListener(){
             @Override
             public void onClick(View view) {
                 Activityexample1.this.finish();
             }
         });



    }
}