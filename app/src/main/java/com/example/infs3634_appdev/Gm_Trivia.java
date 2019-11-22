package com.example.infs3634_appdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;


public class Gm_Trivia extends Activity {

    String[] questions;
    int[][] answers;
    int queue[]=new int[6];
    int numberofquestioncomplete = 0;
    int answerlog[] = new int[5];
    int anscnt = 0;
    int correct_ans_count;
    int correct_answer[] = new int[10];
    String user_name;

    private int[] random_number_generator(){
        int question_list[] = new int[6];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<6; i++) {
            question_list[i] = list.get(i);
        }

        return question_list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gm__trivia);

        questions= new String[] {"What is the best Synonym for bad?\n1. AWFUL     2. GOOD\n3. FORTUNATE     4. TRUE",
                "What is the best antonym for increase?\n1. RISE     2. FLOW\n3. GAIN     4. DECLINE",
                "The police _____ was really brave.\n1. OFICER     2. OFFICER\n3. OPHICER     4. OPHFICER",
                "I ___ my chocolate at school.\n1. ATE     2. EIGHT\n3. EAT     4. AET",
                "What is the best synonym for guilty?\n1. SICK     2. WRONG\n3. SURPRISED     4. FUNNY",
                "What is the synonym of impunity?\n1. PUNISHMENT\n2. EXEMPTION\n3. COST     4. CRITICISM",
                "A ____ can be harmful.\n1. DIESEASE     2. DIESEAS\n3. DISEASE     4. DEASEASE",
                "Yawning is very _____.\n1. CONTAGEOUS     2. CONTAGIOUS\n3. COUNTAGIOUS     4. CANTAGIOUS",
                "The sun looks so ____ today!\n1. BRIGHT     2. BRITE\n3. BARITE     4. BRIGHTE",
                "What is the best synonym for excessive?\n1. EXCLUSIVE     2. EXTERNAL\n3. EXTREME     4. EXPENSIVE"};

        answers= new int[][] {
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numone},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numfour},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numtwo},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numone},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numtwo},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numtwo},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numthree},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numtwo},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numone},
                {R.drawable.numone, R.drawable.numtwo, R.drawable.numthree, R.drawable.numfour, R.drawable.numthree}
        };
        correct_answer[0] = 0;
        correct_answer[1] = 3;
        correct_answer[2] = 1;
        correct_answer[3] = 0;
        correct_answer[4] = 1;
        correct_answer[5] = 1;
        correct_answer[6] = 1;
        correct_answer[7] = 1;
        correct_answer[8] = 0;
        correct_answer[9] = 2;

        queue = random_number_generator();
        displayquestion();
    }

    public void displayquestion () {
        if(anscnt <=4) {
            TextView ques = (TextView) findViewById(R.id.lbl_question);
            ImageButton opt1 = (ImageButton) findViewById(R.id.option1);
            ImageButton opt2 = (ImageButton) findViewById(R.id.option2);
            ImageButton opt3 = (ImageButton) findViewById(R.id.option3);
            ImageButton opt4 = (ImageButton) findViewById(R.id.option4);

            ques.setText(questions[queue[numberofquestioncomplete]]);
            opt1.setImageResource(answers[queue[numberofquestioncomplete]][0]);
            opt2.setImageResource(answers[queue[numberofquestioncomplete]][1]);
            opt3.setImageResource(answers[queue[numberofquestioncomplete]][2]);
            opt4.setImageResource(answers[queue[numberofquestioncomplete]][3]);


            numberofquestioncomplete++;}
    }

     public void onClickCard(View view) {
        anscnt++;
        if (anscnt >= 5) {


            Intent i = getIntent();
            String user_name = i.getStringExtra("name");
            Intent intd = new Intent(getApplicationContext(), DisplayResult.class);
            intd.putExtra("user_name",user_name);
            intd.putExtra("total", Integer.toString(correct_ans_count));
            startActivity(intd);
        }

        ImageButton opt1 = (ImageButton) findViewById(R.id.option1);
        ImageButton opt2 = (ImageButton) findViewById(R.id.option2);
        ImageButton opt3 = (ImageButton) findViewById(R.id.option3);
        ImageButton opt4 = (ImageButton) findViewById(R.id.option4);


        if (anscnt < 5) {
            if (opt1.isPressed() == true) {
                if((correct_answer[queue[numberofquestioncomplete-1]] == 0 )){ correct_ans_count++;}
                //ans
            }
            if (opt2.isPressed() == true) {
                if((correct_answer[queue[numberofquestioncomplete-1]] == 1)){ correct_ans_count++;}
                //anscnt++;

            }
            if (opt3.isPressed() == true) {
                if(correct_answer[queue[numberofquestioncomplete-1]] == 2){correct_ans_count++;}
                // anscnt++;
            }
            if (opt4.isPressed() == true) {
                if(correct_answer[queue[numberofquestioncomplete-1]] == 3){correct_ans_count++;}
                //anscnt++;
            }
        }
        if(anscnt < 5)
        {
            displayquestion();
        }

    }
}

