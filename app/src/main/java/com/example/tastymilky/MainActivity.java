package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button but;
    private Button but2;
    private Context con1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = findViewById(R.id.but);

        but2 = findViewById(R.id.but2);
        con1 = this;

    }

    public void CashOnDelivery(View view) {
        Intent intent=new Intent(con1,CashOnDelivery.class);
        startActivity(intent);
    }

    public void test1(View view) {
        Intent intent=new Intent(con1,test1.class);
        startActivity(intent);


    }
}