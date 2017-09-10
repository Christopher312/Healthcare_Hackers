package com.buttoncolor.adamrichter.githubcopy;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.transition.Transition;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class moodslider extends AppCompatActivity {

    Button submit;
    private DatabaseReference mDatabase;
    SeekBar slider;
    ImageButton sliderMoodb;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodslider);
        slider = (SeekBar)findViewById(R.id.slider);


        //final String presMoods = intent.getExtras().getString("sendPresMoods");
        submit = (Button)findViewById(R.id.submit);

        submit.setBackgroundColor(Color.rgb(50,205,50));

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent startingIntent = getIntent();
                String sent = startingIntent.getStringExtra("sendPresMoods");
                int progress = slider.getProgress();
                //Intent intent = new Intent(this, DisplayMessageActivity.class);
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                //intent.putExtra(EXTRA_MESSAGE, message);
                //startActivity(intent);
                long millis = new Date().getTime();
                String strLong = Long.toString(millis);



                mDatabase = FirebaseDatabase.getInstance().getReference();

                //mDatabase.child("Adam Smith").child("mood_list").child(strLong).child("moods_selected").setValue(sent);
                mDatabase.child("Adam Smith").child("mood_list").child(strLong).child("mood_rating").setValue(Integer.toString(progress));
                mDatabase.child("Adam Smith").child("mood_list").child(strLong).child("comment").setValue(message);


                Intent i = new Intent(getApplicationContext(), points.class);
                startActivity(i);



                                      }
                                  }
        );





        sliderMoodb = (ImageButton)findViewById(R.id.sliderMoodb);
        sliderMoodb.setOnClickListener(new View.OnClickListener(){
                                           public void onClick(View v){
                                               Intent i = new Intent(getApplicationContext(),moodb.class);
                                               startActivity(i);
                                           }
                                       }
        );


    }

    public void sendMessage(View view) {





    }

}
