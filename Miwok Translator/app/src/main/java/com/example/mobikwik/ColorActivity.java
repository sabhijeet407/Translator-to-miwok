package com.example.mobikwik;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
      final   ArrayList<Wordd> words = new ArrayList<Wordd>();
        Wordd w= new Wordd("red","li",R.drawable.color_red,R.raw.color_red);
        words.add(w);
        words.add(new Wordd("blue","nkr",R.drawable.color_black,R.raw.color_black));
        words.add(new Wordd("brpwn","ferferg",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Wordd("dusty yello","feferfer",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Wordd("gray","vfdferg",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Wordd("greem","fdfdsferg",R.drawable.color_green,R.raw.color_green));
        words.add(new Wordd("mustard yellow","adcdsvferg",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Wordd("white","fg",R.drawable.color_white,R.raw.color_white));



        WordsAdapter ite= new WordsAdapter(this, words);
        ListView la= (ListView) findViewById(R.id.colorr);
        la.setAdapter(ite);
        la.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Wordd word= words.get(position);

                MediaPlayer m= MediaPlayer.create(ColorActivity.this,word.getmAudioId());
                m.start();


            }
        });


    }
}