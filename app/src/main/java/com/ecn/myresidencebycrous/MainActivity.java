package com.ecn.myresidencebycrous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchLogin(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void launchCreationcompte(View view) {
        Intent intent = new Intent(this, CreerCompte.class);
        startActivity(intent);
    }
}