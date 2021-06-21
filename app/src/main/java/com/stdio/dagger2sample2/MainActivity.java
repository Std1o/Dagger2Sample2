package com.stdio.dagger2sample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App)getApplication()).getAppComponent()
                .inject(this);
        setContentView(R.layout.activity_main);
        TextView textview = findViewById(R.id.textview);
        textview.setText(presenter.getDateString());
    }
}