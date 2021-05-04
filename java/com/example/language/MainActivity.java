package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the numbers category
        TextView num = (TextView) findViewById(R.id.numbers);
// Set a click listener on that View
        if (num != null) {
            num.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The code in this method will be executed when the numbers View is clicked on.
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }

            });
        }
        TextView fam = (TextView) findViewById(R.id.family);
// Set a click listener on that View
        if (fam != null) {
            fam.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The code in this method will be executed when the family View is clicked on.
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                }

            });
        }
        TextView color = (TextView) findViewById(R.id.colors);
// Set a click listener on that View
        if (color != null) {
            color.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The code in this method will be executed when the colors View is clicked on.
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }

            });
        }
        TextView phrase = (TextView) findViewById(R.id.phrases);
// Set a click listener on that View
        if (phrase != null) {
            phrase.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // The code in this method will be executed when the phrases View is clicked on.
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }

            });
        }
    }
}

