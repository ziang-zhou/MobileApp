package com.example.impulseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImpulseAppMain extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Activate purchase buttons
        // Add
        Button addPurchaseButton = (Button) findViewById(R.id.addPurchaseBtn);

        addPurchaseButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ImpulseAppMain.this, AddPurchase.class));
            };
        });

        // Plan
        Button planPurchaseButton = (Button) findViewById(R.id.planPurchaseBtn);

        planPurchaseButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ImpulseAppMain.this, PlanPurchase.class));
            };
        });
        // activate profile button
        Button viewProfileButton = (Button) findViewById(R.id.myProfileBtn);

        viewProfileButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ImpulseAppMain.this, ViewProfile.class));
            };
        });



        // Send Graph tap to history page


    }


}
