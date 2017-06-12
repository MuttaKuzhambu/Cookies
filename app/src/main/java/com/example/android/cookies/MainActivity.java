package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.cookies.R.id.before;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eat(View view){
        ImageView beforeImage = (ImageView) findViewById(R.id.cookie);
        beforeImage.setImageResource(R.drawable.after_cookie);
        TextView beforeText = (TextView) findViewById(R.id.before);
        beforeText.setText("I Am Full :)");
    }
    public void reset(View view){
        ImageView beforeImage = (ImageView) findViewById(R.id.cookie);
        beforeImage.setImageResource(R.drawable.before_cookie);
        TextView beforeText = (TextView) findViewById(R.id.before);
        beforeText.setText("I Am So Hungry :(");
    }
}
