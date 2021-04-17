package com.example.mvvm_reminder.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_reminder.model.ModelData;

public class MainViewModel extends ViewModel {
    public MutableLiveData <String> etTitle = new MutableLiveData<>();
    public MutableLiveData <String> etDate = new MutableLiveData<>();
    public MutableLiveData <String> etWaktu = new MutableLiveData<>();
    private MutableLiveData <ModelData> modelDataMutableLiveData;


}
