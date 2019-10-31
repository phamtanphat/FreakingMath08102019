package com.example.freakingmath08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();

        for (int i = 0 ; i<= 30 ; i++){
            int number = random.nextInt(max - min + 1) + min;
            Log.d("BBB",number + "");

        }

//        Context => Truyen ten man hinh vao
//                    => this
        // cac xem tham so trong method : ctrl + P
        // phim goi y code : ctrl + space
//        Toast.makeText(this,number + "" , Toast.LENGTH_SHORT).show();
    }
}
