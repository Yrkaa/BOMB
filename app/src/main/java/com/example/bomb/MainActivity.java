package com.example.bomb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean playingFirst = true;

    //Проигрыватель звука бомбы
    MediaPlayer bombPlayer;

    //Переменные кодов
    String userCode = "";
    String code = "";

    //Объявление переменных разметки
    TextView codeTv;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Инициализация переменных разметки
        codeTv = findViewById(R.id.code_tv);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);
        b5 = findViewById(R.id.btn_5);
        b6 = findViewById(R.id.btn_6);
        b7 = findViewById(R.id.btn_7);
        b8 = findViewById(R.id.btn_8);
        b9 = findViewById(R.id.btn_9);

        //Задаем рандомный код

        Random random = new Random();
        int n1 = random.nextInt(9)+1;
        int n2 = random.nextInt(9)+1;
        int n3 = random.nextInt(9)+1;
        int n4 = random.nextInt(9)+1;
        code = code + String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4);
        codeTv.setText(codeTv.getText()+code);

        //Получаем код пользователя
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b1.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b2.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b3.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b4.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b5.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b6.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b7.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b8.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userCode.length() < 4)
                    addSymbol(b9.getText().toString());
                if(userCode.length() == 4)
                    checkUserCode();
            }
        });


    }

    private void checkUserCode() {
        if(code.equals(userCode)){

            bombPlayer = MediaPlayer.create(this, R.raw.bomb_sound_2);
            if (playingFirst)
                bombPlayer.start();
            if(bombPlayer.isPlaying())
                playingFirst = false;
        }

        else
            this.finish();
    }

    private void addSymbol(String s) {
        userCode += s;
        codeTv.setTextColor(Color.BLACK);
        codeTv.setText(userCode);
        MediaPlayer clickSound = MediaPlayer.create(this, R.raw.btn_click);
        clickSound.start();
    }
}