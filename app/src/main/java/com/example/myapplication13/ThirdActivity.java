package com.example.myapplication13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements Constants {
    private ArrayList<String> selection = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Toast.makeText(getApplicationContext(),"Third - onCreate()", Toast.LENGTH_SHORT).show();

        String text = getIntent().getExtras().getString(TEXT); // получить данные из Intent
        TextView textView = findViewById(R.id.gorod);
        textView.setText(text); // Сохранить их в TextView


    }
}