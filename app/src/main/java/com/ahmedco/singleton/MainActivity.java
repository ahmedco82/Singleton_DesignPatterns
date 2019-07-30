package com.ahmedco.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.singleton.example1.Singleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Example1();
    }

    private void Example1() {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance("Ahmed");
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance("Hassn");
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance("Alli");
        // changing variable of instance x
        System.out.println("String from x is " + x);
    }
}



