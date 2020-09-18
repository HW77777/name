package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = findViewById(R.id.textView);
        tx.setText("Hello");


    }
    public  void  abc (View v){
        EditText a= findViewById(R.id.edittext);
        double tem = Double.valueOf(a.getText().toString());
        double b=tem*1.8+32;
        a.setText(String.valueOf(b));

    }
}