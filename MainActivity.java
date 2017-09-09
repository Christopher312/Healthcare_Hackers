package ibotbuilders.physicianapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button Send, Mood;
    TextView Mood1Head, Mood2Head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Send = (Button) findViewById(ibotbuilders.physicianapp.R.id.Send);
        Mood = (Button) findViewById(ibotbuilders.physicianapp.R.id.Mood);
        //Mood1Head = (TextView) findViewById(ibotbuilders.physicianapp.R.id.mood1);
        //Mood2Head = (TextView) findViewById(ibotbuilders.physicianapp.R.id.mood2);
        Mood.setBackgroundColor(Color.GREEN);
        Mood.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),moodb.class);
                startActivity(i);
            }
        });


    }


}
