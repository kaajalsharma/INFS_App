package com.example.infs3634_appdev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Gm_Anagram extends AppCompatActivity implements View.OnClickListener{

        private TextView wordTv;
        private EditText wordEnteredTv;
        private Button validate, newGame;
        private String wordToFind;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_gm__anagram);
            wordTv = (TextView) findViewById(R.id.wordTv);
            wordEnteredTv = (EditText) findViewById(R.id.wordEnteredEt);
            validate = (Button) findViewById(R.id.validate);
            validate.setOnClickListener(this);
            newGame = (Button) findViewById(R.id.newGame);
            newGame.setOnClickListener(this);

            newGame();
        }

        @Override
        public void onClick(View view) {
            if (view == validate) {
                validate();
            } else if (view == newGame) {
                newGame();
            }
        }

        private void validate() {
            String w = wordEnteredTv.getText().toString();

            if (wordToFind.equals(w)) {
                Toast.makeText(this, "Congratulations ! You found the word " + wordToFind, Toast.LENGTH_SHORT).show();
                newGame();
            } else {
                Toast.makeText(this, "Retry !", Toast.LENGTH_SHORT).show();
            }
        }

        private void newGame() {
            wordToFind = Anagram_Data.randomWord();
            String wordShuffled = Anagram_Data.shuffleWord(wordToFind);
            wordTv.setText(wordShuffled);
            wordEnteredTv.setText("");
        }
    }