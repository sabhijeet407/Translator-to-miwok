package com.example.mobikwik;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Wordd> words = new ArrayList<Wordd>();
        Wordd w= new Wordd("daughter","li",R.drawable.family_daughter,R.raw.family_daughter);
        words.add(w);
        words.add(new Wordd("father","nkr",R.drawable.family_father,R.raw.family_father));
        words.add(new Wordd("grandfather","ferferg",R.drawable.family_grandfather,R.raw.family_grandfather));
        words.add(new Wordd("grandmother","feferfer",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Wordd("mother","vfdferg",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Wordd("older brother","fdfdsferg",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Wordd("older sister","adcdsvferg",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Wordd("son","fg",R.drawable.family_son,R.raw.family_son));
        words.add(new Wordd("younger brother","ddsvdsrferg",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Wordd("younger sister","fefbefvbre",R.drawable.family_younger_sister,R.raw.family_younger_sister));


        WordsAdapter item= new WordsAdapter(this, words);
        ListView fam=(ListView)findViewById(R.id.familyy);;
        fam.setAdapter(item);
        fam.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Wordd word= words.get(position);

                MediaPlayer m= MediaPlayer.create(Family.this,word.getmAudioId());
                m.start();


            }
        });


    }
}