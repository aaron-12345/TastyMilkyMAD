package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CardDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_details);
    }
    public void EndPay(View view) {
        Intent intent=new Intent(this,EndPay.class);
        startActivity(intent);
    }
}