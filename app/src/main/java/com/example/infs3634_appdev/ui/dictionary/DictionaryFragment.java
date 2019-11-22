package com.example.infs3634_appdev.ui.dictionary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.infs3634_appdev.R;

public class DictionaryFragment extends Fragment {


    String url;
    private EditText enterWord;
    private TextView showDef;
    private View view;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dictionary, container, false);
        //return inflater.inflate(R.layout.fragment_dictionary, container, false);
        showDef = view.findViewById(R.id.showDef);
        enterWord = view.findViewById(R.id.enterWord);



       Button findBtn = (Button) view.findViewById(R.id.findBtn);

        findBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetDictionaryData dR = new GetDictionaryData(getContext(), showDef);
                url= dictionaryEntries();
                dR.execute(url);
                }});


//        Button button1 = (Button) view.findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in = new Intent(getActivity(), Gm_Trivia.class);
//                in.putExtra("some", "Welcome to Anagram!");
//                startActivity(in);
//            }
//        });








//            @Override
//            public void onClick(View v) {
//                startActivity(sendRequestOnClick(View v));
//                Intent in = new Intent(getActivity(), Gm_Anagram.class);
//                in.putExtra("some", "Welcome to Anagram!");
//                startActivity(in);
//            }
//        });

        return view;

    }



//    public void findBtn(View view){
//
//    }

//    private Intent sendRequestOnClick(View v) {
//    }

//    public void sendRequestOnClick(View v){
//        GetDictionaryData dR = new GetDictionaryData(getContext(), showDef);
//        url= dictionaryEntries();
//        dR.execute(url);
//    }


    //final RequestQueue requestQueue =  Volley.newRequestQueue(getActivity());

    private String dictionaryEntries() {
        final String language = "en-gb";
        final String word = enterWord.getText().toString();
        final String fields = "definitions";
        final String strictMatch = "false";
        final String word_id = word.toLowerCase();
        return "https://od-api.oxforddictionaries.com/api/v2/entries/" + language +
                "/" + word_id + "?" + "fields=" + fields + "&strictMatch=" + strictMatch;
    }











    private  void sendRequestOnClick(View v) {
        GetDictionaryData dR = new GetDictionaryData(getContext(), showDef);
        url= dictionaryEntries();
        dR.execute(url);
    }
    }