package com.example.impulse_tracker;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.RequiresApi;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.example.impulse_tracker.ui.main.SectionsPagerAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void addItem(View view) {
        // Do something in response to button click
        TableLayout table = findViewById(R.id.itemTable);
        TableRow tr = new TableRow(this);

        TextView dateText=(TextView)findViewById(R.id.dateText);
        TextView costText=(TextView)findViewById(R.id.costText);
        TextView descText=(TextView)findViewById(R.id.descText);
        TextView storeText=(TextView)findViewById(R.id.storeText);

        TextView col1 = new TextView(this);
        formatCell(dateText, col1);
        TextView col2 = new TextView(this);
        formatCell(costText, col2);
        TextView col3 = new TextView(this);
        formatCell(descText, col3);
        TextView col4 = new TextView(this);
        formatCell(storeText, col4);
        // Add a checkbox in the third column.

        CheckBox checkBox = new CheckBox(this);
        //checkBox.setText("Select");
        tr.addView(checkBox);
        checkBox.setBackgroundColor(Color.WHITE);
        checkBox.setGravity(Gravity.CENTER);

        tr.setLayoutParams(new TableRow.LayoutParams(MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

        tr.addView(col1);
        tr.addView(col2);
        tr.addView(col3);
        tr.addView(col4);

        table.addView(tr);


    }


    public void delItem(View view) {
        List<Integer> deleteRowNumberList = new ArrayList<Integer>();
        TableLayout table = findViewById(R.id.itemTable);
        int rowCount = table.getChildCount();
        for (int i = 0; i< rowCount; i++) {
            View rowView = table.getChildAt(i);

            if (rowView instanceof TableRow) {
                TableRow tableRow = (TableRow) rowView;

                // Get row column count.
                int columnCount = tableRow.getChildCount();

                View columnView = tableRow.getChildAt(0);
                if (columnView instanceof CheckBox) {
                    // If columns is a checkbox and checked then save the row number in list.
                    CheckBox checkboxView = (CheckBox) columnView;
                    if (checkboxView.isChecked()) {
                        deleteRowNumberList.add(i);
                        checkboxView.setChecked(false);
                    }
                }
            }
        }

        Collections.sort(deleteRowNumberList, Collections.<Integer>reverseOrder());
        // Remove all rows by the selected row number.
        for(int rowNumber :deleteRowNumberList)
        {
            table.removeViewAt(rowNumber);
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void formatCell(TextView cellText, TextView col) {
        col.setText(cellText.getText());
        col.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL), Typeface.BOLD);
        col.setGravity(Gravity.CENTER);
        col.setBackgroundColor(Color.WHITE);
        col.setHeight(60);
        col.setTextAppearance(android.R.style.TextAppearance_Large);
        //col.setOnClickListener(this.delItem(?));
    }
}