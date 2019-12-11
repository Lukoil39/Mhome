package com.example.myapplication13;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity implements Constants{
    private ArrayList<String> selection = new ArrayList<String>();

    Button update;
    TextView display;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        display = findViewById(R.id.display);
        str = display.getText().toString();

        Toast.makeText(getApplicationContext(),"Second - onCreate()", Toast.LENGTH_SHORT).show();

        String text = getIntent().getExtras().getString(TEXT); // получить данные из Intent
        TextView textView = findViewById(R.id.gorod);
        textView.setText(text); // Сохранить их в TextView




        Button backToFirstActivity = findViewById(R.id.buttonBack);

        update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()) {
                    case R.id.to_history:
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        startActivity(intent);

                }


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

        backToFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Second - onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Second - onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Second - onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Second - onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Second - onRestart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Second - onDestroy()", Toast.LENGTH_SHORT).show();
    }
}


