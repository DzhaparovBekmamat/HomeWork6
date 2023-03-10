package com.geektech.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.edit_text);
        Button button = findViewById(R.id.btn);

// Установите слушатель текста для EditText
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Не нужно ничего делать здесь
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Если текст в EditText не пустой, измените цвет кнопки на красный, иначе на серый

                //  button.setBackgroundColor(getResources().getColor(R.color.dark_grey));
                if (!editText.getText().toString().equals("")) {
                    button.setBackgroundResource(R.drawable.rounded_object_orange);
                } else {
                    button.setBackgroundResource(R.drawable.rounded_object);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
    }
}