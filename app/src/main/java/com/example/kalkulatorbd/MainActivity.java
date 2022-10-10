package com.example.kalkulatorbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Fragment1(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment1()).commit();
    }

    public void Fragment2(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment2()).commit();
    }

    public void Fragment3(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment3()).commit();
    }

    @Override
    protected void onStart(){
        super.onStart();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Fragment1()).commit();
    }
}