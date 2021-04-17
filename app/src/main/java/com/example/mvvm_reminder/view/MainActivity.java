package com.example.mvvm_reminder.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvm_reminder.R;
import com.example.mvvm_reminder.databinding.ActivityMainBinding;
import com.example.mvvm_reminder.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);


    }
}