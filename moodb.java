package ibotbuilders.physicianapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class moodb extends AppCompatActivity {

    ImageButton enjoy, sad, ang, dis, fear, un;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodb);
        enjoy = (ImageButton) findViewById(R.id.enjoyment);
        enjoy.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               enjoy.setImageDrawable(getResources().getDrawable(R.drawable.enjoy2));
           }
        });
        sad = (ImageButton) findViewById(R.id.sad);
        ang = (ImageButton) findViewById(R.id.anger);
        dis = (ImageButton) findViewById(ibotbuilders.physicianapp.R.id.disgust);
        fear = (ImageButton) findViewById(R.id.fear);
        un = (ImageButton) findViewById(R.id.uncertain);
        setContentView(R.layout.activity_moodb);
        submit = (Button) findViewById(R.id.submit);
        submit.setBackgroundColor(Color.rgb(50,205,50));
        submit.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),moodslider.class);
                startActivity(i);
            }
        });

        /*good = (Button) findViewById(ibotbuilders.physicianapp.R.id.good);
        good.setBackgroundColor(Color.rgb(50,205,50));
        alright = (Button) findViewById(ibotbuilders.physicianapp.R.id.alright);
        alright.setBackgroundColor(Color.rgb(0,0,255));
        unsure = (Button) findViewById(ibotbuilders.physicianapp.R.id.unsure);
        unsure.setBackgroundColor(Color.rgb(211,211,211));
        unsure.setLinkTextColor(Color.BLACK);
        bad = (Button) findViewById(ibotbuilders.physicianapp.R.id.bad);
        bad.setBackgroundColor(Color.rgb(125,125,125));
        bad.setLinkTextColor(Color.BLACK);*/
        //enjoyment, sadness, anger, disgust, fear,





    }

}
