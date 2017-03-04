package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Tanveer on 19-Feb-17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColourResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColourResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWordAdapter = getItem(position);

        TextView textView1 = (TextView) listItemView.findViewById(R.id.textView1);
        TextView textView2 = (TextView) listItemView.findViewById(R.id.textView2);


        textView1.setText(currentWordAdapter.getMiwokWord());
        textView2.setText(currentWordAdapter.getDefaultWord());
        // Checks if there is an image , if not it hde the image view
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWordAdapter.hasImage()) {
            imageView.setImageResource(currentWordAdapter.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        // get color and set it .
        textContainer.setBackgroundResource(mColourResourceId);
       // textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColourResourseId));
        return listItemView;
    }
}