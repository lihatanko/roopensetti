package com.example.newsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class suosituimmat2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Kaleva");
        setContentView(R.layout.activity_suosituimmat2);

        final String[] UUTISET2 = new String[]{
                "Olet mitä syöt -ohjelmassa levitellään viikon ruokaröykkiöt ronskisti pöydälle – nyt tuottaja vastaa katsojia askarruttaneeseen kysymykseen ruokien kohtalosta", "Ulkoministeri Pekka Haaviston toimista al-Hol-asiassa aloitetaan esitutkinta"
        };
        ListView uutisview = (ListView) findViewById(R.id.uutiset2);
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,UUTISET2);
        uutisview.setAdapter(aa);
    }
}
