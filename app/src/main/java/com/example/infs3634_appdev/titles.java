package com.example.infs3634_appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class titles extends AppCompatActivity {
    private TextView titleTextView;
    private TextView link1;
    private TextView link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titles);


        TextView text = findViewById(R.id.textView);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        Intent intent =getIntent();

        int LinkID = getIntent().getIntExtra("linkID", 0);

        Links links =linksDatabase.getLinkById(LinkID);

        titleTextView= findViewById(R.id.title);
        link1=findViewById(R.id.link1);
        link2=findViewById(R.id.link2);

        titleTextView.setText(links.getLinkDesc());
        link1.setText(links.getLink1());
        link2.setText(links.getLink2());
    }
}
