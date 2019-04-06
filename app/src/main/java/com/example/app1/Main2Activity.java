package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private int mCounter= 0;
    private TextView txtCountValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    @Override
    public void onClick(View v) {

    }
}
