package com.example.mobikwik;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        final ArrayList<Wordd> words = new ArrayList<Wordd>();
        Wordd w= new Wordd("red","li",R.raw.phrase_are_you_coming);
        words.add(w);
        words.add(new Wordd("blue","nkr",R.raw.phrase_come_here));
        words.add(new Wordd("brpwn","ferferg",R.raw.phrase_how_are_you_feeling));
        words.add(new Wordd("dusty yello","feferfer",R.raw.phrase_im_coming));
        words.add(new Wordd("gray","vfdferg",R.raw.phrase_im_feeling_good));
        words.add(new Wordd("greem","fdfdsferg",R.raw.phrase_lets_go));
        words.add(new Wordd("mustard yellow","adcdsvferg",R.raw.phrase_my_name_is));
        words.add(new Wordd("white","fg",R.raw.phrase_where_are_you_going));



        WordsAdapter ite= new WordsAdapter(this, words);
        ListView la= (ListView) findViewById(R.id.phrasess);
        la.setAdapter(ite);
        la.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Wordd word= words.get(position);

                MediaPlayer m= MediaPlayer.create(PhrasesActivity.this,word.getmAudioId());
                m.start();


            }
        });
    }
}