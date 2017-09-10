package ibotbuilders.healthcarehackers;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class profile extends AppCompatActivity {

    SeekBar seekBar;
    double progressSeek = 0;
    ImageButton profileMain;
    Drawable[] levels = new Drawable[5];
    ImageView levelIm;
    TextView target, total, now;
    static int goal = 30, current = 0, level = 1, inAll = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(100);
        current +=10;
        target = (TextView)findViewById(R.id.goal);
        total = (TextView)findViewById(R.id.total);
        now = (TextView)findViewById(R.id.points);
        levelIm = (ImageView)findViewById(R.id.level);
        profileMain = (ImageButton) findViewById(R.id.profileMain);
        profileMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        }
        );
        Resources res = getResources();
        levels[0] = res.getDrawable(R.drawable.one);
        levels[1] = res.getDrawable(R.drawable.two);
        levels[2] = res.getDrawable(R.drawable.three);
        levels[3] = res.getDrawable(R.drawable.four);
        levels[4] = res.getDrawable(R.drawable.five);
        if(current < goal)
        {
            levelIm.setImageDrawable(levels[level-1]);

        }
        else
        {
            level++;
            current = 0;
            goal += 20;


            levelIm.setImageDrawable(levels[level-1]);

        }
        inAll+=10;
        total.setText(""+inAll);
        now.setText(""+current);
        target.setText(""+goal);
        progressSeek = (current*100)/goal;
        seekBar.setProgress( (int) (progressSeek) );



    }

}
