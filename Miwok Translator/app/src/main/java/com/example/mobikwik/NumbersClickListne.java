package com.example.mobikwik;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class NumbersClickListne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_click_listne);

     final    ArrayList<Wordd> words = new ArrayList<Wordd>();
       Wordd w= new Wordd("one","li",R.drawable.number_one,R.raw.number_one);
       words.add(w);
        words.add(new Wordd("two","nkr",R.drawable.number_two,R.raw.number_two));
   words.add(new Wordd("three","ferferg",R.drawable.number_three,R.raw.number_three));
   words.add(new Wordd("four","feferfer",R.drawable.number_four,R.raw.number_four));
        words.add(new Wordd("five","vfdferg",R.drawable.number_five,R.raw.number_five));
        words.add(new Wordd("six","fdfdsferg",R.drawable.number_six,R.raw.number_six));
        words.add(new Wordd("seven","adcdsvferg",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Wordd("eight","fg",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Wordd("nine","ddsvdsrferg",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Wordd("ten","fefbefvbre",R.drawable.number_ten,R.raw.number_ten));


       WordsAdapter item= new WordsAdapter(this, words);
       ListView l= (ListView) findViewById(R.id.list);
       l.setAdapter(item);
       l.setOnItemClickListener(new AdapterView.OnItemClickListener(){

           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           Wordd word= words.get(position);

               MediaPlayer m= MediaPlayer.create(NumbersClickListne.this,word.getmAudioId());
           m.start();


           }
       });




    }
}