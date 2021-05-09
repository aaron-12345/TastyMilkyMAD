package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class test1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
    }

    public void test2(View view) {
        Intent intent=new Intent(this,test2.class);
        startActivity(intent);
    }

    public void Master(View view) {
        Intent intent=new Intent(this,test2.class);
        startActivity(intent);
    }
}