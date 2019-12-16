package com.geekbrains.a1l7_materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    TextInputEditText login;
    TextInputEditText password;
    MaterialButton button;

    // Регулярные выражения позволяют проверить на соответствие шаблону
    // Это имя. Первая буква большая латинская, остальные маленькие латинские
    Pattern checkLogin = Pattern.compile("^[A-Z][a-z]{2,}$");
    // Это пароль, минимум 6 символов, обязательны маленькая буква, большая буква, цифра
    Pattern checkPassword = Pattern.compile("^(?=^.{6,}$)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.inputLoginName);
        password = findViewById(R.id.inputPassword);
        button = findViewById(R.id.button);

        // Чтобы не докучать пользователю при вводе каждой буквы, сделаем проверку при потере фокуса
        // Как только фокус потерян, сразу проверяем на валидность данные
        login.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) return;
            TextView tv = (TextView) v;
            // Это сама валидация, она вынесена в отдельный метод, чтобы не дублировать код
            // см вызов ниже
            validate(tv, checkLogin, "Это не имя!");
        });

        // Пароль тоже проверим при потере фокуса
        password.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) return;
            TextView tv = (TextView) v;
            // Валидация, почти точно такая же, как и в поле логина
            validate(tv, checkPassword, "Пароль слишком простой!");
        });

        //Откроем вторую активи при нажатии на кнопку
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,
                    CoordinatorLayoutActivity.class);
            startActivity(intent);
        });
    }

    // Валидация
    private void validate(TextView tv, Pattern check, String message){
        String value = tv.getText().toString();
        if (check.matcher(value).matches()){    // Проверим на основе регулярных выражений
            hideError(tv);
        }
        else{
            showError(tv, message);
        }
    }

    // Показать ошибку
    private void showError(TextView view, String message) {
        view.setError(message);
    }

    // спрятать ошибку
    private void hideError(TextView view) {
        view.setError(null);
    }

}
