package ibotbuilders.healthcarehackers;

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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class moodslider extends AppCompatActivity {

    Button submit;

    ImageButton sliderMoodb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodslider);

        submit = (Button)findViewById(R.id.submit);

        submit.setBackgroundColor(Color.rgb(50,205,50));

            submit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {


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

}

