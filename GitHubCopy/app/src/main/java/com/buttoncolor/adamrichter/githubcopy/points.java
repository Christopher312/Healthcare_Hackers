package com.buttoncolor.adamrichter.githubcopy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class points extends AppCompatActivity {
    Button home;
    boolean temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        temp = true;
        home = (Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View view) {
                                        Intent i = new Intent(getApplicationContext(), profile.class);
                                        startActivity(i);


                                    }
                                }
        );
    }

}
