package com.example.mini_project_1_christian_geoca;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    private static final String[] WORDS ={"Cow","Goat","Chicken"};
    //private static final String[] CLAS ={"Mammal","Bird","Amphibian"};
    public static String ans = "none";


    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);

        TextView top=findViewById(R.id.top);

        Intent forwardIntent = getIntent();
        String extra = forwardIntent.getStringExtra("animal");
        ImageView img = (ImageView) findViewById(R.id.myimg);

        if (extra.equals(WORDS[0])) {
            img.setImageResource(R.drawable.cow);
            mp = MediaPlayer.create(this,R.raw.moo);
            mp.start();
            ans = "cow";
            top.setText("cow");

        }

        if (extra.equals(WORDS[1])) {
            img.setImageResource(R.drawable.goat);
            mp = MediaPlayer.create(this,R.raw.goat_sound);
            mp.start();
            ans = "goat";
            top.setText("goat");
        }

        if (extra.equals(WORDS[2])) {
            img.setImageResource(R.drawable.chicken);
            mp = MediaPlayer.create(this,R.raw.chicken_sound);
            mp.start();
            ans = "chicken";
            top.setText("chicken");
        }
    }

    public void myclick (View view){

       // EditText anstxt = (EditText) findViewById(R.id.myans);
        mp.stop();
        //Returning the answer back to the calling activity
        Intent backIntent = new Intent();
        // ans = anstxt.getText().toString();
        backIntent.putExtra("family", ans);
        setResult(RESULT_OK, backIntent);
        finish();
    }
}

