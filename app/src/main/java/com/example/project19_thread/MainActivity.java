package com.example.project19_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bt(View view) {
        try{
            // delay 1 second
            Thread.sleep(2000);
            run();
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    private void run() {
        tv = findViewById(R.id.textview);
        tv.setText("Got it");
    }

}
