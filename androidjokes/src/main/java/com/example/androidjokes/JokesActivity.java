package com.example.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        jokeText = findViewById(R.id.joke_text);
        Intent intent = getIntent();
        if (intent.hasExtra("joke")) {
            jokeText.setText(intent.getStringExtra("joke"));
        }
    }
}
