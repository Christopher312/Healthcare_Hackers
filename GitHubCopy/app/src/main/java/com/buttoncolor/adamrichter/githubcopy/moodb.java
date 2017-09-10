package com.buttoncolor.adamrichter.githubcopy;

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
import android.widget.ImageView;

public class moodb extends AppCompatActivity {
    Button enButton, sadButton, angButton, unButton, feButton, disButton, submit;
    ImageView enImage, sadImage, angImage, unImage, feImage, disImage;
    ImageButton moodbMain;
    int element=0;
    String[] modsPres={};
    boolean en = false, sad = false, ang = false, un = false, fe = false,dis = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodb);
        addListenerOnButtonHappy();
        addListenerOnButtonSad();
        addListenerOnButtonUncertain();
        addListenerOnButtonAngry();
        addListenerOnButtonFear();
        addListenerOnButtonDisgust();
        if(en==true)
        {
            modsPres[element] = "Joy";
            element++;
        }
        if(sad==true)
        {
            modsPres[element] = "Sadness";
            element++;
        }
        if(ang==true)
        {
            modsPres[element] = "Anger";
            element++;
        }
        if(fe==true)
        {
            modsPres[element] = "Fear";
            element++;
        }
        if(dis==true)
        {
            modsPres[element] = "Disgust";
            element++;
        }
        if(un==true)
        {
            modsPres[element] = "Uncertain";
            element++;
        }
        String presMoods = null;
        for(int i=0;i<element;i++)
        {
            presMoods = presMoods+","+modsPres[i];
        }
        submit = (Button)findViewById(R.id.next);
        submit.setBackgroundColor(Color.rgb(50,205,50));

        Intent i = new Intent(this, moodslider.class);
        i.putExtra("sendPresMoods", presMoods);

        submit.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View v){

                                          Intent w = new Intent(getApplicationContext(),moodslider.class);
                                          startActivity(w);
                                      }
                                  }
        );
        moodbMain = (ImageButton)findViewById(R.id.moodbMain);
        moodbMain.setOnClickListener(new View.OnClickListener(){
                                         public void onClick(View v){
                                             Intent i = new Intent(getApplicationContext(),MainActivity.class);
                                             startActivity(i);
                                         }
                                     }
        );
    }
    public void addListenerOnButtonHappy()
    {
        enImage = (ImageView)findViewById(R.id.enImage);
        enButton = (Button)findViewById(R.id.enButton);
        enButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(en == false) {
                    enImage.setImageResource(R.drawable.enjoy2);
                    en = true;
                }
                else
                {
                    enImage.setImageResource((R.drawable.happy));
                    en=false;
                }
            }
        });
    }
    public void addListenerOnButtonSad()
    {
        sadImage = (ImageView)findViewById(R.id.sadImage);
        sadButton = (Button)findViewById(R.id.sadButton);
        sadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(sad == false) {
                    sadImage.setImageResource(R.drawable.picksad);
                    sad = true;
                }
                else
                {
                    sadImage.setImageResource((R.drawable.sad));
                    sad=false;
                }
            }
        });
    }
    public void addListenerOnButtonUncertain()
    {
        unImage = (ImageView)findViewById(R.id.unImage);
        unButton = (Button)findViewById(R.id.unButton);
        unButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(un == false) {
                    unImage.setImageResource(R.drawable.pickun);
                    un = true;
                }
                else
                {
                    unImage.setImageResource((R.drawable.uncertain));
                    un=false;
                }
            }
        });
    }
    public void addListenerOnButtonAngry()
    {
        angImage = (ImageView)findViewById(R.id.angImage);
        angButton = (Button)findViewById(R.id.angButton);
        angButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(ang == false) {
                    angImage.setImageResource(R.drawable.pickang);
                    ang = true;
                }
                else
                {
                    angImage.setImageResource((R.drawable.anger));
                    ang=false;
                }
            }
        });
    }
    public void addListenerOnButtonFear()
    {
        feImage = (ImageView)findViewById(R.id.feImage);
        feButton = (Button)findViewById(R.id.feButton);
        feButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(fe == false) {
                    feImage.setImageResource(R.drawable.pickfe);
                    fe = true;
                }
                else
                {
                    feImage.setImageResource((R.drawable.fear));
                    fe=false;
                }
            }
        });
    }
    public void addListenerOnButtonDisgust()
    {
        disImage = (ImageView)findViewById(R.id.disImage);
        disButton = (Button)findViewById(R.id.disButton);
        disButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(dis == false) {
                    disImage.setImageResource(R.drawable.pickdis);
                    dis = true;
                }
                else
                {
                    disImage.setImageResource((R.drawable.disgust));
                    dis=false;
                }
            }
        });
    }

}

