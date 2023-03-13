package com.geektech.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private TextView textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        editText2 = findViewById(R.id.edit_text_2);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.vviz);
        textView2 = findViewById(R.id.zp);


        button.setOnClickListener(view -> {
            String login = editText.getText().toString();
            String password = editText2.getText().toString();
            if (login.equals("admin") && password.equals("admin")) {
                Toast.makeText(MainActivity.this, "Вы успешно авторизовались", Toast.LENGTH_SHORT).show();
                editText.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
            } else {
                Toast.makeText(MainActivity.this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
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