package com.example.jparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jparsing.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    class  fetchData extends Thread{
        @Override
        public void run() {
            super.run();
        }
    }
}