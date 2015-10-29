package com.example.yomac_000.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_display_message);
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
//        // Create the text view
//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(message);
//        // Set the text view as the activity layout
//        setContentView(textView);


        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.hello_world);
        // Or supply a string resource to a method that requires a string
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
        setContentView(textView);
    }
}
