package com.example.tastymilky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class test2 extends AppCompatActivity {
    private EditText tb1,tb2,tb3,tb4,d1,d2;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        tb1 = findViewById(R.id.tb1);
        tb2 = findViewById(R.id.tb2);
        tb3 = findViewById(R.id.tb3);
        tb4 = findViewById(R.id.tb4);

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);

        button3 = findViewById(R.id.button3);


    }

    public void End(View view) {
        Intent intent=new Intent(this,EndPay.class);
        startActivity(intent);




    }


}