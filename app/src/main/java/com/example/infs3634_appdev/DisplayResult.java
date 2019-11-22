package com.example.infs3634_appdev;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayResult extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_screen);

        TextView your_score = (TextView) findViewById(R.id.score);



        Intent mint = getIntent();

        String value =  mint.getStringExtra("total");
        String s = mint.getStringExtra("user_name");


        your_score.setText("Your Total Score is " + value);

}
}

