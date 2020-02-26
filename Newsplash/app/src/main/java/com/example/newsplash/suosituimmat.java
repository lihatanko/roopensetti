package com.example.newsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class suosituimmat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Iltalehti");
        setContentView(R.layout.activity_suosituimmat);


        final String[] UUTISET = new String[]{
                "Olet mitä syöt -ohjelmassa levitellään viikon ruokaröykkiöt ronskisti pöydälle – nyt tuottaja vastaa katsojia askarruttaneeseen kysymykseen ruokien kohtalosta", "Ulkoministeri Pekka Haaviston toimista al-Hol-asiassa aloitetaan esitutkinta"
        };
        ListView uutisview = (ListView) findViewById(R.id.uutiset);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,UUTISET);
        uutisview.setAdapter(aa);
    }


}
