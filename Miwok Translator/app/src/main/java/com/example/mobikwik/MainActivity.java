 package com.example.mobikwik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);

        //set quick listner for that view//
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num = new Intent(MainActivity.this, NumbersClickListne.class);
                startActivity(num);
            }


            });
        //color//
        TextView color = (TextView)findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent col= new Intent(MainActivity.this,ColorActivity.class);
                startActivity(col);
            }
        });



    //Family//
TextView fam= (TextView)findViewById(R.id.family);
fam.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent fami= new Intent(MainActivity.this,Family.class);
        startActivity(fami);
    }
});
//phrases//
        TextView pha= (TextView)findViewById(R.id.phrases);
        pha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p= new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(p);

            }
        });



    }

}