package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word ("Wha is your name?", "tinnǝ oyaase'nǝ", R.raw.phrase_what_is_your_name));
        words.add(new Word ("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word ("How are you feeling?", "michǝksǝs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word ("I'm feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word ("Are you coming?", "ǝǝnǝs'aa", R.raw.phrase_are_you_coming));
        words.add(new Word ("Yes, I'm coming.", "hǝǝ'ǝǝnǝm", R.raw.phrase_yes_im_coming));
        words.add(new Word ("I'm coming.", "ǝǝnǝm", R.raw.phrase_im_coming));
        words.add(new Word ("Let's go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word ("Come here.", "ǝnni'nem", R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                releaseMediaPlayer();
                player = MediaPlayer.create(Phrases.this, words.get(i).getSoundId());
                player.start();
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }

    private void releaseMediaPlayer () {
        if (player != null){
            player.release();
        }
        player = null;


    }
}