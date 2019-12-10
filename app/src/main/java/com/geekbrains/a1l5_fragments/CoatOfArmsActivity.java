package com.geekbrains.a1l5_fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class CoatOfArmsActivity extends AppCompatActivity {

    Button update;
    TextView display;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coatofarms);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Если устройство перевернули в альбомную ориентацию, то надо эту activity закрыть
            finish();
            return;
        }

        display = findViewById(R.id.display);
        str = display.getText().toString();


        Button backToFirstActivity = findViewById(R.id.update);
        update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer stringBuffer = new StringBuffer();
                if (((CheckBox)findViewById(R.id.oblako)).isChecked()) {
                    stringBuffer.append("Облачно");

                }
                if (((CheckBox)findViewById(R.id.vlaga)).isChecked()) {
                    stringBuffer.append("    90%");
                }

                display.setText(str + stringBuffer);
            }


        });
    }
}
