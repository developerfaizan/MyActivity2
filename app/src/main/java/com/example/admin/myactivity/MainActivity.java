package com.example.admin.myactivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent numbersIntents = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntents);
            }

        });
        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent familyIntents = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntents);
            }

        });

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent colorsIntents = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntents);
            }

        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent phrasesIntents = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntents);
            }

        });
    }

}
