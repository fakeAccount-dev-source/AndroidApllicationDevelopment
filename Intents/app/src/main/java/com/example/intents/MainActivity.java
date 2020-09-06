package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Uri u= Uri.parse("tel:9852741096");
        Intent i =new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);
    }

    public void OpenURL(View view) {
        Uri u = Uri.parse("https://www.google.com");
        Intent i =new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }

    public void OpenMaps(View view) {
        Uri u = Uri.parse("geo:17.3984,78.5583 ?q=restaurants");
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}