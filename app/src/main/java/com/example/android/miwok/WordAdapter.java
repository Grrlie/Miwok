package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/**
 * Created by nwhor on 4/23/2017.
 */

public class WordAdapter extends ArrayAdapter <Word>{

    int colorId;

    MediaPlayer player;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        this.colorId = color;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        View textContainer = listItemView.findViewById(R.id.background);
        int color = ContextCompat.getColor(getContext(), colorId);
        textContainer.setBackgroundColor(color);

        Word currentWordSet = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWordSet.getMiwokWord());

        TextView engTextView = (TextView) listItemView.findViewById(R.id.english_text);
        engTextView.setText(currentWordSet.getEngWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWordSet.hasImage())
            imageView.setImageResource(currentWordSet.getImageId());
        else
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
