package com.example.freakingmath08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mTxtSoThu1,mTxtSoThu2,mTxtPhepTinh,mTxtKetQua;
    ImageButton mImgDung,mImgSai;
    Random mRandom;
    int mRandomSt1 = 0;
    int mRandomSt2 = 0;
    int mIndexPhepTinh = 0;
    int mKetqua = 0;
    boolean mIsTrue = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mapView();
        event();
    }
    private void init() {
        // findviewby
        mTxtSoThu1 = findViewById(R.id.textviewSothu1);
        mTxtSoThu2 = findViewById(R.id.textviewSothu2);
        mTxtPhepTinh = findViewById(R.id.textviewPheptinh);
        mTxtKetQua = findViewById(R.id.textviewKetqua);
        mImgDung = findViewById(R.id.imagebuttonTrue);
        mImgSai = findViewById(R.id.imagebuttonFalse);

        // Create random
        mRandom = new Random();
    }
    private void mapView() {
        //Handle random caculator
        handleRandom();
    }
    private void handleRandom() {
        mRandomSt1 = mRandom.nextInt(9) + 1;
        mRandomSt2 = mRandom.nextInt(9) + 1;
        mIndexPhepTinh = mRandom.nextInt(4);
        mIsTrue = mRandom.nextBoolean();

        switch (mIndexPhepTinh){
            case 0 : mKetqua = mRandomSt1 + mRandomSt2;
                mTxtPhepTinh.setText("+");
                break;
            case 1 : mKetqua = mRandomSt1 - mRandomSt2;
                mTxtPhepTinh.setText("-");
                break;
            case 2 : mKetqua = mRandomSt1 / mRandomSt2;
                mTxtPhepTinh.setText("/");
                break;
            default : mKetqua = mRandomSt1 * mRandomSt2;
                mTxtPhepTinh.setText("*");
                break;
        }
        if (!mIsTrue){
            mKetqua += mRandom.nextInt(5);
        }
        mTxtSoThu1.setText(mRandomSt1 + "");
        mTxtSoThu2.setText(mRandomSt2 + "");
        mTxtKetQua.setText(" = " + mKetqua );
    }

    private void event() {
        // callback
        mImgDung.setOnClickListener(MainActivity.this);
        mImgSai.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imagebuttonTrue :
                Toast.makeText(this, "Button true", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagebuttonFalse:
                Toast.makeText(this, "Button false", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
