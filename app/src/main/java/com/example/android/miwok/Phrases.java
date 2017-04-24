package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word ("Wha is your name?", "tinnǝ oyaase'nǝ"));
        words.add(new Word ("My name is...", "oyaaset..."));
        words.add(new Word ("How are you feeling?", "michǝksǝs?"));
        words.add(new Word ("I'm feeling good.", "kuchi achit"));
        words.add(new Word ("Are you coming?", "ǝǝnǝs'aa"));
        words.add(new Word ("Yes, I'm coming.", "hǝǝ'ǝǝnǝm"));
        words.add(new Word ("I'm coming.", "ǝǝnǝm"));
        words.add(new Word ("Let's go.", "yoowutis"));
        words.add(new Word ("Come here.", "ǝnni'nem"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}