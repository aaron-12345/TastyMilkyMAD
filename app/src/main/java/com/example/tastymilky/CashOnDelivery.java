package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CashOnDelivery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_on_delivery);
    }
    public void CardDetails(View view) {
        Intent intent=new Intent(this,CardDetails.class);
        startActivity(intent);
    }

    public void toast2(View view) {
            Toast.makeText(CashOnDelivery.this,"success",Toast.LENGTH_SHORT).show();
        }



}
