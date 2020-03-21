package com.example.impulsetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> myArray = new ArrayList<>();

    /** Called when the user touches the button */
    public void addItem(View view) {
        // Do something in response to button click
        TextView text=(TextView)findViewById(R.id.textView);
        EditText dateText = (EditText)findViewById(R.id.dateText);
        EditText costText = (EditText)findViewById(R.id.costText);
        EditText descText = (EditText)findViewById(R.id.descText);
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_main,myArray);
        text.append (dateText.getEditableText().toString() + " " +
                costText.getEditableText().toString() + " " +
                descText.getEditableText().toString() + "\n");
        //list.setAdapter(adapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


