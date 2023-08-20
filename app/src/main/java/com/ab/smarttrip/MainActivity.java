package com.ab.smarttrip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ab.smarttrip.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().replace(R.id.mainlayout,new splash()).commit();
    }
}