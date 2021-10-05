package com.example.demoapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button1 = (Button) this.findViewById(R.id.button1);
        this.button2 = (Button) this.findViewById(R.id.button2);
        this.button3 = (Button) this.findViewById(R.id.button3);
        this.button4 = (Button) this.findViewById(R.id.button4);
        this.button5 = (Button) this.findViewById(R.id.button5);
         button1.setOnClickListener( new Button.OnClickListener(){
             @Override
             public void onClick(View view) {
                   Intent myIntent = new Intent(MainActivity.this, Activityexample1.class);
                   myIntent.putExtra("text1","this is text1 send from Activity at "+ new Date());
                   myIntent.putExtra("text2","this is text2 sent from Activity at "+new Date());
                   MainActivity.this.startActivity(myIntent);
             }
         });
          button2.setOnClickListener( new Button.OnClickListener(){
              @Override
              public void onClick(View view) {
                  Intent myIntent = new Intent(MainActivity.this, Activityexample2.class);
                  MainActivity.this.startActivity(myIntent);
              }
          });
          button3.setOnClickListener(new Button.OnClickListener(){
              @Override
              public void onClick(View view) {
                    Intent myIntent = new Intent(MainActivity.this, Activityexample3.class);
                    MainActivity.this.startActivity(myIntent);
              }
          });

          button4.setOnClickListener(new Button.OnClickListener(){
              @Override
              public void onClick(View view) {
                  Intent myIntent = new Intent(MainActivity.this, Activityexample4.class);
                  MainActivity.this.startActivity(myIntent);
              }
          });
          button5.setOnClickListener(new Button.OnClickListener(){
              @Override
              public void onClick(View view) {
                  Intent myIntent = new Intent(MainActivity.this, Activityexample5.class);
                  MainActivity.this.startActivity(myIntent);
              }
          });



    }


}