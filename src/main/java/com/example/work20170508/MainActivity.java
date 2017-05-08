package com.example.work20170508;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Neifangwaiyuan yuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yuan = (Neifangwaiyuan) findViewById(R.id.v);
        yuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag1","1234");
            }
        });
        yuan.setOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag2","12345");
            }
        });
    }
}
