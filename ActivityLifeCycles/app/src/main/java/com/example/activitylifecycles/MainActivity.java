package com.example.activitylifecycles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextview=findViewById(R.id.tv);
        mTextview.append("onCreate()\n");
        Log.i("MainActivity","onCreate()");
        Toast.makeText(this,"App is Created",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mTextview.append("onStart()\n");
        Log.i("MainActivity","onStart()");
        Toast.makeText(this,"App is Started",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mTextview.append("onResume()\n");
        Log.i("MainActivity","onResume()");
        Toast.makeText(this,"App is Resumed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mTextview.append("onPause()\n");
        Log.i("MainActivity","onPause()");
        Toast.makeText(this,"App is Paused",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mTextview.append("onStop()\n");
        Log.i("MainActivity","onStop()");
        Toast.makeText(this,"App is Stoped",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTextview.append("onDestroy()\n");
        Log.i("MainActivity","onDestroy()");
        Toast.makeText(this,"App is Destroyed",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mTextview.append("onRestart()\n");
        Log.i("MainActivity","onRestart()");
        Toast.makeText(this,"App is Re-Started",Toast.LENGTH_SHORT).show();
    }
}