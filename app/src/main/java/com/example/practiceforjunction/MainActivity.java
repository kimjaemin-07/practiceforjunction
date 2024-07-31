package com.example.practiceforjunction;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // activity_main.xml 레이아웃 파일을 설정합니다.
        setContentView(R.layout.demo);
    }
}