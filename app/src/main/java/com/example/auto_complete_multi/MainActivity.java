package com.example.auto_complete_multi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private MultiAutoCompleteTextView mactv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mactv = findViewById(R.id.Multi_auto);
        String[] str = getResources().getStringArray(R.array.names);
        ArrayAdapter apt = new ArrayAdapter(this, R.layout.my_layout, str);
        mactv.setAdapter(apt);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
