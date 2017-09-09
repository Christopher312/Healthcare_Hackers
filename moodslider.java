package ibotbuilders.physicianapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class moodslider extends AppCompatActivity {
    Button submit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodslider);
        submit2 = (Button) findViewById(R.id.submit2);
        submit2.setBackgroundColor(Color.rgb(50,205,50));


            }


}
