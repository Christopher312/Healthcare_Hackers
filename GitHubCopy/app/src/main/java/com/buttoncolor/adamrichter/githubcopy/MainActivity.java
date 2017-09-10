package com.buttoncolor.adamrichter.githubcopy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Send, Mood;
    ImageButton profile;
    TextView Mood1Head, Mood2Head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Send = (Button) findViewById(R.id.Send);
        Mood = (Button) findViewById(R.id.Mood);
        Mood.setBackgroundColor(Color.GREEN);
        Mood.setOnClickListener(new View.OnClickListener(){
                                    public void onClick(View v){
                                        Intent i = new Intent(getApplicationContext(), moodb.class);
                                        startActivity(i);
                                    }
                                }
        );
        profile = (ImageButton)findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View v){
                                           Intent i = new Intent(getApplicationContext(), profile.class);
                                           startActivity(i);
                                       }
                                   }
        );

    }


}

