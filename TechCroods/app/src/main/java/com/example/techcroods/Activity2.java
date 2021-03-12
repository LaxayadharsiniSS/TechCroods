package com.example.techcroods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        create = (Button)findViewById(R.id.button);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Account created successfully",Toast.LENGTH_LONG).show();
                Intent login = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(login);
            }
        });
    }
}