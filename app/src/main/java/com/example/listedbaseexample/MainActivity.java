package com.example.listedbaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // Set data initialization
    ListView simpleList;
    String[] countryList = {
            "India",
            "China",
            "Australia",
            "Portugal",
            "America",
            "New Zealand"
    };

    int []flags = {
            R.drawable.india,
            R.drawable.china,
            R.drawable.australia,
            R.drawable.portugal,
            R.drawable.america,
            R.drawable.new_zealand
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dev code line
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(
                getApplication(),
                countryList,
                flags
        );
        simpleList.setAdapter(customAdapter);
    }
}