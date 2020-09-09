package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText result;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button plus;
    private Button four;
    private Button five;
    private Button six;
    private Button minus;
    private Button one;
    private Button two;
    private Button three;
    private Button multi;
    private Button clear;
    private Button zero;
    private Button equal;
    private Button slash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}