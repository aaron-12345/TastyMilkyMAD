package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CardPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_pay);
    }

    public void CardDetails(View view) {
        Intent intent=new Intent(this,CardDetails.class);
        startActivity(intent);
    }
}