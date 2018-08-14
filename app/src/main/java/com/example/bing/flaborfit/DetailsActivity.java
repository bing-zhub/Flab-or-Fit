package com.example.bing.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView title = (TextView)findViewById(R.id.titleView);
        ImageView image = (ImageView)findViewById(R.id.imageView);
        LinearLayout mainBackground = (LinearLayout)findViewById(R.id.mainBackground);

        String exerTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

        title.setText(exerTitle);

        if(exerTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)){
            image.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBackground.setBackgroundColor(Color.parseColor("#2ac5f5"));
        }else if(exerTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            image.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            mainBackground.setBackgroundColor(Color.parseColor("#cccccc"));
        }else if(exerTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGO)){
            image.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            mainBackground.setBackgroundColor(Color.parseColor("#aaaaaa"));
        }

    }
}
