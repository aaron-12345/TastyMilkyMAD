package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

public class EndPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_pay);
    }

    public void toast1(View view) {
        Toast.makeText(EndPay.this,"success",Toast.LENGTH_LONG).show();
    }
}