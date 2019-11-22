package com.example.infs3634_appdev.ui.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.infs3634_appdev.Gm_Anagram;
import com.example.infs3634_appdev.Gm_Trivia;
import com.example.infs3634_appdev.R;

public class GamesFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_games, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Gm_Anagram.class);
                in.putExtra("some", "Welcome to Anagram!");
                startActivity(in);
            }
        });

        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), Gm_Trivia.class);
                in.putExtra("some", "Welcome to Anagram!");
                startActivity(in);
            }
        });
        return view;
    }
}